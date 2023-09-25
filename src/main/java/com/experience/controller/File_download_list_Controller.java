package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Arrays;
import java.util.List;


/**
 * 此类用于将后台可下载列表中所有文件路径以及信息名发送至前台
 * @author 汪海洋
 */
@Controller
public class File_download_list_Controller {//TODO 换成数据库维护
    @RequestMapping( "getFileList")//BETTER 值得更好的
    @ResponseBody
    public List<String> getFileList(HttpServletRequest request){
       String filePath = request.getServletContext().getRealPath("/save");
        File file = new File(filePath);
        if (file.exists()){
            return Arrays.stream(file.list()).toList();
        }
        System.out.println("错误!");
        return null;
    }
}
