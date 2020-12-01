/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbassignment2.database.testdb;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gigi
 */
public class client {
    
    
      public void dbclient(){
        try {
            Socket s=new Socket("localhost",4999);
        } catch (Exception e) {
            
        }
                
    }

    
}
