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


public class Main {
	

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		int noOfThreads = 94; 
                long start = 10000000;
                long end = 99999999;
                long interval = (end - start)/noOfThreads ;
                
                MyThread threads[] = new MyThread[noOfThreads];
                
                for(int i=0; i < noOfThreads; i++){
                    
                    threads[i] = new MyThread(start, start = start + interval);
                    
                }
                
                for(int i=0; i < noOfThreads; i++){
                    
                    threads[i].start();
                    
                }
                
                for(int i=0; i < noOfThreads; i++){
                    
                    try{
                        
                        threads[i].join();
                        
                    } catch(InterruptedException e) {
                        
                      e.printStackTrace();
                        
                    }
                    
                }
            }
        }        
