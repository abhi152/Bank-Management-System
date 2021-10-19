/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Abhinav
 */
public class CommonFunction {
     public static void addLabelBackground(JLabel lbl,String path)
    {
         BufferedImage img=null;
        try
        {
              img=ImageIO.read(new File(path));
              Image newimage=img.getScaledInstance(lbl.getWidth()-10, lbl.getHeight()-10, Image.SCALE_SMOOTH);
              ImageIcon icon=new ImageIcon(newimage);
              lbl.setIcon(icon);
        } catch (Exception e)
        {
          
            
            
        }
    }
     public static void addButonBackground(JButton btn,String path)
     {
         BufferedImage img=null;
        try
        {
              img=ImageIO.read(new File(path));
              Image newimage=img.getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);
              ImageIcon icon=new ImageIcon(newimage);
              btn.setIcon(icon);
        } catch (Exception e)
        {
            System.out.println("Exeception "+e);
            
            
        }
     }
     
     public static void alphabetValidation(java.awt.event.KeyEvent evt)
     {
         char ch=evt.getKeyChar();
         if(Character.isAlphabetic(ch))
         {
         }
         else
         {
             evt.consume();
         }
         
     }
     public static void numericValidation(java.awt.event.KeyEvent evt)
     {
         char ch=evt.getKeyChar();
         if(Character.isDigit(ch))
         {
         }
         else
         {
             evt.consume();
                     
         }
         
     }
     
     public static Connection addConection() throws SQLException
     {
          String urlString="jdbc:mysql://localhost:3306/bank_system";
        String username="root";
        String password="abhi1184";
        Connection connection=DriverManager.getConnection(urlString,username,password);
        return  connection;
        
      
     }
     
     
}
