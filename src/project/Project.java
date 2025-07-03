/*
 * Database username = "root" password="root"
 * URL jdbc:mysql://localhost:3306/customer?zeroDateTimeBehavior=CONVERT_TO_NULL
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
//package Source;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Usman
 * this is the main class from which the program starts and in this class 
 * we call the customer login form 
 * The Records are saved in database
 */

public class Project {
    public static void main(String[] args) {         
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         Conn conn =new Conn();
        System.out.println("Hello");
        
        Scanner input = new Scanner(System.in);
            
      
        try{
           String query = "select * from customer"; 
        ResultSet rs = conn.s.executeQuery(query);
        
       
        while(rs.next())
        {
            System.out.println("Name\t\t\tid");
            System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
            
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
       //  new NewJFrame().setVisible(true);
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
          //  java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
          //  java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
        //    java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         //   java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
        // TODO code application logic here
    }
    
}
