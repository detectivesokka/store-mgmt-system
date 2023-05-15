package userinterface.RolesWorkArea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import model.Order.GoodsOrder;
import model.Organization.InvManufacturerOrganization;
import model.Organization.Organization;
import model.StockItem.StockItem;
import model.UserAccount.UserAccount;
import userinterface.EditStockItem.EditStockItemJPanel;

/**
 *
 * @author saidutt
 */
public class GMfrJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GoodsManufacturer
     */
    private final InvManufacturerOrganization org;
    
    public GMfrJPanel(UserAccount pUserAccount, Organization pOrganization) {
        
        this.org = (InvManufacturerOrganization)pOrganization;
        
        initComponents();
        customizeWelcomeScreen(pUserAccount);                
        populateInventoryTable();        
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
        paneWelcome2 = new javax.swing.JPanel();
        lblWelcome2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblDispName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblDispRole = new javax.swing.JLabel();
        paneOrders = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        btnAcceptOrder = new javax.swing.JButton();
        btnDispatchOrder = new javax.swing.JButton();
        paneInventory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnEditItem = new javax.swing.JButton();

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

        javax.swing.GroupLayout paneWelcome2Layout = new javax.swing.GroupLayout(paneWelcome2);
        paneWelcome2.setLayout(paneWelcome2Layout);
        paneWelcome2Layout.setHorizontalGroup(
            paneWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneWelcome2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(paneWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneWelcome2Layout.createSequentialGroup()
                        .addGroup(paneWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(paneWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDispName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDispRole, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addContainerGap(466, Short.MAX_VALUE))
        );
        paneWelcome2Layout.setVerticalGroup(
            paneWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneWelcome2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(paneWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDispName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDispRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        tbdPane.addTab("Welcome", paneWelcome2);

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Item", "Quantity", "Distributor", "Status"
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

        btnAcceptOrder.setText("Accept order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        btnDispatchOrder.setText("Dispatch order");
        btnDispatchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispatchOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneOrdersLayout = new javax.swing.GroupLayout(paneOrders);
        paneOrders.setLayout(paneOrdersLayout);
        paneOrdersLayout.setHorizontalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneOrdersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcceptOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDispatchOrder)
                .addGap(325, 325, 325))
        );
        paneOrdersLayout.setVerticalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOrdersLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDispatchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbdPane.addTab("Orders", paneOrders);

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Cost", "Tax bracket", "Quantity", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventory);

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setText("Delete Item");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnEditItem.setText("Edit Item");
        btnEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneInventoryLayout = new javax.swing.GroupLayout(paneInventory);
        paneInventory.setLayout(paneInventoryLayout);
        paneInventoryLayout.setHorizontalGroup(
            paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneInventoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditItem)
                .addGap(304, 304, 304))
        );
        paneInventoryLayout.setVerticalGroup(
            paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInventoryLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnDeleteItem)
                    .addComponent(btnEditItem))
                .addContainerGap())
        );

        tbdPane.addTab("Inventory", paneInventory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void tbdPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbdPaneStateChanged
        
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        int index = sourceTabbedPane.getSelectedIndex();

        switch(index) {
            case 1 : populateInventoryTable();
            break;
            case 2 : populateOrdersTable();
            break;
        }
    }//GEN-LAST:event_tbdPaneStateChanged

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        
        JFrame regFrame = new JFrame();
        StockItem si = this.org.getStockItemDirectory().newStockItem();
        
        // Create Edit StockItem JPanel
        EditStockItemJPanel register = new EditStockItemJPanel(si);
        
        regFrame.getContentPane().add(register);
        regFrame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); // Window opens in full size mode
        regFrame.setVisible(true);
        
        populateInventoryTable();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditItemActionPerformed
        
        int itemId = getSelectedItemFromTable();
        
        if (itemId < 0) {
            
            return;
        }
        
        // Create Edit StockItem JPanel
        StockItem si = this.org.getStockItemDirectory().searchStockItem(itemId);        
        EditStockItemJPanel register = new EditStockItemJPanel(si);
        JFrame regFrame = new JFrame();
        regFrame.getContentPane().add(register);
        regFrame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); // Window opens in full size mode
        regFrame.setVisible(true);
        
        populateInventoryTable();
    }//GEN-LAST:event_btnEditItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
                
        int itemId = getSelectedItemFromTable();
        
        if (itemId < 0) {
            
            return;
        }
        
        this.org.getStockItemDirectory().deleteStockItem(itemId);
        populateInventoryTable();
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
               
        
        int rowIndex = this.tblOrders.getSelectedRow();        
        int orderId;
        String status;
        
        try {
            
            orderId=Integer.parseInt(tblOrders.getValueAt(rowIndex,0).toString());
            status = tblOrders.getValueAt(rowIndex,4).toString();
            
            if (status.compareTo("Accepted by Manufacturer") == 0 || status.compareTo("Ready for dispatch") == 0 ) {
                
                JOptionPane.showMessageDialog(null, "Order already accepted");            
                return;
            }
            
            GoodsOrder go = this.org.getParentInvEnterprise().getInvGoodsOrderQueue().searchOrder(orderId);
            go.setStatus("Accepted by Manufacturer");
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Select an order to accept");            
        }
        
        populateOrdersTable();
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void btnDispatchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispatchOrderActionPerformed
        
        int rowIndex = this.tblOrders.getSelectedRow();        
        int orderId;        
        String status;
        
        try {
            
            orderId=Integer.parseInt(tblOrders.getValueAt(rowIndex,0).toString());                                                
            
            GoodsOrder go = this.org.getParentInvEnterprise().getInvGoodsOrderQueue().searchOrder(orderId);
            status = tblOrders.getValueAt(rowIndex,4).toString();
            
            if (status.compareTo("Accepted by Manufacturer") != 0) {
               
                JOptionPane.showMessageDialog(null, "Order not ready to be dispached");            
                return;
            } 
            
            go.dispatchToDistributor();
            go.setStatus("Ready for dispatch");
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Select an order to dispatch");            
        }
        
        populateOrdersTable();
    }//GEN-LAST:event_btnDispatchOrderActionPerformed
    
    private int getSelectedItemFromTable() {
        
        int rowIndex = tblInventory.getSelectedRow();        
        int itemId;
        
        if(rowIndex < 0) {

            return -1;
        }
        
        itemId=Integer.parseInt(tblInventory.getValueAt(rowIndex,0).toString());
        
        return itemId;                        
    }
    
    private void populateInventoryTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblInventory.getModel();
        model.setRowCount(0);
                        
        for(StockItem si : this.org.getStockItemDirectory().getStockItemList()) {          
            
            // Adding new row to the table                                       
            model.addRow(new Object[]{si.getItemId() ,si.getItemName(), si.getPrice(), si.getPcTax(), si.getQuantity(), si.getSellingPrice()});            
        }
    }
    
    private void populateOrdersTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
                        
        for (GoodsOrder goq : this.org.getParentInvEnterprise().getInvGoodsOrderQueue().getOrderList()) {
            
            // Adding new row to the table                                       
            model.addRow(new Object[]{goq.getOrderID(),goq.getItemName(), goq.getQuantity(), goq.getFrom(), goq.getStatus(), "-"});            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnDispatchOrder;
    private javax.swing.JButton btnEditItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDispName;
    private javax.swing.JLabel lblDispRole;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JPanel paneInventory;
    private javax.swing.JPanel paneOrders;
    private javax.swing.JPanel paneWelcome2;
    private javax.swing.JTabbedPane tbdPane;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
