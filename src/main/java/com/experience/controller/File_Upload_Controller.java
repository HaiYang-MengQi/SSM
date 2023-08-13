package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class File_Upload_Controller {
    @RequestMapping("/upload")
    public String upload(MultipartFile fileName, HttpServletRequest request) throws IOException {
        fileName.transferTo(
           new File(request.getServletContext().getRealPath("save"+File.separator+fileName.getOriginalFilename())
           )
        );
        return "success";
    }
}
