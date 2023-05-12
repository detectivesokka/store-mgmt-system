package userinterface.RolesWorkArea;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import model.Order.GoodsOrder;
import model.Organization.InvDistributorOrganization;
import model.Organization.InvManufacturerOrganization;
import model.StockItem.StockItem;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class GDistributorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GSupplierWorkArea
     */
    
    private final UserAccount user;
    private final StoreMgmtSystem system;
    
    public GDistributorJPanel(StoreMgmtSystem pSystem, UserAccount pUser) {
        
        initComponents();
        customizeWelcomeScreen(pUser);                
        this.user = pUser;
        this.system = pSystem;
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
        btnNewOrder1 = new javax.swing.JButton();
        paneShop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShop = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fldQuantity = new javax.swing.JTextField();
        btnOrderItem = new javax.swing.JButton();

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
            .addComponent(lblWelcome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneWelcomeLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneWelcomeLayout.createSequentialGroup()
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDispRole, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneWelcomeLayout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDispName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        paneWelcomeLayout.setVerticalGroup(
            paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneWelcomeLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(lblWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDispName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDispRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        tbdPane.addTab("Welcome", paneWelcome);

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Item", "Quantity", "Supplier", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrders);

        btnNewOrder1.setText("Cancel order");
        btnNewOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneOrdersLayout = new javax.swing.GroupLayout(paneOrders);
        paneOrders.setLayout(paneOrdersLayout);
        paneOrdersLayout.setHorizontalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(paneOrdersLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(btnNewOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneOrdersLayout.setVerticalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOrdersLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewOrder1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        tbdPane.addTab("Orders", paneOrders);

        tblShop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item", "Avail quantity", "Price", "Manufacturer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblShop);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Quantity");

        fldQuantity.setText("0");

        btnOrderItem.setText("Order");
        btnOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneShopLayout = new javax.swing.GroupLayout(paneShop);
        paneShop.setLayout(paneShopLayout);
        paneShopLayout.setHorizontalGroup(
            paneShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(paneShopLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneShopLayout.setVerticalGroup(
            paneShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneShopLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldQuantity)
                    .addComponent(btnOrderItem)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        tbdPane.addTab("Shop", paneShop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbdPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbdPaneStateChanged

        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        int index = sourceTabbedPane.getSelectedIndex();

        switch(index) {
            
            case 1 : populateOrdersTable();
            break;
            case 2 : populateShopTable();
            break;
        }
    }//GEN-LAST:event_tbdPaneStateChanged

    private void btnOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderItemActionPerformed
        
        int rowIndex = this.tblShop.getSelectedRow();
        int itemId;
        String manufacturer;
        InvManufacturerOrganization imo;
        int quantity;

        if(rowIndex < 0) {

            JOptionPane.showMessageDialog(null, "Please select column");
            return;
        }
        
        try {
            quantity = Integer.parseInt(this.fldQuantity.getText());
            
            if (quantity <= 0) {
                
                throw new NumberFormatException();
            }
            
            itemId=Integer.parseInt(this.tblShop.getValueAt(rowIndex,0).toString());
            manufacturer = this.tblShop.getValueAt(rowIndex, 4).toString();
            imo = this.system.getInventoryEnterprise().searchMfrOrganization(manufacturer);        
            GoodsOrder go = this.system.getInventoryEnterprise().getInvGoodsOrderQueue().newOrder();
        
            go.setDistributorOrganization((InvDistributorOrganization)this.user.getParentOrg());
            go.setMfrOrganization(imo);
            go.setItem(imo.getStockItemDirectory().searchStockItem(itemId));
            go.setQuantity(quantity);            
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Quantity must be correct");
        }
    }//GEN-LAST:event_btnOrderItemActionPerformed

    private void btnNewOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewOrder1ActionPerformed

    private void populateOrdersTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        
        for (GoodsOrder go : this.system.getInventoryEnterprise().getInvGoodsOrderQueue().getOrderList()) {                       
                                                                            
            // Adding new row to the table                                       
            model.addRow(new Object[]{go.getOrderID(), "", go.getQuantity(), "", go.getStatus()});                        
        }
    }
    
    private void populateShopTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblShop.getModel();
        model.setRowCount(0);
        
        for (InvManufacturerOrganization imo : this.system.getInventoryEnterprise().getInvManOrgList()) {
            
            for (StockItem si : imo.getStockItemDirectory().getStockItemList()) {
                                                                            
                // Adding new row to the table                                       
                model.addRow(new Object[]{si.getItemId() ,si.getItemName(), si.getQuantity(), si.getPrice(), imo.getName()});            
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewOrder1;
    private javax.swing.JButton btnOrderItem;
    private javax.swing.JTextField fldQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDispName;
    private javax.swing.JLabel lblDispRole;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JPanel paneOrders;
    private javax.swing.JPanel paneShop;
    private javax.swing.JPanel paneWelcome;
    private javax.swing.JTabbedPane tbdPane;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblShop;
    // End of variables declaration//GEN-END:variables
}
