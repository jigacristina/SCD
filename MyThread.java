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
import java.security.NoSuchAlgorithmException;

public class MyThread extends Thread{
	
	long start;
	long end;
	
	MyThread(long start, long end){
	
		this.start = start;
		this.end = end;
	
	}
	
	@Override
	public void run(){
		
		findNumber(start, end);
		
	}
	
	
	private void findNumber(long start, long end){
		
		SHA256 encrypt = new SHA256();
		String strNumber = Long.toString(start);
		 
		for(start=start;start<=end;start++){		    		 

             
        	 try {
			
        		 if(encrypt.HashWithJavaMessageDigest(strNumber).toUpperCase().equals("7C797A2C0E1E31EF40E166FA6E290CF10BAC4393D7B53173FC3B41095DC12132")){
				
        			 System.out.println("Parola cautata corespunde numarului: ");
        			 System.out.println(strNumber);
        			 break;
				
        		 }
			
        	 } catch (NoSuchAlgorithmException e) {
        	 }
        	
        	 strNumber = Long.toString(start);
         
         }
		
	}
}