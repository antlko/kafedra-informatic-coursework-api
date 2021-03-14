package com.example.controller;

import com.example.response.ImageEditorResponse;
import lombok.Data;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

@CrossOrigin
@RestController
public class TestController {


    @Data
    class Entity {
        private String name;
    }

    @GetMapping("/test")
    public Entity getJSONEntity() {
        Entity entity = new Entity();
        entity.setName("TestName");
        return entity;
    }

    @PostMapping("/uploadFile")
    public ImageEditorResponse uploadFile(@RequestParam MultipartFile image) throws IOException {
        String fileName = Objects.requireNonNull(image.getOriginalFilename());

        Path uploadPath = Paths.get("images/");

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try (InputStream inputStream = image.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }

        return new ImageEditorResponse(1, System.getenv("HOST_ADDR") + "image/" + fileName);
    }

    @GetMapping(value = "/image/{fileName}")
    public @ResponseBody
    byte[] getImage(@PathVariable String fileName) throws IOException {

        String uploadPath = System.getProperty("user.dir") + "\\images\\" + fileName;

        File file = new File(uploadPath);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        InputStream in = resource.getInputStream();

        byte[] targetArray = new byte[in.available()];
        try {
            in.read(targetArray);
        } catch (IOException ioe) {
            throw new IOException("Could not download image file");
        } finally {
            in.close();
        }

        return targetArray;
    }

}
