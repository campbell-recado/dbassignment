/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author Gigi
 */
public class fileTable {
  //private String dirPath = "C:\\Users\\Gigi\\Documents\\NetBeansProjects\\dbassignment2\\src\\dbassignment2\\database";
  //private String newDirName = "dir1";
  //private String newFileName = "file1.txt";
    
    //private String tblName;
   // private String dbname;
public void createTable (String dbname, String tblname,String column1, String column2,String column3){    
assigndatabase db=new assigndatabase();
//db.dirPath+"\\"+dbname, tblname+".dat"
;
//dbname=dbnam;
//File dbname=new File(dirPath);
    try{
    File table= new File(db.dirPath+"\\"+dbname+"\\"+ tblname+".dat");
    table.createNewFile();
    System.out.printf(" table created sucessfully");
    PrintWriter  tableheader=new PrintWriter(new FileOutputStream(table,true));
    tableheader.append(column1+","+column2+","+column3);
    tableheader.close();
     System.out.printf(" headers created sucessfully");
    }
    catch(Exception e){}

}
}
