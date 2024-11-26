/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author nurfebrianabakri
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Login = new javax.swing.JPanel();
        isiusername = new javax.swing.JTextField();
        tekslogin = new javax.swing.JLabel();
        teksusername = new javax.swing.JLabel();
        teksemail = new javax.swing.JLabel();
        buttonlogin = new javax.swing.JButton();
        isiemaillog = new javax.swing.JPasswordField();
        desainlogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 240));

        Login.setBackground(new java.awt.Color(123, 96, 89));
        Login.setLayout(null);

        isiusername.setBorder(null);
        isiusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiusernameActionPerformed(evt);
            }
        });
        Login.add(isiusername);
        isiusername.setBounds(70, 345, 260, 36);

        tekslogin.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        tekslogin.setText("LOGIN");
        Login.add(tekslogin);
        tekslogin.setBounds(60, 270, 90, 30);

        teksusername.setText("Username");
        Login.add(teksusername);
        teksusername.setBounds(60, 320, 59, 20);

        teksemail.setText("Email");
        Login.add(teksemail);
        teksemail.setBounds(60, 390, 50, 20);

        buttonlogin.setBackground(new java.awt.Color(142, 84, 69));
        buttonlogin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        buttonlogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonlogin.setText("Login");
        buttonlogin.setBorder(null);
        buttonlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonloginMouseClicked(evt);
            }
        });
        buttonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonloginActionPerformed(evt);
            }
        });
        Login.add(buttonlogin);
        buttonlogin.setBounds(140, 480, 110, 30);

        isiemaillog.setBorder(null);
        Login.add(isiemaillog);
        isiemaillog.setBounds(70, 415, 260, 36);

        desainlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/untuklogin.png"))); // NOI18N
        desainlogin.setText("jLabel2");
        Login.add(desainlogin);
        desainlogin.setBounds(0, -3, 400, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonloginActionPerformed

    private void isiusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiusernameActionPerformed

    private void buttonloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonloginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonloginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton buttonlogin;
    private javax.swing.JLabel desainlogin;
    private javax.swing.JPasswordField isiemaillog;
    private javax.swing.JTextField isiusername;
    private javax.swing.JLabel teksemail;
    private javax.swing.JLabel tekslogin;
    private javax.swing.JLabel teksusername;
    // End of variables declaration//GEN-END:variables
}