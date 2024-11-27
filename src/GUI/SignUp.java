/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author nurfebrianabakri
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form REGISTER
     */
    public SignUp() {
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

        Signup = new javax.swing.JPanel();
        tekslogin = new javax.swing.JLabel();
        teksaja = new javax.swing.JLabel();
        tekssignup = new javax.swing.JLabel();
        teksname = new javax.swing.JLabel();
        teksemail = new javax.swing.JLabel();
        tekspass = new javax.swing.JLabel();
        teksconpass = new javax.swing.JLabel();
        isiusername = new javax.swing.JTextField();
        isiemail = new javax.swing.JTextField();
        isipass = new javax.swing.JPasswordField();
        isiconpass = new javax.swing.JPasswordField();
        buttonsignup = new javax.swing.JButton();
        desainsignup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Signup.setBackground(new java.awt.Color(123, 96, 89));
        Signup.setLayout(null);

        tekslogin.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        tekslogin.setForeground(new java.awt.Color(255, 248, 240));
        tekslogin.setText("Login");
        tekslogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teksloginMouseClicked(evt);
            }
        });
        Signup.add(tekslogin);
        tekslogin.setBounds(236, 610, 50, 15);

        teksaja.setFont(new java.awt.Font("Helvetica Neue", 0, 11)); // NOI18N
        teksaja.setForeground(new java.awt.Color(255, 255, 255));
        teksaja.setText("Already Have An Account?");
        Signup.add(teksaja);
        teksaja.setBounds(100, 610, 140, 17);

        tekssignup.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        tekssignup.setText("SIGN UP");
        Signup.add(tekssignup);
        tekssignup.setBounds(50, 230, 90, 25);

        teksname.setText("Name");
        Signup.add(teksname);
        teksname.setBounds(60, 260, 40, 30);

        teksemail.setText("Email");
        Signup.add(teksemail);
        teksemail.setBounds(60, 329, 40, 20);

        tekspass.setText("Password");
        Signup.add(tekspass);
        tekspass.setBounds(60, 388, 70, 30);

        teksconpass.setText("Confirm Password");
        Signup.add(teksconpass);
        teksconpass.setBounds(60, 459, 120, 17);

        isiusername.setBorder(null);
        isiusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiusernameActionPerformed(evt);
            }
        });
        Signup.add(isiusername);
        isiusername.setBounds(70, 290, 250, 30);

        isiemail.setBorder(null);
        isiemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiemailActionPerformed(evt);
            }
        });
        Signup.add(isiemail);
        isiemail.setBounds(70, 355, 250, 30);

        isipass.setBorder(null);
        isipass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isipassActionPerformed(evt);
            }
        });
        Signup.add(isipass);
        isipass.setBounds(70, 482, 250, 30);

        isiconpass.setBorder(null);
        isiconpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiconpassActionPerformed(evt);
            }
        });
        Signup.add(isiconpass);
        isiconpass.setBounds(70, 418, 250, 30);

        buttonsignup.setBackground(new java.awt.Color(142, 84, 69));
        buttonsignup.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        buttonsignup.setForeground(new java.awt.Color(255, 255, 255));
        buttonsignup.setText("Sign Up");
        buttonsignup.setBorder(null);
        buttonsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonsignupMouseClicked(evt);
            }
        });
        buttonsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsignupActionPerformed(evt);
            }
        });
        Signup.add(buttonsignup);
        buttonsignup.setBounds(140, 540, 110, 30);

        desainsignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/untuksignup.png"))); // NOI18N
        Signup.add(desainsignup);
        desainsignup.setBounds(0, 0, 400, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Signup, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Signup, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isiemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiemailActionPerformed

    private void isiconpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiconpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiconpassActionPerformed

    private void buttonsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsignupActionPerformed

    private void isipassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isipassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isipassActionPerformed

    private void buttonsignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsignupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsignupMouseClicked

    private void teksloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teksloginMouseClicked
        this.dispose();
        
        Login loginpage = new Login();
        loginpage.setVisible(true);
    }//GEN-LAST:event_teksloginMouseClicked

    private void isiusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiusernameActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Signup;
    private javax.swing.JButton buttonsignup;
    private javax.swing.JLabel desainsignup;
    private javax.swing.JPasswordField isiconpass;
    private javax.swing.JTextField isiemail;
    private javax.swing.JPasswordField isipass;
    private javax.swing.JTextField isiusername;
    private javax.swing.JLabel teksaja;
    private javax.swing.JLabel teksconpass;
    private javax.swing.JLabel teksemail;
    private javax.swing.JLabel tekslogin;
    private javax.swing.JLabel teksname;
    private javax.swing.JLabel tekspass;
    private javax.swing.JLabel tekssignup;
    // End of variables declaration//GEN-END:variables
}
