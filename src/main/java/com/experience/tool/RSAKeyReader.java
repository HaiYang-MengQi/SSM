package com.experience.tool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RSAKeyReader {
    private static final String CONFIG_FILE = "key.properties";

    public static String getPrivateKey() {
        Properties props = new Properties();
        try (InputStream is = RSAKeyReader.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            props.load(is);
            return props.getProperty("privateKey");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 在其他地方调用
    public static void main(String[] args) {
        String privateKey = RSAKeyReader.getPrivateKey();
        System.out.println("私钥：" + privateKey);
    }
}
