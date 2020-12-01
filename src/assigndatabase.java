/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.nio.file.Path;

/**
 *
 * @author Gigi
 */
public class assigndatabase {
    
    
    public String dirPath = "C:\\Users\\Gigi\\Documents\\NetBeansProjects\\dbassignment2\\src\\dbassignment2\\database";
   // private String dbname;
    
    
    //create databae
    public void createDatabase( String dbnam){
       //String dbname=dbnam;
       dirPath=dirPath+"\\"+dbnam;
        File dbname=new File(dirPath);
      // dbname=dbname+dbnam;
        boolean isCreated = dbname.mkdirs();
        if (isCreated) {
            System.out.printf("Databasewas Successfully created directories");
                   
        } else if (dbname.exists()) {
            System.out.printf("1. database already exist exist,");
                    
        } else {
            System.out.println("1. Unable to create Database");
            return;
        }
    }
        
    /**
     * Delete database
     */
    
        public void deleteDB( String dbnam){
        dirPath=dirPath+dbnam;
        File dbname=new File(dirPath);
       // Path deleteDb= Path.get();
       dbname.delete();
       System.out.printf("Database was Successfully  deleted");
       
        }
        
        
   public void alterDbName(String dbnam){
   
     dirPath=dirPath+dbnam;
       System.out.printf("Database was Successfully  deleted");
   
   }
    
    
    
}
