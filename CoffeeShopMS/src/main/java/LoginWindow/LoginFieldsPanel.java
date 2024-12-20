/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package LoginWindow;

import java.awt.Color;

/**
 *
 * @author Jayjay
 */
public class LoginFieldsPanel extends javax.swing.JPanel {

   
    public LoginFieldsPanel() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        showPassCheck = new javax.swing.JCheckBox();
        LoginButton = new javax.swing.JButton();
        SignupButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(140, 111, 39));
        setForeground(new java.awt.Color(140, 111, 39));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(595, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 310, -1));

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 310, -1));

        showPassCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showPassCheck.setForeground(new java.awt.Color(255, 255, 255));
        showPassCheck.setText("Show Password");
        add(showPassCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Log In");
        LoginButton.setContentAreaFilled(false);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 120, 60));

        SignupButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(255, 255, 255));
        SignupButton.setText("Sign Up");
        SignupButton.setContentAreaFilled(false);
        SignupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupButtonMouseExited(evt);
            }
        });
        add(SignupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 120, 60));
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Events">  
    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        LoginButton.setContentAreaFilled(true);
        LoginButton.setBackground(new java.awt.Color(111, 68, 54));
        LoginButton.setForeground(Color.white);
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        LoginButton.setContentAreaFilled(false);
        LoginButton.setForeground(Color.white);
    }//GEN-LAST:event_LoginButtonMouseExited

    private void SignupButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupButtonMouseEntered
        SignupButton.setContentAreaFilled(true);
        SignupButton.setBackground(new java.awt.Color(111, 68, 54));
        SignupButton.setForeground(Color.white);
    }//GEN-LAST:event_SignupButtonMouseEntered

    private void SignupButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupButtonMouseExited
        SignupButton.setContentAreaFilled(false);
        SignupButton.setForeground(Color.white);
    }//GEN-LAST:event_SignupButtonMouseExited

    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="GUI VARIABLES">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton SignupButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPassCheck;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
// </editor-fold>  
}
