//package com.tamborasystems.utility;
package com.srujanika.utils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

/**
 * Created by vikashk@sawridge.com on 3/8/17.
 */
public class EncyDecyUtility {
    private static String encrypetdKey = null;
    private static String secretKey = null;
    private static SecretKeySpec secretKeySpec = null;

    private static void setKey(String keyname) {

        encrypetdKey = shiftingKey(keyname, 9);
        createSecretKey(encrypetdKey);
    }

    private static String shiftingKey(String key, int shift) {
        String encryperedKey = "";
        for (int i = 0; i < key.length(); i++) {
            if ((key.charAt(i) >= 'A' && key.charAt(i) <= 'Z') || (key.charAt(i) >= 'a' && key.charAt(i) <= 'z')) {
                if (((char) (key.charAt(i) + shift)) > 'Z' && (key.charAt(i) <= 'Z') || ((char) (key.charAt(i) + shift)) > 'z' && (key.charAt(i) <= 'z')) {
                    encryperedKey = encryperedKey + (char) (key.charAt(i) + shift - 26);
                } else {
                    encryperedKey = encryperedKey + (char) (key.charAt(i) + shift);
                }
            } else {
                encryperedKey = encryperedKey + key.charAt(i);
            }
        }
        return encryperedKey;
    }

    private static void createSecretKey(String key) {
        byte[] keybyte;
        MessageDigest sha = null;
        try {
            keybyte = key.getBytes("UTF-8");
            if (keybyte.length != 16) {
                throw new IllegalArgumentException("invalid key key length");
            }
            sha = MessageDigest.getInstance("SHA-1");
            keybyte = sha.digest(keybyte);
            keybyte = Arrays.copyOf(keybyte, 16);
            secretKeySpec = new SecretKeySpec(keybyte, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static String getEncrypetedValue(String value, String key) {
        try {
            setKey(key);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, new IvParameterSpec(new byte[16]));
            return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes("UTF-8")));
        } catch (Exception e) {
            ////System.out.println("Error while encrypting: " + e.toString());
            e.toString();
        }
        return null;
    }

    public static String decrypt(String value, String key) {
        try {
            setKey(key);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, new IvParameterSpec(new byte[16]));
            return new String(cipher.doFinal(Base64.getDecoder().decode(value)));
        } catch (Exception e) {
            ////System.out.println("Error while decrypting: " + e.toString());
            e.toString();
        }
        return null;
    }
}
