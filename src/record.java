
import java.util.*;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gigi
 */
public class record {
    private int colInt=0;
    private String colString="";
    private String colString2="";
    
       
public void nrecord(int conInt,String colString,String colString2){
     
    
    List<Object> col = new ArrayList<Object>();
        
    block blocks=new block();
   int idnum= blocks.getid();
   String colum1=blocks.getcol1();
   String colum2=blocks.getCol2();
    
         List<Integer> blockColID = new LinkedList<Integer>();
         List<String> blockCol1 = new LinkedList<String>();
         List<String> blockCol2 = new LinkedList<String>();
         
       blockColID.add(idnum );
      // Block.add(col1);
       //Block.add(col2);
   
   // ArrayList<Object> Record = new ArrayList<Object>();
     //   ArrayList<String> col_2 = new ArrayList<String>();
      //  ArrayList<String> col_3 = new ArrayList<String>();

        blockCol1.add(colum1);
        blockCol2.add(colum2);
        //col_1.add(colInt);
        //col_1.add(colInt);
        //col_1.add(colInt);

       // col_2.add(colString);
        //col_2.add(colString);
        //col_2.add(colString);
        //col_2.add(colString);
        //col_2.add(colString);
        
        //col_3.add(colString2);
        //col_3.add(colString2);
        //col_3.add(colString2);
        //col_3.add(colString2);
        //col_3.add(colString2);
        
      //  for(Object i:col){

        //    ArrayList<Integer> temp = i;

          //  for(Integer j : temp){
            //    System.out.print(j+" ");
            //}
            //System.out.println();
        }
    

    
}
