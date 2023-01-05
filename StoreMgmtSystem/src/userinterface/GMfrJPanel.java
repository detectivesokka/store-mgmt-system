package userinterface;

import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class GMfrJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GoodsManufacturer
     */
    public GMfrJPanel(UserAccount pUserAccount) {
        
        initComponents();
        customizeWelcomeScreen(pUserAccount);
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
        paneInventory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnEditItem = new javax.swing.JButton();
        paneOrders = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();

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
                .addContainerGap(215, Short.MAX_VALUE))
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
                .addContainerGap(188, Short.MAX_VALUE))
        );

        tbdPane.addTab("Welcome", paneWelcome2);

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Item price", "Tax bracket", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventory);

        btnAddItem.setText("Add Item");

        btnDeleteItem.setText("Delete Item");

        btnEditItem.setText("Edit Item");

        javax.swing.GroupLayout paneInventoryLayout = new javax.swing.GroupLayout(paneInventory);
        paneInventory.setLayout(paneInventoryLayout);
        paneInventoryLayout.setHorizontalGroup(
            paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(paneInventoryLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btnAddItem)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteItem)
                .addGap(18, 18, 18)
                .addComponent(btnEditItem)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        paneInventoryLayout.setVerticalGroup(
            paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInventoryLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnDeleteItem)
                    .addComponent(btnEditItem))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        tbdPane.addTab("Inventory", paneInventory);

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblOrders);

        javax.swing.GroupLayout paneOrdersLayout = new javax.swing.GroupLayout(paneOrders);
        paneOrders.setLayout(paneOrdersLayout);
        paneOrdersLayout.setHorizontalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        paneOrdersLayout.setVerticalGroup(
            paneOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOrdersLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbdPane.addTab("Orders", paneOrders);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbdPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbdPaneStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tbdPaneStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnEditItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDispName;
    private javax.swing.JLabel lblDispRole;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWelcome1;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JPanel paneInventory;
    private javax.swing.JPanel paneOrders;
    private javax.swing.JPanel paneWelcome;
    private javax.swing.JPanel paneWelcome1;
    private javax.swing.JPanel paneWelcome2;
    private javax.swing.JTabbedPane tbdPane;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
