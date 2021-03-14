package com.example.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageEditorResponse {

    @Getter
    @Setter
    static
    class ImageFile {

        public String url;

        public ImageFile(String url) {
            this.url = url;
        }

    }

    private Integer success;

    private ImageFile file;

    public ImageEditorResponse(Integer success, String url) {
        this.success = success;
        this.file = new ImageFile(url);
    }


}
