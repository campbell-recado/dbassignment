/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbassignment2.database.testdb;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gigi
 */
public class server {
public void dbServer(){

System.out.println("checking before class server");    
  try{
      System.out.println("checking after class server");    
    ServerSocket ss= new ServerSocket(4999);
    ss.accept();
    System.out.println("connected");
      }catch(Exception e){
}
}
}