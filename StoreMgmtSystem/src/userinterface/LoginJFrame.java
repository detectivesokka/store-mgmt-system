package userinterface;

import java.util.ArrayList;
import userinterface.RolesWorkArea.AdminJPanel;
import userinterface.RolesWorkArea.TaxAuditorJPanel;
import userinterface.RolesWorkArea.ShopEmpJPanel;
import userinterface.RolesWorkArea.ShopMgrJPanel;
import userinterface.RolesWorkArea.ODeliverymanJPanel;
import userinterface.RolesWorkArea.OCustomerJPanel;
import userinterface.RolesWorkArea.GTransporterJPanel;
import userinterface.RolesWorkArea.GMfrJPanel;
import userinterface.RolesWorkArea.GDistributorJPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Organization.InvManufacturerOrganization;
import model.Organization.Organization;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    
    public StoreMgmtSystem system;
    
    public LoginJFrame() {
        this.system = new StoreMgmtSystem();
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

        TitleLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        fldUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        fldPassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        TitleLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLogin.setText("Login");

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username");

        fldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password");

        fldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldPasswordActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(TitleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fldUsername)
                            .addComponent(fldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnSubmit)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldUsernameActionPerformed

    private void fldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldPasswordActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        // Since getPassword() returns a character array we convert it to String using String.valueOf()
        String pwd = String.valueOf(fldPassword.getPassword());
        UserAccount user = null;        
        ArrayList<Object> searchResult;
        Organization org;
                          
        searchResult = searchUser(fldUsername.getText(), pwd);        
        org = (Organization)searchResult.get(0);
        user = (UserAccount)searchResult.get(1);
        
        if(user != null) {

            clearPasswordField();

            JFrame userFrame=new JFrame();
            
            String confirmText = user.getRoleString();                                    
            
            JPanel userPanel;
            
            switch(user.getRole()) {
                
                case 0 : userPanel = new AdminJPanel();
                break;
                case 1 : userPanel = new OCustomerJPanel();
                break;
                case 2 : userPanel = new ODeliverymanJPanel();
                break;                
                case 3 : userPanel = new ShopMgrJPanel();
                break;
                case 4 : userPanel = new ShopEmpJPanel();
                break;                
                case 5 : userPanel = new TaxAuditorJPanel();
                break;
                case 6 : userPanel = new GTransporterJPanel();
                break;
                case 7 : userPanel = new GMfrJPanel(user, org);
                break;
                case 8 : userPanel = new GDistributorJPanel();
                break;        
                default: userPanel = null;
            }
            
            userFrame.getContentPane().add(userPanel);
            
            // Window opens in full size mode
            userFrame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);             
            userFrame.setVisible(true);      
            
        } else {

            JOptionPane.showMessageDialog(null, "Incorrect username/password. Please try again later.");
        }

    }//GEN-LAST:event_btnSubmitActionPerformed
    
    private ArrayList<Object> searchUser(String pUsername, String pPassword) {                
        
        ArrayList<Object> result;
        
        for(UserAccount u : this.system.getUserAccountDirectory().getUserAccountList()) {

            if (u.getUserName().equals(pUsername) && u.getPassword().equals(pPassword))
            {
                result = new ArrayList<Object> ();
                result.add(null);
                result.add(u);
            }
        }
        
        // Checking InventoryEnterprise        
        UserAccount ua;
        Organization org;
                
        result = this.system.getInventoryEnterprise().searchUserAccount(pUsername, pPassword);
        
        if(result != null) {
            
            return result;
        }                
        
        return null;
    }
    
    private void clearPasswordField() {
        
        fldPassword.setText("");
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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLogin;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldUsername;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
