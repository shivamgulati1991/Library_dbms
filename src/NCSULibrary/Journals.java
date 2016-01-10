/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCSULibrary;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author shiva
 */
public class Journals extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    public Journals() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProceedingsCheckout = new javax.swing.JTable();
        jButtonCheckout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextStartDate = new javax.swing.JTextField();
        jTextEndDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBooktype = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProceedingsReturn = new javax.swing.JTable();
        jButtonReturn = new javax.swing.JButton();
        jButtonRenew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextEndDate2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setViewportView(jTableProceedingsCheckout);

        jButtonCheckout.setText("Checkout");
        jButtonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckoutActionPerformed(evt);
            }
        });

        jLabel1.setText("Journal Publication available for checkout");

        jLabel3.setText("Start Date(DD-MON-YYYY hh24:mi:ss)");

        jLabel4.setText("End Date(DD-MON-YYYY hh24:mi:ss)");

        jComboBooktype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Physical", "Electronic" }));

        jLabel9.setText("If selected book has both types, choose");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTextStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jTextEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBooktype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jButtonCheckout))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addContainerGap(65, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCheckout)
                    .addComponent(jComboBooktype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableProceedingsReturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableProceedingsReturn);

        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        jButtonRenew.setText("Renew");
        jButtonRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenewActionPerformed(evt);
            }
        });

        jLabel2.setText("Return Journal Publication");

        jLabel5.setText("End Date(DD-MON-YYYY hh24:mi:ss)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextEndDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209)
                                .addComponent(jButtonReturn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRenew)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReturn)
                    .addComponent(jButtonRenew)
                    .addComponent(jTextEndDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(jLabel6)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(jButtonBack)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckoutActionPerformed
        // TODO add your handling code here:
       // Connection connection = null;
       // if (jTextStartDate.toString().isEmpty() || jTextEndDate.toString().isEmpty())
         //          {
           //        JOptionPane.showMessageDialog(null, "Please enter start/end date and time", "Error", JOptionPane.PLAIN_MESSAGE);
        //}else
    //    {
        try { 
            CallableStatement stmt = null;
            if(GlobalData.loginType.equalsIgnoreCase("faculty")){
                stmt = GlobalData.connection.prepareCall("{call proc_fac_checkout_journal(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'),to_date(?,'DD-MON-YYYY hh24:mi:ss'),?)}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTableProceedingsCheckout.getValueAt(jTableProceedingsCheckout.getSelectedRow(),0).toString() );
                   stmt.setString(3,jTextStartDate.getText());
                   if(jComboBooktype.getSelectedItem().toString().equalsIgnoreCase("Physical")){
                    stmt.setString(4,jTextEndDate.getText());
                   }else{
                       stmt.setString(4,"");
                   }
                   stmt.setString(5, jComboBooktype.getSelectedItem().toString());
                   stmt.executeUpdate();
            
            // Close the Statement
            stmt.close();
            }else{
                stmt = GlobalData.connection.prepareCall("{call proc_stud_checkout_journal(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'),to_date(?,'DD-MON-YYYY hh24:mi:ss'),?)}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTableProceedingsCheckout.getValueAt(jTableProceedingsCheckout.getSelectedRow(),0).toString() );
                   stmt.setString(3,jTextStartDate.getText());
                   if(jComboBooktype.getSelectedItem().toString().equalsIgnoreCase("Physical")){
                    stmt.setString(4,jTextEndDate.getText());
                   }else{
                       stmt.setString(4,"");
                   }
                   stmt.setString(5, jComboBooktype.getSelectedItem().toString());
                   stmt.executeUpdate();
            
            // Close the Statement
            stmt.close();
            }
            
JOptionPane.showMessageDialog(null, "Your Journal Publication has been checked out", "Success", JOptionPane.PLAIN_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failure", JOptionPane.PLAIN_MESSAGE);        
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

      //  }
    }//GEN-LAST:event_jButtonCheckoutActionPerformed
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            PreparedStatement stmt = null;
            PreparedStatement stmt1 = null;
            ResultSet rs =null;
            ResultSet rs1 =null;
            if(GlobalData.loginType.equalsIgnoreCase("faculty")){
                stmt = GlobalData.connection.prepareStatement("SELECT j.ISSN,j.YEAR_OF_PUBLICATION,j.AUTHOR,j.TITLE from JOURNALS j minus SELECT j.ISSN,j.YEAR_OF_PUBLICATION, j.AUTHOR, j.TITLE from f_journals_history s,JOURNALS j, faculty fc where s.JOURNALID = j.ISSN and fc.facultyno =s.facultyno and s.actualreturndate is NULL and s.facultyno=?");
            stmt.setString(1,GlobalData.loginSession);
            rs = stmt.executeQuery();
            jTableProceedingsCheckout.setModel(DbUtils.resultSetToTableModel(rs));
            
            stmt1 = GlobalData.connection.prepareStatement("SELECT j.ISSN, j.TITLE,s.CHECKOUTDATE, s.DUEDATE from f_journals_history s,JOURNALS j where s.JOURNALID = j.ISSN and actualreturndate is NULL and facultyno= ?");
            stmt1.setString(1,GlobalData.loginSession);
            rs1 = stmt1.executeQuery();
            jTableProceedingsReturn.setModel(DbUtils.resultSetToTableModel(rs1));
            
            // Close the RseultSet
            rs.close();

            // Close the Statement
            stmt.close();
               stmt1.close();
            }else{
            stmt = GlobalData.connection.prepareStatement("SELECT j.ISSN,j.YEAR_OF_PUBLICATION,j.AUTHOR,j.TITLE from JOURNALS j minus SELECT j.ISSN,j.YEAR_OF_PUBLICATION, j.AUTHOR, j.TITLE from s_journals_history s,JOURNALS j, students st where s.JOURNALID = j.ISSN and s.studentno =st.studentno and s.actualreturndate is NULL and s.studentno=?");
            stmt.setString(1,GlobalData.loginSession);
            rs = stmt.executeQuery();
            jTableProceedingsCheckout.setModel(DbUtils.resultSetToTableModel(rs));
            
            stmt1 = GlobalData.connection.prepareStatement("SELECT j.ISSN, j.TITLE,s.CHECKOUTDATE, s.DUEDATE from s_journals_history s,JOURNALS j where s.JOURNALID = j.ISSN and actualreturndate is NULL and studentno= ?");
            stmt1.setString(1,GlobalData.loginSession);
            rs1 = stmt1.executeQuery();
            jTableProceedingsReturn.setModel(DbUtils.resultSetToTableModel(rs1));
            
            // Close the RseultSet
            rs.close();

            // Close the Statement
            stmt.close();
               stmt1.close();
            }
            //Statement stmt = connection.createStatement();
            
            // Close the connection
        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        new Publications().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        // TODO add your handling code here:
        try {
                CallableStatement stmt =null;
                if(GlobalData.loginType.equalsIgnoreCase("faculty")){
                    stmt = GlobalData.connection.prepareCall("{call proc_fac_return_journals(?,?)}");     
                stmt.setString(1,GlobalData.loginSession);
                stmt.setString(2,jTableProceedingsReturn.getValueAt(jTableProceedingsReturn.getSelectedRow(),0).toString() );
                   
                  stmt.executeUpdate();
            // Close the Statement
            stmt.close();
                }else{
                    stmt = GlobalData.connection.prepareCall("{call proc_stud_return_journals(?,?)}");     
                stmt.setString(1,GlobalData.loginSession);
                stmt.setString(2,jTableProceedingsReturn.getValueAt(jTableProceedingsReturn.getSelectedRow(),0).toString() );
                   
                  stmt.executeUpdate();
            // Close the Statement
            stmt.close();
                }
                
            JOptionPane.showMessageDialog(null, "Your Journal Publication has been returned", "Success", JOptionPane.PLAIN_MESSAGE);

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenewActionPerformed
        // TODO add your handling code here:
        try {       
            CallableStatement stmt2 =null;
            if(GlobalData.loginType.equalsIgnoreCase("faculty")){
                stmt2 = GlobalData.connection.prepareCall("{call proc_fac_renew_journals(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'))}");
                   stmt2.setString(1,GlobalData.loginSession);
                   stmt2.setString(2,jTableProceedingsReturn.getValueAt(jTableProceedingsReturn.getSelectedRow(),0).toString() );
                   stmt2.setString(3,jTextEndDate2.getText());
                   stmt2.executeUpdate();
                   
                   stmt2.close();
            }else{
                stmt2 = GlobalData.connection.prepareCall("{call proc_stud_renew_journals(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'))}");
                   stmt2.setString(1,GlobalData.loginSession);
                   stmt2.setString(2,jTableProceedingsReturn.getValueAt(jTableProceedingsReturn.getSelectedRow(),0).toString() );
                   stmt2.setString(3,jTextEndDate2.getText());
                   stmt2.executeUpdate();
                   
                   stmt2.close();
            }
            
            JOptionPane.showMessageDialog(null, "Your Journal Publication has been renewed", "Success", JOptionPane.PLAIN_MESSAGE);
                    } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_jButtonRenewActionPerformed

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
            java.util.logging.Logger.getLogger(Journals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Journals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Journals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Journals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Journals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCheckout;
    private javax.swing.JButton jButtonRenew;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JComboBox jComboBooktype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProceedingsCheckout;
    private javax.swing.JTable jTableProceedingsReturn;
    private javax.swing.JTextField jTextEndDate;
    private javax.swing.JTextField jTextEndDate2;
    private javax.swing.JTextField jTextStartDate;
    // End of variables declaration//GEN-END:variables
}