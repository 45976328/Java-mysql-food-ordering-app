/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;

/**
 *
 * @author Laptop
 */
public class DatabaseConn { //connect to database
    
    public static Connection connectDB(){
        
        final String url = "jdbc:mysql://127.0.0.1:3306/papas_pizzeria"+
				"?verifyServerCertificate=false"+
				"&useSSL=true"+
				"&requireSSL=true";
            
        final String user = "root";
        final String password = "root";
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
                        
            return DriverManager.getConnection(url, user, password);
            
            
        }catch(Exception e){
            System.out.println("Error connecting to database");
            return null;
        }
    }
}