package userinterface.RolesWorkArea;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import model.Order.GoodsOrder;
import model.Order.OnlineOrder;
import model.Organization.InvDistributorOrganization;
import model.Organization.InvManufacturerOrganization;
import model.Organization.OnlineStoreOrganization;
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
        btnCancelOrder = new javax.swing.JButton();
        paneOnlineOrders = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOnlineOrders = new javax.swing.JTable();
        btnCancelOnlineOrder = new javax.swing.JButton();
        paneShopOrders = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblShopOrders = new javax.swing.JTable();
        btnCancelShopOrder = new javax.swing.JButton();
        paneInventory = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fldSellingPrice = new javax.swing.JTextField();
        btnSetSellingPrice = new javax.swing.JButton();
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
                "Order ID", "Item", "Quantity", "Supplier", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrders);

        btnCancelOrder.setText("Cancel order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneOrdersLayout = new javax.swing.GroupLayout(paneOrders);
        paneOrders.setLayout(paneOrdersLayout);
        paneOrdersLayout.setHorizontalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneOrdersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        paneOrdersLayout.setVerticalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOrdersLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelOrder)
                .addContainerGap())
        );

        tbdPane.addTab("Orders", paneOrders);

        tblOnlineOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Item", "Quantity", "Supplier", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblOnlineOrders);

        btnCancelOnlineOrder.setText("Cancel order");
        btnCancelOnlineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOnlineOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneOnlineOrdersLayout = new javax.swing.GroupLayout(paneOnlineOrders);
        paneOnlineOrders.setLayout(paneOnlineOrdersLayout);
        paneOnlineOrdersLayout.setHorizontalGroup(
            paneOnlineOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneOnlineOrdersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelOnlineOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        paneOnlineOrdersLayout.setVerticalGroup(
            paneOnlineOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOnlineOrdersLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelOnlineOrder)
                .addContainerGap())
        );

        tbdPane.addTab("Online Orders", paneOnlineOrders);

        tblShopOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Item", "Quantity", "Supplier", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblShopOrders);

        btnCancelShopOrder.setText("Cancel order");
        btnCancelShopOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelShopOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneShopOrdersLayout = new javax.swing.GroupLayout(paneShopOrders);
        paneShopOrders.setLayout(paneShopOrdersLayout);
        paneShopOrdersLayout.setHorizontalGroup(
            paneShopOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneShopOrdersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelShopOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        paneShopOrdersLayout.setVerticalGroup(
            paneShopOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneShopOrdersLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelShopOrder)
                .addContainerGap())
        );

        tbdPane.addTab("Shop Orders", paneShopOrders);

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item", "Avail quantity", "Cost price", "Selling price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblInventory);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Selling price");

        fldSellingPrice.setText("0");
        fldSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldSellingPriceActionPerformed(evt);
            }
        });

        btnSetSellingPrice.setText("Set");
        btnSetSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetSellingPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneInventoryLayout = new javax.swing.GroupLayout(paneInventory);
        paneInventory.setLayout(paneInventoryLayout);
        paneInventoryLayout.setHorizontalGroup(
            paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(paneInventoryLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSetSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneInventoryLayout.setVerticalGroup(
            paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInventoryLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldSellingPrice)
                    .addComponent(btnSetSellingPrice)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        tbdPane.addTab("Inventory", paneInventory);

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
                .addGap(266, 266, 266)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldQuantity)
                    .addComponent(btnOrderItem)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            case 2 : populateInventoryTable();
            break;
            case 3 : populateShopTable();
            break;
            case 4: populateOnlineOrdersTable();
            break;
            case 5: populateShopOrdersTable();
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
            go.setStatus("Order placed by Distributor");
            JOptionPane.showMessageDialog(null, "Order placed!");
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Quantity must be correct");
        }
        
        
    }//GEN-LAST:event_btnOrderItemActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        
        int rowIndex = this.tblOrders.getSelectedRow();
        int orderId;
        
        try {
            
            orderId = Integer.parseInt(this.tblShop.getValueAt(rowIndex,0).toString());            
            this.system.getInventoryEnterprise().getInvGoodsOrderQueue().deleteOrder(orderId);
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Order no longer exists");
            
        } 
                 
        populateOrdersTable();        
                
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnSetSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetSellingPriceActionPerformed
        
        int rowIndex = this.tblInventory.getSelectedRow();
        int itemId;
        StockItem si;
        
        float sellingPrice;

        if(rowIndex < 0) {

            JOptionPane.showMessageDialog(null, "Please select column");
            return;
        }
        
        try {
            sellingPrice = Float.parseFloat(this.fldSellingPrice.getText());
            
            if (sellingPrice <= 0) {
                
                throw new Exception("Selling price can't be less or equal to 0");
            }
            
            itemId=Integer.parseInt(this.tblInventory.getValueAt(rowIndex,0).toString());                
            
            si = ((InvDistributorOrganization)this.user.getParentOrg()).getStockItemDirectory().searchStockItem(itemId);            
            si.setSellingPrice(sellingPrice);
            
            JOptionPane.showMessageDialog(null, "Selling price set");
            populateInventoryTable();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnSetSellingPriceActionPerformed

    private void fldSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldSellingPriceActionPerformed

    private void btnCancelOnlineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOnlineOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelOnlineOrderActionPerformed

    private void btnCancelShopOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelShopOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelShopOrderActionPerformed

    private void populateOrdersTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        
        for (GoodsOrder go : this.system.getInventoryEnterprise().getInvGoodsOrderQueue().getOrderList()) {                       
                                                                            
            // Adding new row to the table                                       
            model.addRow(new Object[]{go.getOrderID(), go.getItem().getItemName(), go.getQuantity(), go.getFrom(), go.getStatus()});
        }
    }
    
    private void populateShopTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblShop.getModel();
        model.setRowCount(0);
        
        for (InvManufacturerOrganization imo : this.system.getInventoryEnterprise().getInvManOrgList()) {
            
            for (StockItem si : imo.getStockItemDirectory().getStockItemList()) {
                                                                            
                // Adding new row to the table 
                if (si.getSellingPrice() == 0f) {
                    
                    model.addRow(new Object[]{si.getItemId() ,si.getItemName(), si.getQuantity() ,"-", imo.getName()});            
                    
                } else {
                    
                    model.addRow(new Object[]{si.getItemId() ,si.getItemName(), si.getQuantity(), si.getSellingPrice(), imo.getName()});            
                }
            }
        }
    }
    
    private void populateInventoryTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblInventory.getModel();
        model.setRowCount(0);
        
        for (StockItem si : ((InvDistributorOrganization)this.user.getParentOrg()).getStockItemDirectory().getStockItemList()) {
                                        
            // Adding new row to the table                                       
            model.addRow(new Object[]{si.getItemId(), si.getItemName(), si.getQuantity(), si.getPrice(), si.getSellingPrice()});
        }
    }
    
    private void populateOnlineOrdersTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblOnlineOrders.getModel();
        model.setRowCount(0);
        
        for (OnlineStoreOrganization oso : this.system.getCustomerEnterprise().getOnlineStrOrgList()) {
            
            for (OnlineOrder o : oso.getOnlineOrderQueue().getOnlineOrders()) {
                
                if (o.getInvDisOrganization() == this.user.getParentOrg()) {
                
                    model.addRow(new Object[] {o.getOrderID(), o.getItem().getItemName(), o.getQuantity(), o.getInvDisOrganization().getName(), o.getStatus()});
                }
            }            
        }
        
    }
    
    private void populateShopOrdersTable() {
        
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOnlineOrder;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnCancelShopOrder;
    private javax.swing.JButton btnOrderItem;
    private javax.swing.JButton btnSetSellingPrice;
    private javax.swing.JTextField fldQuantity;
    private javax.swing.JTextField fldSellingPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblDispName;
    private javax.swing.JLabel lblDispRole;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JPanel paneInventory;
    private javax.swing.JPanel paneOnlineOrders;
    private javax.swing.JPanel paneOrders;
    private javax.swing.JPanel paneShop;
    private javax.swing.JPanel paneShopOrders;
    private javax.swing.JPanel paneWelcome;
    private javax.swing.JTabbedPane tbdPane;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblOnlineOrders;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblShop;
    private javax.swing.JTable tblShopOrders;
    // End of variables declaration//GEN-END:variables
}
