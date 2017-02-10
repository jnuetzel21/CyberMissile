/*
 * This simple program demonstrates how to connect to local mysql server.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author csc190
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_db", "root", "goodyear123!@#");
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery("SELECT name FROM authors");
           while(rs.next()){
               System.out.println("Author: " + rs.getString(1));
           }
        }catch(Exception exc){
            System.out.println("Error: " + exc.toString());
        }
    }
    
}
