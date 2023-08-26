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
        //TODO 增加用户不可上传脚本文件的功能
        final String file = fileName.getOriginalFilename();//TODO
        if (!fileName.isEmpty()) {
            fileName.transferTo(
               new File(request.getServletContext().getRealPath("save"+File.separator+fileName.getOriginalFilename())
               )
            );
            return "success";
        }
        else{
            return "";//TODO 这里添加逻辑若用户上传文件为空,提示用户上传文件不得为空
        }

    }
}
