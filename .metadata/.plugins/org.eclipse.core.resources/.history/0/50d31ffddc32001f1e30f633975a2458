package GUI;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;
public class DES {
  
    	private static final String secretKey = "12#4454!@hh"; 
    	  
  
    	 public static String encrypt(String plainText) {
    	        try {
    	            Cipher cipher = Cipher.getInstance("DES");
    	            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
    	            KeySpec keySpec = new DESKeySpec(secretKey.getBytes());
    	            SecretKey key = keyFactory.generateSecret(keySpec);
    	            cipher.init(Cipher.ENCRYPT_MODE, key);
    	            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
    	            return Base64.getEncoder().encodeToString(encryptedBytes);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	            return null; 
    	        }
    	 }
    	 public static String decrypt(String encryptedText) {
    	        try {
    	            Cipher cipher = Cipher.getInstance("DES");
    	            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
    	            KeySpec keySpec = new DESKeySpec(secretKey.getBytes());
    	            SecretKey key = keyFactory.generateSecret(keySpec);
    	            cipher.init(Cipher.DECRYPT_MODE, key);
    	            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
    	            return new String(decryptedBytes);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	            return null;
    	        }
    	    }
}
