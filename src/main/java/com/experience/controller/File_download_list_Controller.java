package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author 汪海洋
 */
@Controller
public class File_download_list_Controller {//TODO 换成数据库维护
    @RequestMapping( "getFileList")//BETTER 值得更好的
    public Stream<String> getFileList(HttpServletRequest request){
       String filePath = request.getServletContext().getRealPath("/save");
        File file = new File(filePath);
        if (file.exists()){
            Stream<String> stream = Arrays.stream(file.list()).toList().stream();
            stream.forEach(n -> System.out.println(n));
            return stream;
        }
        System.out.println("错误!");
        return null;
    }
}
