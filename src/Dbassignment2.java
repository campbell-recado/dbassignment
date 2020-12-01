/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gigi
 */
public class Dbassignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // server serv= new server();
       //serv.dbServer();
        //client cl=new client();
        //cl.dbclient();
        //System.out.println("*********Testing*********"); 
       // int ln=nextline();
        assigndatabase crdb=new assigndatabase();
        crdb.createDatabase("testdb");
        System.out.println("*********sucess db createdg*********");
         fileTable table1=new fileTable();
        table1.createTable("testdb","texttbl","id","name","email");
      //  System.out.println("*********Table created*********");
      
        
       // record n=new record();
        //n.nrecord(1, "tim", "john");
        // TODO code application logic here
    }
    
}
