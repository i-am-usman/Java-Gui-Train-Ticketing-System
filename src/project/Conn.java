/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author Usman
 */
public class Conn {
    
    Connection c;
    Statement s; 
    public Conn()
    {
        try
	{
             String url="jdbc:mysql://localhost:3306/customer?zeroDateTimeBehavior=CONVERT_TO_NULL";
           
            c= DriverManager.getConnection(url,"root","root");
            Connection con = DriverManager.getConnection(url, "root", "root");
            Class.forName("com.mysql.cj.jdbc.Driver");
            s=c.createStatement();
        }
		
	catch(SQLException e)
	{
            System.out.println("IN CONN CLASS conn "+ e);
	}
        catch(Exception e)
        {
            System.out.println("EXception "+ e);
        }
         
    }
   

    PreparedStatement prepareStatement(String insert_into_customercidcnamecemailcpasscg) {
      
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

