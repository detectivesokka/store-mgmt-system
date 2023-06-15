package userinterface.RolesWorkArea;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import model.Order.GoodsOrder;
import model.Order.ShopOrder;
import model.Organization.InvTransportationOrganization;
import model.Organization.LocalStoreOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class GTransporterJPanel extends javax.swing.JPanel {

    private   InvTransportationOrganization org;
    private   UserAccount user;
    /**
     * Creates new form GoodsTransporter
     * @param pUser
     * @param pOrg
     */    
    public GTransporterJPanel(UserAccount pUser, Organization pOrg) {
        
        initComponents();
        this.org = (InvTransportationOrganization)pOrg;
        this.user = pUser; 
        customizeWelcomeScreen(pUser);
    }
    
    private void customizeWelcomeScreen(UserAccount pUserAccount) {
        
        this.lblDispName.setText(pUserAccount.getUserName());
        this.lblDispRole.setText(pUserAccount.getRoleString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdPane = new javax.swing.JTabbedPane();
        paneWelcome = new javax.swing.JPanel();
        lblWelcome2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblDispName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblDispRole = new javax.swing.JLabel();
        paneOrders = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        btnDelivered = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblShopOrders = new javax.swing.JTable();
        btnAcceptShopOrder = new javax.swing.JButton();
        btnDeliverShopOrder = new javax.swing.JButton();

        tbdPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbdPaneStateChanged(evt);
            }
        });

        lblWelcome2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblWelcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome2.setText("Welcome");
        lblWelcome2.setName(""); // NOI18N

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Name - ");

        lblRole.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role - ");

        javax.swing.GroupLayout paneWelcomeLayout = new javax.swing.GroupLayout(paneWelcome);
        paneWelcome.setLayout(paneWelcomeLayout);
        paneWelcomeLayout.setHorizontalGroup(
            paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneWelcomeLayout.createSequentialGroup()
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDispName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(lblDispRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(363, Short.MAX_VALUE))
            .addComponent(lblWelcome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneWelcomeLayout.setVerticalGroup(
            paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneWelcomeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDispName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDispRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(428, Short.MAX_VALUE))
        );

        tbdPane.addTab("Welcome", paneWelcome);

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Item", "Quantity", "Supplier", "Status", "Distributor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrders);
        if (tblOrders.getColumnModel().getColumnCount() > 0) {
            tblOrders.getColumnModel().getColumn(3).setHeaderValue("Supplier");
        }

        btnDelivered.setText("Deliver Order");
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept Order");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneOrdersLayout = new javax.swing.GroupLayout(paneOrders);
        paneOrders.setLayout(paneOrdersLayout);
        paneOrdersLayout.setHorizontalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(paneOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelivered)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneOrdersLayout.setVerticalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOrdersLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelivered)
                    .addComponent(btnAccept))
                .addContainerGap())
        );

        tbdPane.addTab("Orders", paneOrders);

        tblShopOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Item", "Quantity", "Status", "Distributor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblShopOrders);

        btnAcceptShopOrder.setText("Accept Order");
        btnAcceptShopOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptShopOrderActionPerformed(evt);
            }
        });

        btnDeliverShopOrder.setText("Deliver Order");
        btnDeliverShopOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverShopOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAcceptShopOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeliverShopOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliverShopOrder)
                    .addComponent(btnAcceptShopOrder))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        tbdPane.addTab("Shop Orders", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbdPane, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbdPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbdPaneStateChanged

        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        int index = sourceTabbedPane.getSelectedIndex();

        switch(index) {
            case 1 : populateOrdersTable();
            break;
            case 2 : populateShopOrdersTable();
            break;
        }
    }//GEN-LAST:event_tbdPaneStateChanged

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed
        
        int rowIndex = this.tblOrders.getSelectedRow();        
        int orderId;        
        String status;
        
        try {
            
            orderId=Integer.parseInt(this.tblOrders.getValueAt(rowIndex,0).toString());                                                
            
            GoodsOrder go = this.org.getParentInvEnterprise().getInvGoodsOrderQueue().searchOrder(orderId);
            status = this.tblOrders.getValueAt(rowIndex,4).toString();
            
            if (status.compareTo("Ready for shipping") != 0) {
               
                JOptionPane.showMessageDialog(null, "Order not ready to be shipped");            
                return;
            } 
            
            go.addToDistributorInventory();
            go.setStatus("Order delivered to customer");            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Select an order to ship");            
        }
        
        populateOrdersTable();
    }//GEN-LAST:event_btnDeliveredActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        
        int rowIndex = this.tblOrders.getSelectedRow();        
        int orderId;        
        String status;
        
        try {
            
            orderId=Integer.parseInt(this.tblOrders.getValueAt(rowIndex,0).toString());                                                
            
            GoodsOrder go = this.org.getParentInvEnterprise().getInvGoodsOrderQueue().searchOrder(orderId);
            status = this.tblOrders.getValueAt(rowIndex,4).toString();
            
            if (status.compareTo("Accepted by Manufacturer") != 0) {
               
                JOptionPane.showMessageDialog(null, "Order not ready to be accepted");            
                return;
            } 
             
            go.setStatus("Ready for shipping");
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Select an order to accept");            
        }
        
        populateOrdersTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnAcceptShopOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptShopOrderActionPerformed
        
        int rowIndex = this.tblShopOrders.getSelectedRow();        
        int orderId;
        String distributor;
        String status;
        
        try {
            
            distributor = this.tblShopOrders.getValueAt(rowIndex,4).toString();
            orderId = Integer.parseInt(this.tblShopOrders.getValueAt(rowIndex,0).toString());
            
            ShopOrder so = this.org.getParentInvEnterprise().getSystem().getStoreEnterprise().searchShopOrders(orderId, distributor);
            status = this.tblShopOrders.getValueAt(rowIndex,3).toString();
            
            if (status.compareTo("Order placed by manager") != 0) {
               
                JOptionPane.showMessageDialog(null, "Order not ready to be accepted");            
                return;
            } 
             
            so.setStatus("Ready for shipping");
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Select an order to accept");            
        }
        
        populateShopOrdersTable();
        
    }//GEN-LAST:event_btnAcceptShopOrderActionPerformed

    private void btnDeliverShopOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverShopOrderActionPerformed
        
        int rowIndex = this.tblShopOrders.getSelectedRow();        
        int orderId;
        String distributor;
        String status;
        
        try {
            
            distributor = this.tblShopOrders.getValueAt(rowIndex,4).toString();
            orderId = Integer.parseInt(this.tblShopOrders.getValueAt(rowIndex, 0).toString());
                    
            ShopOrder so = this.org.getParentInvEnterprise().getSystem().getStoreEnterprise().searchShopOrders( orderId, distributor);
            status = this.tblShopOrders.getValueAt(rowIndex,3).toString();
            
            if (status.compareTo("Ready for shipping") != 0) {
               
                JOptionPane.showMessageDialog(null, "Order not ready to be accepted");
                return;
            } 
             
            so.updateShopInventory();
            so.setStatus("Order delivered to customer");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Select an order to accept");            
        }
        
        populateShopOrdersTable();
        
    }//GEN-LAST:event_btnDeliverShopOrderActionPerformed
    
    private void populateOrdersTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
                        
        for (GoodsOrder goq : this.org.getParentInvEnterprise().getInvGoodsOrderQueue().getOrderList()) {
            
            // Adding new row to the table                                       
            model.addRow(new Object[]{goq.getOrderID(),goq.getItemName(), goq.getQuantity(), goq.getTo(), goq.getStatus(), goq.getFrom()});            
        }
    }
    
    private void populateShopOrdersTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblShopOrders.getModel();
        model.setRowCount(0);
        
        for (LocalStoreOrganization lso : org.getParentInvEnterprise().getSystem().getStoreEnterprise().getLocalOrgList()) {
            
            for (ShopOrder so : lso.getShopOrderQueue().getOrderList()) {
                                
                model.addRow(new Object[]{so.getOrderID(), so.getItem().getItemName(), so.getQuantity(), so.getStatus(), so.getInvDistributorOrganization().getName()});
            }             
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAcceptShopOrder;
    private javax.swing.JButton btnDeliverShopOrder;
    private javax.swing.JButton btnDelivered;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDispName;
    private javax.swing.JLabel lblDispRole;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JPanel paneOrders;
    private javax.swing.JPanel paneWelcome;
    private javax.swing.JTabbedPane tbdPane;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblShopOrders;
    // End of variables declaration//GEN-END:variables
}
