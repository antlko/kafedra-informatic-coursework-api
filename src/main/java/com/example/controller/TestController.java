package com.example.controller;

import com.example.response.ImageEditorResponse;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@CrossOrigin
@RestController
public class TestController {

    @Data
    class Entity {
        private String name;
    }

    @GetMapping("/test2")
    public Entity getJSONEntity() {
        Entity entity = new Entity();
        entity.setName("TestName");
        return entity;
    }

    @PostMapping("/uploadFile")
    public ImageEditorResponse uploadFile(@RequestParam MultipartFile image) throws IOException {
        byte[] fileContent = image.getBytes();
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
//        String fileName = Objects.requireNonNull(image.getOriginalFilename());
//
//        Path uploadPath = Paths.get("src/main/resources/images/");
//
//        if (!Files.exists(uploadPath)) {
//            Files.createDirectories(uploadPath);
//        }
//        try (InputStream inputStream = image.getInputStream()) {
//            Path filePath = uploadPath.resolve(fileName);
//            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException ioe) {
//            throw new IOException("Could not save image file: " + fileName, ioe);
//        }

        return new ImageEditorResponse(1, System.getenv("HOST_ADDR") + "image/" + "none");
    }

    @GetMapping(value = "/image/{fileName}")
    public @ResponseBody
    byte[] getImage(@PathVariable String fileName) throws IOException {

//        String uploadPath = Paths.get("src/main/resources/images/") + "/" + fileName;
//
//        File file = new File(uploadPath);
//        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
//
//        InputStream in = resource.getInputStream();
//
//        byte[] targetArray = new byte[in.available()];
//        try {
//            in.read(targetArray);
//        } catch (IOException ioe) {
//            throw new IOException("Could not download image file");
//        } finally {
//            in.close();
//        }
        String fileContentFromDB = "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";
        byte[] decodedBytes = Base64.getDecoder().decode(fileContentFromDB);
        return decodedBytes;
    }

    @GetMapping("/admin/get")
    public String getAdmin() {
        return "Hi admin";
    }

    @GetMapping("/user/get")
    public String getUser() {
        return "Hi user";
    }

}
