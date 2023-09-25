package com.experience.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    private static String PublicKey;
    private static String PrivateKey;

    public static StringBuilder getPublicKey() throws IOException {
        File file = new File("C:\\Users\\汪海洋\\Desktop\\publicKey.properties");
        if (!file.exists()) {
            System.out.println("失败!文件不存在");
            return new StringBuilder("error");
        } else {
            StringBuilder str = new StringBuilder();
            System.out.println("文件内数据");
            FileInputStream is = new FileInputStream("C:\\Users\\汪海洋\\Desktop\\publicKey.properties");
            int data = 0;
            while ((data = is.read()) != -1) {
                str.append((char) data);
            }
            return str;
        }
    }

    public static void setPublicKey(String publicKey) throws IOException {
        File file = new File("C:\\Users\\汪海洋\\Desktop\\publicKey.properties");
        if (!file.exists()) {
            System.out.println("创建文件");
            file.createNewFile();
        } else {
            System.out.println("此文件已存在");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\汪海洋\\Desktop\\publicKey.properties");
            fos.write(publicKey.getBytes("UTF-8"));
            System.out.println("文件已写入");
            fos.flush();
            System.out.println("文件已刷新");
            fos.close();
            System.out.println("此文件已关闭");
        }
    }

    public static String getPrivateKey() throws IOException {
        File file = new File("C:\\Users\\汪海洋\\Desktop\\privateKey.properties");
        if (!file.exists()) {
            System.out.println("失败!文件不存在");
            return "error";
        } else {
            String str = "";
            System.out.println("文件内数据");
            FileInputStream is = new FileInputStream("C:\\Users\\汪海洋\\Desktop\\privateKey.properties");
            int data = 0;
            while ((data = is.read()) != -1) {
                str = str + (char) data;
            }
            return str;
        }
    }

    public static void setPrivateKey(String privateKey) throws IOException {
        File file = new File("C:\\Users\\汪海洋\\Desktop\\privateKey.properties");
        if (!file.exists()) {
            System.out.println("创建文件");
            file.createNewFile();
        } else {
            System.out.println("此文件已存在");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\汪海洋\\Desktop\\privateKey.properties");
            fos.write(privateKey.getBytes("UTF-8"));
            System.out.println("文件已写入");
            fos.flush();
            System.out.println("文件已刷新");
            fos.close();
            System.out.println("此文件已关闭");
        }
    }
}
