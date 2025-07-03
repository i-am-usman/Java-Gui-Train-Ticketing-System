/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TrainDetails extends JPanel 
{
    
    Conn conn = new Conn();
    String query="select * from traindetails";
    
    static int tAcS;
    static int tAcB;
    static int tEcoS;
    static int tEcoB;
    static int fare=0;
    
    String AcS = ("Available: "+tAcS);
    String AcB=("Available: "+tAcB);    
    String EcoS=("Available: "+tEcoS);  
    String EcoB=("Available: "+tEcoB);
    int cost[]=new int[4];
    int AcBC=650, AcSC=600, EcoBC=550, EcoSC=500;
    int c=0;
    
   // {System.out.println("Before rs check :"+tAcS+" .. "+tAcB+" , "+tEcoS+" , "+tEcoB);}
    public int  costCalc(int f,int t,int AS,int AB, int ES,int EB) 
    {
         cost[0]=200;cost[1]=500;cost[2]=350;cost[3]=140;
         for(int i=f;i<=t;i++){
             c=c+cost[i];
         }
         c+=((AcSC*AS)+(AcBC*AB)+(EcoSC*ES)+(EcoBC*EB));
         fare = c;
        return c;
    }
    
    
    public TrainDetails() {
       
        try 
        {
           
            ResultSet rs = conn.s.executeQuery(query);
             
            if(rs.next()){
                tAcS=rs.getInt(2);
                tAcB=rs.getInt(3);
                tEcoS=rs.getInt(4);
                tEcoB=rs.getInt(5);
                
            }
             {System.out.println("after rs :"+tAcS+" .. "+tAcB+" , "+tEcoS+" , "+tEcoB);}
        }
    catch(Exception e )
    {
    
    }
    }
  

    private void setLocationRelativeTo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}





