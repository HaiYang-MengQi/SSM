package com.experience.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Controller
public class File_Download_Controller {

    @RequestMapping("download")
    public ResponseEntity<byte[]> downloadFile(String fileName, HttpServletRequest request) throws IOException {
        //指定要下载的文件路径
        String path = request.getServletContext().getRealPath("/download"+ File.separator+fileName);
        //创建该文件对象
        File file = new File(path);
        //设置消息头
        HttpHeaders httpHeaders = new HttpHeaders();
        //通知浏览器以下载方式打开文件
        httpHeaders.setContentDispositionFormData("attachment",fileName);
        //定义以流的方式下载返回文件数据
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        System.out.println(path);
        //使用String MVC 框架的ResponseEntity对象封装返回的数据
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),httpHeaders, HttpStatus.OK);
    }
}
