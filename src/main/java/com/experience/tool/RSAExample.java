package com.experience.tool;

import java.security.*;
import javax.crypto.Cipher;
import java.util.Base64;

public class RSAExample {

    public static void main(String[] args) throws Exception {
        // 1. 生成RSA密钥对
        KeyPair keyPair = generateKeyPair();

        // 2. 获取公钥和私钥
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // 3. 原信息
        String originalMessage1 = "Hel, RSA Encryption!";
        String originalMessage2 = "Anter mesage for RSA!";

        // 4. 使用公钥加密信息
        String encryptedMessage1 = encrypt(originalMessage1, publicKey);
        String encryptedMessage2 = encrypt(originalMessage2, publicKey);

        // 5. 使用私钥解密信息
        String decryptedMessage1 = decrypt(encryptedMessage1, privateKey);
        String decryptedMessage2 = decrypt(encryptedMessage2, privateKey);

        // 6. 输出结果
        System.out.println("原信息1: " + originalMessage1);
        System.out.println("原信息2: " + originalMessage2);
        System.out.println("公钥: " + getPublicKeyAsString(publicKey));
        System.out.println("私钥: " + getPrivateKeyAsString(privateKey));
        System.out.println("加密后的信息1: " + encryptedMessage1);
        System.out.println("加密后的信息2: " + encryptedMessage2);
        System.out.println("解密后的信息1: " + decryptedMessage1);
        System.out.println("解密后的信息2: " + decryptedMessage2);
    }

    // 生成RSA密钥对
    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048); // 使用2048位的RSA密钥
        return keyPairGenerator.generateKeyPair();
    }

    // 使用公钥加密信息
    public static String encrypt(String message, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // 使用私钥解密信息
    public static String decrypt(String encryptedMessage, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes);
    }

    // 获取公钥字符串表示
    public static String getPublicKeyAsString(PublicKey publicKey) {
        return Base64.getEncoder().encodeToString(publicKey.getEncoded());
    }

    // 获取私钥字符串表示
    public static String getPrivateKeyAsString(PrivateKey privateKey) {
        return Base64.getEncoder().encodeToString(privateKey.getEncoded());
    }
}
