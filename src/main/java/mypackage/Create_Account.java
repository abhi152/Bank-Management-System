/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhinav
 */
public class Create_Account extends javax.swing.JFrame {

    /**
     * Creates new form Create_Account
     */
    public Create_Account() {
        
        initComponents();
        for(int i=1;i<=31;i++)
        {
            
            daycmb.addItem(String.valueOf(i));
        }
        for(int i=1;i<=12;i++)
        {
            
            monthcmb.addItem(String.valueOf(i));
        }
        for(int i=1980;i<=2025;i++)
        {
            
            yearcmb.addItem(String.valueOf(i));
        }
        
        fillstate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainpanel = new javax.swing.JPanel();
        namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        daycmb = new javax.swing.JComboBox<>();
        doblbl = new javax.swing.JLabel();
        monthcmb = new javax.swing.JComboBox<>();
        yearcmb = new javax.swing.JComboBox<>();
        statelbl = new javax.swing.JLabel();
        statecmb = new javax.swing.JComboBox<>();
        citylbl = new javax.swing.JLabel();
        citycmb = new javax.swing.JComboBox<>();
        cnolbl = new javax.swing.JLabel();
        cntxt = new javax.swing.JTextField();
        emaillbl = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        adrlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adrtxt = new javax.swing.JTextArea();
        submitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mainpanel.setBackground(new java.awt.Color(204, 255, 204));

        namelbl.setForeground(new java.awt.Color(0, 0, 0));
        namelbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namelbl.setText("Name ::");

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        daycmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Day--" }));
        daycmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daycmbActionPerformed(evt);
            }
        });

        doblbl.setForeground(new java.awt.Color(0, 0, 0));
        doblbl.setText("Date of  Birth : ");

        monthcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Month--" }));
        monthcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthcmbActionPerformed(evt);
            }
        });

        yearcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Year--" }));
        yearcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcmbActionPerformed(evt);
            }
        });

        statelbl.setForeground(new java.awt.Color(0, 0, 0));
        statelbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        statelbl.setText("State : :");

        statecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State" }));
        statecmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statecmbActionPerformed(evt);
            }
        });

        citylbl.setForeground(new java.awt.Color(0, 0, 0));
        citylbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        citylbl.setText("City ::");

        citycmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));

        cnolbl.setForeground(new java.awt.Color(0, 0, 0));
        cnolbl.setText(" Contact No ::        +91");
        cnolbl.setToolTipText("");

        cntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntxtActionPerformed(evt);
            }
        });

        emaillbl.setForeground(new java.awt.Color(0, 0, 0));
        emaillbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emaillbl.setText("Email : :");

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });

        adrlbl.setForeground(new java.awt.Color(0, 0, 0));
        adrlbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adrlbl.setText("Adress  : : ");

        adrtxt.setColumns(20);
        adrtxt.setRows(5);
        jScrollPane1.setViewportView(adrtxt);

        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainpanelLayout = new javax.swing.GroupLayout(Mainpanel);
        Mainpanel.setLayout(MainpanelLayout);
        MainpanelLayout.setHorizontalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainpanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doblbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainpanelLayout.createSequentialGroup()
                                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(MainpanelLayout.createSequentialGroup()
                                                .addComponent(daycmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(monthcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                            .addGroup(MainpanelLayout.createSequentialGroup()
                                                .addComponent(statecmb, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(citylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(yearcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(citycmb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addComponent(cnolbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainpanelLayout.createSequentialGroup()
                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(emaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(adrlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        MainpanelLayout.setVerticalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doblbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daycmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statelbl)
                    .addComponent(statecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citylbl)
                    .addComponent(citycmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillbl)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adrlbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
    private  void fillstate()
    {
        try {
             Connection connection=CommonFunction.addConection();
             String queryString="SELECT * FROM bank_system.state";
             Statement statement=connection.createStatement();
             ResultSet resultSet;
            resultSet=statement.executeQuery(queryString);
            while(resultSet.next())
            {
                statecmb.addItem(resultSet.getString("statename"));
            }
            
             
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    
    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void daycmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daycmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daycmbActionPerformed

    private void monthcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthcmbActionPerformed

    private void yearcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcmbActionPerformed

    private void cntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cntxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
         String usernameString=JOptionPane.showInputDialog(this,"Create Username");
            String pwdString=JOptionPane.showInputDialog(this,"Create Password");
            String repwdString=JOptionPane.showInputDialog(this,"Retype Password");
        while(true)
        {
           
            if(pwdString.equals(repwdString))
            {
                JOptionPane.showMessageDialog(this, "Account Created Succsesfully !!");
                
                
                
                Login login=new Login();
                login.setVisible(true);
                this.dispose();
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error", "Password Not Matched", JOptionPane.ERROR_MESSAGE);
                repwdString=JOptionPane.showInputDialog(this,"Retype Password");
            }
        }
        
        
        String nameString=nametxt.getText();
        String cityString=citycmb.getItemAt(citycmb.getSelectedIndex());
        String stateString=statecmb.getItemAt(statecmb.getSelectedIndex());
        String dayString,monthString,yearString;
        dayString=daycmb.getItemAt(daycmb.getSelectedIndex());
        monthString=monthcmb.getItemAt(monthcmb.getSelectedIndex());
        yearString=yearcmb.getItemAt(yearcmb.getSelectedIndex());
        String dateString=yearString+"-"+monthString+"-"+dayString;
       // userame and pwd  alredy there
       String emailString=emailtxt.getText();
       String phonenoString=cntxt.getText();
       String adressString=adrtxt.getText();
       String queryString="INSERT INTO `bank_system`.`customers` ( `Customer_name`, `Customer_phone`, `Customer_email`, " +
               "`username`, `password`, `adress`, `dob`, `City`, `State`) VALUES ( '"+ nameString +"', '" 
               + phonenoString +"', '" + emailString +"', '"+usernameString +"', '"+ pwdString+"', '"+
               adressString+"', '"+dateString+"', '" + cityString+"', '"+ stateString+"')";
        try {
            Connection connection= CommonFunction.addConection();
            Statement statement=connection.createStatement();
            statement.executeUpdate(queryString);
            
            
        } catch (Exception e) 
        {
            System.out.println("error "+e);
        }
        
        
        
    }//GEN-LAST:event_submitbtnActionPerformed

    private void statecmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statecmbActionPerformed
        // TODO add your handling code here:
        String state=statecmb.getItemAt(statecmb.getSelectedIndex());
        citycmb.removeAllItems();
        citycmb.addItem("Select City");
        
     //   System.out.println(state);
        String queryString="select  stateid from state where statename= '" + state + "'";
         try {
             Connection connection=CommonFunction.addConection();
             Statement statement=connection.createStatement();
             ResultSet resultSet;
            resultSet=statement.executeQuery(queryString);
            if(resultSet.first())
            {
                String stateid=resultSet.getString("stateid");
                System.out.println(stateid);
                 queryString="select cityname from city where stateid="+ stateid;
                resultSet=statement.executeQuery(queryString);
                
                while(resultSet.next())
                 {
                    citycmb.addItem(resultSet.getString("cityname"));
                     System.out.println(resultSet.getString("cityname")+"");
                 }
            }
            
           
            
             
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
         System.out.println("\n\n\n");
        
    }//GEN-LAST:event_statecmbActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JLabel adrlbl;
    private javax.swing.JTextArea adrtxt;
    private javax.swing.JComboBox<String> citycmb;
    private javax.swing.JLabel citylbl;
    private javax.swing.JLabel cnolbl;
    private javax.swing.JTextField cntxt;
    private javax.swing.JComboBox<String> daycmb;
    private javax.swing.JLabel doblbl;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> monthcmb;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JComboBox<String> statecmb;
    private javax.swing.JLabel statelbl;
    private javax.swing.JButton submitbtn;
    private javax.swing.JComboBox<String> yearcmb;
    // End of variables declaration//GEN-END:variables
}
