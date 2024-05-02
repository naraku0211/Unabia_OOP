package views;

import java.sql.*;
import javax.swing.*;
import controllers.BankConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminLogin extends JFrame {

    private Connection conn;
    
    public AdminLogin() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            BankConnection connection = new BankConnection();
            conn = connection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_title = new javax.swing.JLabel();
        jPanel_txtFieldComponents = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Account Login");
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_title.setText("LOGIN");

        jPanel_txtFieldComponents.setPreferredSize(new java.awt.Dimension(450, 300));

        jLabel_username.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_username.setText("Username: ");
        jLabel_username.setPreferredSize(new java.awt.Dimension(120, 50));

        jTextField_username.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_username.setPreferredSize(new java.awt.Dimension(300, 50));
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        jLabel_password.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_password.setText("Password: ");
        jLabel_password.setPreferredSize(new java.awt.Dimension(120, 50));

        jPasswordField_password.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPasswordField_password.setPreferredSize(new java.awt.Dimension(300, 50));
        jPasswordField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passwordActionPerformed(evt);
            }
        });

        jButton_enter.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton_enter.setText("Enter");
        jButton_enter.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_txtFieldComponentsLayout = new javax.swing.GroupLayout(jPanel_txtFieldComponents);
        jPanel_txtFieldComponents.setLayout(jPanel_txtFieldComponentsLayout);
        jPanel_txtFieldComponentsLayout.setHorizontalGroup(
            jPanel_txtFieldComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_txtFieldComponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_txtFieldComponentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_txtFieldComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel_txtFieldComponentsLayout.setVerticalGroup(
            jPanel_txtFieldComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_txtFieldComponentsLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel_txtFieldComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_txtFieldComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel_txtFieldComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_txtFieldComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enterActionPerformed
        // TODO add your handling code here:
        loginAccount();
    }//GEN-LAST:event_jButton_enterActionPerformed

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
        loginAccount();
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jPasswordField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passwordActionPerformed
        // TODO add your handling code here:
        loginAccount();
    }//GEN-LAST:event_jPasswordField_passwordActionPerformed

    private void loginAccount(){

        try {
            PreparedStatement ps;
            ResultSet rs;
            
            String username = jTextField_username.getText().trim();
            String password = jPasswordField_password.getText().trim();
            
            String query = "SELECT * FROM users WHERE username=? AND password=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if(rs.next()){
                //event occur
                //System.out.println("Login Successful.");
                JOptionPane.showMessageDialog(null, "Login Successful.", "Login", JOptionPane.INFORMATION_MESSAGE);
                AdminMainDashboard main = new AdminMainDashboard();
                main.setVisible(true);
                dispose();
            }
            else{
                //System.out.println("Invalid username or password.");
                JOptionPane.showMessageDialog(null, "Invalid username or password.", "Login", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_enter;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel_txtFieldComponents;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
