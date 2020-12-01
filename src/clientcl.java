/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*; 
import java.net.*; 
//package java.lang.ClassNotFoundException:
/**
 *
 * @author Gigi
 */
public class clientcl {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    //throws Exception 
    {
        System.out.println("*********Testing*********");
            try{
// Create client socket 
        Socket s = new Socket("localhost", 888); 
  
        // to send data to the server 
        DataOutputStream dos 
            = new DataOutputStream( 
                s.getOutputStream()); 
  
        // to read data coming from the server 
        BufferedReader br 
            = new BufferedReader( 
                new InputStreamReader( 
                    s.getInputStream())); 
  
        // to read data from the keyboard 
        BufferedReader kb 
            = new BufferedReader( 
                new InputStreamReader(System.in)); 
        String str, str1; 
  
        // repeat as long as exit 
        // is not typed at client 
        while (!(str = kb.readLine()).equals("exit")) { 
  
            // send to the server 
            dos.writeBytes(str + "\n"); 
  
            // receive from the server 
            str1 = br.readLine(); 
  
            System.out.println(str1); 
        } 
  System.out.println("*********sucess*********");
        // close connection. 
        dos.close(); 
        br.close(); 
        kb.close(); 
        s.close(); 
    }catch(Exception e){}
 
    }
   
}


//public void clientc(){
 // }