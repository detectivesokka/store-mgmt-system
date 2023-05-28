package userinterface.RolesWorkArea;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import model.Enterprise.StoreEnterprise;
import model.Order.Order;
import model.Organization.LocalStoreOrganization;
import model.StockItem.StockItem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class ShopEmpJPanel extends javax.swing.JPanel {

    private final UserAccount user;
    /**
     * Creates new form ShopEmpJPanel
     * @param pUser
     */
    public ShopEmpJPanel(UserAccount pUser) {
        
        initComponents();
        this.user = pUser;
        
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
        panePointOfSale = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboItem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fldQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

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
                .addGap(354, 354, 354)
                .addComponent(lblWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneWelcomeLayout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDispName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDispRole, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(292, 292, 292))
        );
        paneWelcomeLayout.setVerticalGroup(
            paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneWelcomeLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneWelcomeLayout.createSequentialGroup()
                        .addComponent(lblWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDispName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDispRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(337, Short.MAX_VALUE))
        );

        tbdPane.addTab("Welcome", paneWelcome);

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Item", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrders);

        javax.swing.GroupLayout paneOrdersLayout = new javax.swing.GroupLayout(paneOrders);
        paneOrders.setLayout(paneOrdersLayout);
        paneOrdersLayout.setHorizontalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        paneOrdersLayout.setVerticalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        tbdPane.addTab("Orders", paneOrders);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order details");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Quantity");

        comboItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an item" }));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Item");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Total");

        lblTotal.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panePointOfSaleLayout = new javax.swing.GroupLayout(panePointOfSale);
        panePointOfSale.setLayout(panePointOfSaleLayout);
        panePointOfSaleLayout.setHorizontalGroup(
            panePointOfSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panePointOfSaleLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(panePointOfSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panePointOfSaleLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panePointOfSaleLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fldQuantity))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panePointOfSaleLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(317, 317, 317))
            .addGroup(panePointOfSaleLayout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panePointOfSaleLayout.setVerticalGroup(
            panePointOfSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePointOfSaleLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panePointOfSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panePointOfSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panePointOfSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 370, Short.MAX_VALUE))
        );

        tbdPane.addTab("Point of Sale", panePointOfSale);

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

            case 1 : populateShopTable();
            break;
            case 2: populateItemList();
        }
    }//GEN-LAST:event_tbdPaneStateChanged

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        try {
            
            LocalStoreOrganization lso = (LocalStoreOrganization) this.user.getParentOrg();
            Order o = lso.getSalesOrderQueue().newOrder();

            o.setItemName((String) this.comboItem.getSelectedItem());
            o.setQuantity(Integer.parseInt(this.fldQuantity.getText()));
            o.setTotalSellingPrice(Double.parseDouble(this.lblTotal.getText()));

            StockItem si = lso.getStockItemDirectory().searchStockItem((String) this.comboItem.getSelectedItem());
            si.setQuantity(si.getQuantity() - o.getQuantity());

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    private void populateShopTable() {

        DefaultTableModel model = (DefaultTableModel) this.tblOrders.getModel();
        model.setRowCount(0);

        LocalStoreOrganization lso = (LocalStoreOrganization) this.user.getParentOrg();

        for (Order o : lso.getSalesOrderQueue().getLocalSalesOrders()) {

            model.addRow(new Object[]{o.getOrderID(), o.getItemName(), o.getQuantity(), o.getTotalSellingPrice()});
        }

    }
    
    private void populateItemList() {
        
        
        for (StockItem si : ((LocalStoreOrganization)this.user.getParentOrg()).getStockItemDirectory().getStockItemList()) {
            
            this.comboItem.addItem(si.getItemName());
            
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboItem;
    private javax.swing.JTextField fldQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDispName;
    private javax.swing.JLabel lblDispRole;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JPanel paneOrders;
    private javax.swing.JPanel panePointOfSale;
    private javax.swing.JPanel paneWelcome;
    private javax.swing.JTabbedPane tbdPane;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
