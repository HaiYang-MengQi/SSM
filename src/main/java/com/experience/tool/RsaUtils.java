package com.experience.tool;

import com.experience.entity.RsaKeyPair;
import com.experience.entity.User;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import java.io.IOException;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
//TODO 添加aop切入使得数据库内密码呈现加密状态
//TODO 添加aop切入使得调取用户信息呈现解密状态
//TODO 将私钥添加到privateKey.properties文件中,用来读取私钥信息
//TODO 对privateKey.properties设置权限,禁止其他用户访问
//TODO 证书还需继续下载
@Component("rsaUtils")
public class RsaUtils {

    public static void main(String[] args) throws Exception {
        RsaUtils r = new RsaUtils();
        RsaKeyPair keyPair = generateKeyPair();
        String publicKey = keyPair.getPublicKey();
        String privateKey = keyPair.getPrivateKey();
        //公钥加密,私钥解密
        String userName = r.encryptByPublicKey(keyPair.getPublicKey(),"1234");
        String passWd = r.decryptByPrivateKey(keyPair.getPrivateKey(), userName);
        System.out.println(userName+'\n'+passWd);
        //私钥加密,公钥解密
        String userName2 = r.encryptByPrivateKey(keyPair.getPrivateKey(),"666");
        String passWd2 = r.decryptByPublicKey(keyPair.getPublicKey(), userName2);
        System.out.println("************************");
        System.out.println(userName2+'\n'+passWd2);
    }
    /**
     * 公钥加密
     * @from wlk
     * @param publicKeyText 公钥
     * @param text 待加密的文本
     * @return /
     */
    public  String encryptByPublicKey(String publicKeyText, String text) throws Exception {
        X509EncodedKeySpec x509EncodedKeySpec2 = new X509EncodedKeySpec(Base64.decodeBase64(publicKeyText));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec2);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] result = cipher.doFinal(text.getBytes());
        return Base64.encodeBase64String(result);
    }

    /**
     * 私钥解密
     * @from wlk
     * @param privateKeyText 私钥
     * @param text 待解密的文本
     * @return /
     * @throws Exception /
     */
    public  String decryptByPrivateKey(String privateKeyText, String text) throws Exception {
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec5 = new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKeyText));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec5);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] result = cipher.doFinal(Base64.decodeBase64(text));
        return new String(result);
    }

    /**
     * 私钥加密
     * @from wlk
     * @param privateKeyText 私钥
     * @param text 待加密的信息
     * @return /
     * @throws Exception /
     */
    public  String encryptByPrivateKey(String privateKeyText, String text) throws Exception {
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKeyText));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        byte[] result = cipher.doFinal(text.getBytes());
        return Base64.encodeBase64String(result);
    }

    /**
     * 公钥解密
     * @from wlk
     * @param publicKeyText 公钥
     * @param text 待解密的信息
     * @return /
     * @throws Exception /
     */
    public  String decryptByPublicKey(String publicKeyText, String text) throws Exception {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decodeBase64(publicKeyText));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
        byte[] result = cipher.doFinal(Base64.decodeBase64(text));
        return new String(result);
    }

    /**
     * 构建RSA密钥对
     * @from wlk
     * @return /
     * @throws NoSuchAlgorithmException /
     */
    public static RsaKeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
        String publicKeyString = Base64.encodeBase64String(rsaPublicKey.getEncoded());
        String privateKeyString = Base64.encodeBase64String(rsaPrivateKey.getEncoded());
        return new RsaKeyPair(publicKeyString, privateKeyString);
    }
}
