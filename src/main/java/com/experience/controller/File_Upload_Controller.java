package com.experience.controller;

import com.experience.entity.Filestoragedb;
import com.experience.service.File_path_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 此类用于用户上传文件
 * @author 汪海洋
 */
@Controller
public class File_Upload_Controller {
    @Autowired
    File_path_service file_path_service;

    @RequestMapping("/upload")//BETTER 需要增加多重上传功能
    public String upload(MultipartFile fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {

        //TODO 增加用户不可上传脚本文件的功能
        final String fileOriginalName = fileName.getOriginalFilename();//TODO
        System.out.println(fileOriginalName);
        if (!fileName.isEmpty()) {
            fileName.transferTo(
                    new File(request.getServletContext().getRealPath("save" + File.separator + fileOriginalName))
            );
            SimpleDateFormat simpleDateFormat =
                    new SimpleDateFormat("yyyy-MM-dd '/' HH:mm:ss");
            Filestoragedb filestoragedb =
                    new Filestoragedb(
                            fileOriginalName,
                            request.getServletContext().getRealPath("save" + File.separator + fileName.getOriginalFilename()),
                            simpleDateFormat.format(new Date()).toString(),
                            fileName.getSize(),
                            fileName.getContentType());
            System.out.println(filestoragedb.toString());
            file_path_service.getFilePath(filestoragedb);
            return "fileUpload";
        } else {
            return "error";//TODO 这里添加逻辑若用户上传文件为空,提示用户上传文件不得为空
        }

    }
}
