/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminWindow;

import java.awt.Color;

/**
 *
 * @author Jayjay
 */
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form AdminMain
     */
    public AdminMain() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="GUI INITIALIZATION">
    
    
    // </editor-fold>
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MasterPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        auditButton = new javax.swing.JButton();
        salesButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MasterPanel.setPreferredSize(new java.awt.Dimension(1500, 800));
        MasterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 290, 50));

        dashboardButton.setBackground(new java.awt.Color(0, 0, 0));
        dashboardButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(255, 255, 255));
        dashboardButton.setText("Dashboard");
        dashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseExited(evt);
            }
        });
        jPanel1.add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 50));

        inventoryButton.setBackground(new java.awt.Color(0, 0, 0));
        inventoryButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        inventoryButton.setForeground(new java.awt.Color(255, 255, 255));
        inventoryButton.setText("Inventory");
        jPanel1.add(inventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, 50));

        accountButton.setBackground(new java.awt.Color(0, 0, 0));
        accountButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Accounts");
        jPanel1.add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 290, 50));

        auditButton.setBackground(new java.awt.Color(0, 0, 0));
        auditButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        auditButton.setForeground(new java.awt.Color(255, 255, 255));
        auditButton.setText("Audit Logs");
        jPanel1.add(auditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 290, 50));

        salesButton.setBackground(new java.awt.Color(0, 0, 0));
        salesButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        salesButton.setForeground(new java.awt.Color(255, 255, 255));
        salesButton.setText("Sales");
        jPanel1.add(salesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 290, 50));

        MasterPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 307, 570));
        MasterPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 1190, 660));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin BG 1500x800.png"))); // NOI18N
        BackgroundImage.setPreferredSize(new java.awt.Dimension(1500, 800));
        MasterPanel.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(MasterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseEntered
        dashboardButton.setContentAreaFilled(true);
        dashboardButton.setBackground(new java.awt.Color(111, 68, 54));
        dashboardButton.setForeground(Color.white);
    }//GEN-LAST:event_dashboardButtonMouseEntered

    private void dashboardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseExited
        dashboardButton.setContentAreaFilled(false);
        dashboardButton.setForeground(Color.white);
    }//GEN-LAST:event_dashboardButtonMouseExited

    
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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JPanel MasterPanel;
    private javax.swing.JButton accountButton;
    private javax.swing.JButton auditButton;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton salesButton;
    // End of variables declaration//GEN-END:variables
}
