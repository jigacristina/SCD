/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

/**
 *
 * @author Jiga
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
	

    private static String bytesToHex(byte[] hash) {
        
    	StringBuffer hexString = new StringBuffer();
        
        for (int i = 0; i < hash.length; i++) {
            
        	String hex = Integer.toHexString(0xff & hash[i]);
            
        	if (hex.length() == 1){
            
            	hexString.append('0');
            
            }
            
            hexString.append(hex);
        
        }
        
        return hexString.toString();
    
    }

   public String HashWithJavaMessageDigest(final String originalString) throws NoSuchAlgorithmException {
        
    	final MessageDigest digest = MessageDigest.getInstance("SHA-256");
        final byte[] encodedhash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedhash);
    
    }

}
