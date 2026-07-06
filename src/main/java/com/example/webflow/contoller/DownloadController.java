package com.example.webflow.contoller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@Controller
public class DownloadController {
    @GetMapping("/download")
    public ResponseEntity<Resource> download(){
        File file = new File("/stf/username.csv");

        if(!file.exists()){
            return ResponseEntity.notFound().build();
        }

        Resource resource = new FileSystemResource(file);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"my_local_data.csv\"")
                .header(HttpHeaders.CONTENT_TYPE, "text/csv")
                .body(resource);
    }
}
