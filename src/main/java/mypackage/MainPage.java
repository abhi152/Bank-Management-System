/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhinav
 */
public class MainPage extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form MainPage
     */
    String usernameString,passwordString,dobString,cityString,stateString,emailString,noString,adressString,nameString,actypeString;
    String acidString,ifscString;
    String doi;
    String acbalString;
    String customeridString;
    JLabel movename;
    JFrame refFrame;
    public MainPage() {
        
       initComponents();
       CommonFunction.addLabelBackground(banklbl, "D:\\JAVA_awt\\GUI\\Bank_System\\src\\main\\java\\mypackage\\images\\bank.png");
       CommonFunction.addLabelBackground(lbllogout, "D:\\JAVA_awt\\GUI\\Bank_System\\src\\main\\java\\mypackage\\images\\logout2.png");
       Thread t=new Thread(this);
        t.start();
        
    }
    public MainPage(String uname,JFrame tempFrame)
    {
        initComponents();
        findDeatils(uname);
       // String usernameString=uname;
        lblbanner.setText("Welcome "+uname);
        acidString="NA ";
        actypeString="NA ";
        ifscString="NA ";
        doi="NA ";
         CommonFunction.addLabelBackground(banklbl, "D:\\JAVA_awt\\GUI\\Bank_System\\src\\main\\java\\mypackage\\images\\bank.png");
       CommonFunction.addLabelBackground(lbllogout, "D:\\JAVA_awt\\GUI\\Bank_System\\src\\main\\java\\mypackage\\images\\logout2.png");
        Thread t=new Thread(this);
        refFrame=tempFrame;
        t.start();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblbanner = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btncreateaccount = new javax.swing.JButton();
        btnprof = new javax.swing.JButton();
        btnuseraccount = new javax.swing.JButton();
        btntransmoney = new javax.swing.JButton();
        btntranshisto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        banklbl = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Mainpanel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANK NAME");
        jLabel1.setOpaque(true);

        lblbanner.setForeground(new java.awt.Color(255, 255, 255));
        lblbanner.setText("Welcome Abhinav");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btncreateaccount.setBackground(new java.awt.Color(0, 0, 0));
        btncreateaccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btncreateaccount.setForeground(new java.awt.Color(255, 255, 255));
        btncreateaccount.setText("Create  Bank Account");
        btncreateaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateaccountActionPerformed(evt);
            }
        });

        btnprof.setBackground(new java.awt.Color(0, 0, 0));
        btnprof.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnprof.setForeground(new java.awt.Color(255, 255, 255));
        btnprof.setText("Profile");
        btnprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofActionPerformed(evt);
            }
        });

        btnuseraccount.setBackground(new java.awt.Color(0, 0, 0));
        btnuseraccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnuseraccount.setForeground(new java.awt.Color(255, 255, 255));
        btnuseraccount.setText("UserAccount");

        btntransmoney.setBackground(new java.awt.Color(0, 0, 0));
        btntransmoney.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btntransmoney.setForeground(new java.awt.Color(255, 255, 255));
        btntransmoney.setText("Transaction");
        btntransmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransmoneyActionPerformed(evt);
            }
        });

        btntranshisto.setBackground(new java.awt.Color(0, 0, 0));
        btntranshisto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btntranshisto.setForeground(new java.awt.Color(255, 255, 255));
        btntranshisto.setText("Check AC Balance");
        btntranshisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntranshistoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btntranshisto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntransmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnuseraccount, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprof, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncreateaccount))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btncreateaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnprof, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnuseraccount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btntransmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btntranshisto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(banklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banklbl, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbllogout.setToolTipText("Logout");
        lbllogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainpanelLayout = new javax.swing.GroupLayout(Mainpanel);
        Mainpanel.setLayout(MainpanelLayout);
        MainpanelLayout.setHorizontalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbanner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainpanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lbllogout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        MainpanelLayout.setVerticalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblbanner)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(lbllogout, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void findDeatils(String uname)
    {
        try {
            Connection connection=CommonFunction.addConection();
            Statement statement=connection.createStatement();
            String queryString="select * from customers where username = '"+uname+"'";
             ResultSet resultSet;
            resultSet=statement.executeQuery(queryString);
            
            if(resultSet.first())
            {
                nameString=resultSet.getString("Customer_name");
                noString=resultSet.getString("Customer_phone");
                emailString=resultSet.getString("Customer_email");
                usernameString= resultSet.getString("username");
                cityString= resultSet.getString("City");
                stateString= resultSet.getString("State");
                adressString=resultSet.getString("adress");
                dobString=resultSet.getString("dob");
                passwordString=resultSet.getString("password");
                customeridString=resultSet.getString("Customer_ID");
            }
            queryString="select * from accounts where Customer_ID = '"+customeridString+"'";
            resultSet=statement.executeQuery(queryString);
            if(resultSet.first())
            {
                acidString=resultSet.getString("Account_ID");
                actypeString=resultSet.getString("Account_Type");
                doi=resultSet.getString("date_opened");
                acbalString=resultSet.getString("account_bal");
                
            }
            else
            {
                System.out.println("detials not found");
            }
            
            
                    
        } catch (Exception e) 
        {
            System.out.println("error"+e);
        }
    }
    private void btntransmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransmoneyActionPerformed
        // TODO add your handling code here:
      //  System.out.println(acbalString);
        Transfermoney transfermoney=new Transfermoney(this,passwordString,acbalString,acidString,nameString);
        transfermoney.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btntransmoneyActionPerformed

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseClicked
        // TODO add your handling code here:
      // refFrame.setVisible(true);
         Login login=new Login();
         login.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lbllogoutMouseClicked

    private void btnprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofActionPerformed
        // TODO add your handling code here:
        findDeatils(usernameString);
        profile obj=new profile(this,usernameString,nameString,cityString,stateString,noString,adressString,emailString
        ,dobString,acidString,actypeString,ifscString,doi);
        obj.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btnprofActionPerformed

    private void btncreateaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateaccountActionPerformed
        // TODO add your handling code here:
        bankaccount obj=new bankaccount(this,passwordString,customeridString);
        obj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btncreateaccountActionPerformed

    private void btntranshistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntranshistoActionPerformed
        // TODO add your handling code here:
         findDeatils(usernameString);
        System.out.println(acidString);
        try {
            Connection connection=CommonFunction.addConection();
            String queryString="select * from accounts where Account_ID = '"+acidString+"'";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(queryString);
            if(resultSet.first())
            {
                JOptionPane.showMessageDialog(this, "Your Account Balanace is "+resultSet.getString("account_bal"));
            }
            else
            {
                System.out.println("no record");
            }
        } catch (Exception e)
        {
            System.out.println("Error" +e);
        }
    }//GEN-LAST:event_btntranshistoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JLabel banklbl;
    private javax.swing.JButton btncreateaccount;
    private javax.swing.JButton btnprof;
    private javax.swing.JButton btntranshisto;
    private javax.swing.JButton btntransmoney;
    private javax.swing.JButton btnuseraccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblbanner;
    private javax.swing.JLabel lbllogout;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        int x=-100,y=70;
       while(true)
       {
            x=x+10;
           try {
                lblbanner.setBounds(x,y ,300 ,20 );
              //  y=y+10;
               
                Thread.sleep(150);
           } catch (Exception e) {
           }
           if(x==830)
           {
               x=-100;
           }
          
       }
    }
}
