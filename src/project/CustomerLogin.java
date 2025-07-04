/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usman
 */
public class CustomerLogin extends javax.swing.JFrame {

    private Object jPanel3Layout;
    static String name ="";   
    /**
     * Creates new form CustomerLogin
     * Customer who already have account and using this service can use their
     * emails and passwords to login the customer portal and avail the services
     */
   
    public CustomerLogin() {
       
        initComponents();
        setSize(815,527); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel(false);
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-login-96.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 40, 80, 80);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0,80
        ));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Create a new account");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 180, 30));

        jLabel3.setBackground(new java.awt.Color(51, 0, 0));
        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, 16));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, -1));

        jTextField11.setBackground(new java.awt.Color(0, 0, 0,80));
        jTextField11.setForeground(new java.awt.Color(242, 242, 242));
        jTextField11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 210, 30));

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPasswordField1.setForeground(new java.awt.Color(242, 242, 242));
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 30));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 210, 30));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, 30));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(270, 130, 298, 340);

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setText("Customer Login");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 100, 230, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/first-electric-train-to-Cardiff-800x600-c.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 530);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(680, 150, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==jButton1)
        {
            Connection con;    
//            String url="jdbc:mysql://localhost:3306/customer?characterEncoding=utf8";
            String url="jdbc:mysql://localhost:3306/customer?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            String query = "SELECT * FROM customer";
            PreparedStatement st;//=con.prepareStatement("insert into customer(cid,cname,cemail,cpass,cgender,cno) values (?,?,?,?,?,?)");;
            ResultSet rs;

            try {
                
                con= DriverManager.getConnection(url,"root","root");
                con.createStatement();
                st=con.prepareStatement(query);
                 rs= st.executeQuery();
                 while(rs.next())
                 {
                    String pass= jPasswordField1.getText();
                    if(jTextField11.getText().equals(rs.getString(2)) &&pass.equals(rs.getString(3)))
                    {  
                         name=rs.getString(1);
                         System.out.println("Login"+name);
                         setVisible(false);
                         new CustomerPortal().setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "incorrect email or password");
                      
                    }
                     
                 }
            }
		
	catch(SQLException e)
	{
            System.out.println("IN CONN CLASS customerlogin "+ e);
	}
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==jButton2){
            setVisible(false);
            new SignUp().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    protected javax.swing.JPanel jPanel3;
    public javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField11;
    // End of variables declaration//GEN-END:variables
}
