package model;

import model.UserAccount.*;
import model.Enterprise.*;
import model.Order.GoodsOrder;
import model.Order.GoodsOrderQueue;
import model.Order.ShopOrderQueue;
import model.Organization.InvDistributorOrganization;
import model.Organization.InvManufacturerOrganization;
import model.Organization.InvTransportationOrganization;
import model.Organization.OnlineStoreOrganization;
import model.Organization.LocalStoreOrganization;
import model.Organization.TaxationOrganization;
import model.StockItem.StockItem;

/**
 *
 * @author saidutt
 */
public class StoreMgmtSystem {

    private final UserAccountDirectory userAccountDirectory;
    
    private ComplianceEnterprise complianceEnterprise;
    private InventoryEnterprise inventoryEnterprise;
    private StoreEnterprise storeEnterprise;
    private final ECommerceEnterprise eCommerceEnterprise;
    
    private final GoodsOrderQueue goQueue;
    private final ShopOrderQueue soQueue;
    
    
    public StoreMgmtSystem() {
        
        userAccountDirectory = new UserAccountDirectory();     
        
        complianceEnterprise = new ComplianceEnterprise();
        inventoryEnterprise = new InventoryEnterprise();
        storeEnterprise = new StoreEnterprise();                
        eCommerceEnterprise = new ECommerceEnterprise();
        
        goQueue = new GoodsOrderQueue();
        soQueue = new ShopOrderQueue();                
        
        initData();
    }
    
    public final void initData() {
                
//        userAccountDirectory.newUserAccount("customer", "customer", 1);
//        userAccountDirectory.newUserAccount("odeliveryman", "odeliveryman", 2);        

        // add items
        // INV ORGANIZATIONS
        InvManufacturerOrganization imo = inventoryEnterprise.newInvManufacturerOrganization();
        InvDistributorOrganization ido = inventoryEnterprise.newInvDistributorOrganization();
        InvTransportationOrganization ito = inventoryEnterprise.newInvTransportationOrganization();
        
        // adding goods order
        GoodsOrder go = inventoryEnterprise.getInvGoodsOrderQueue().newOrder(); 
        
        // E-COMM ORGANIZATIONS
        OnlineStoreOrganization oso = this.eCommerceEnterprise.newLocalStoreOrganization();
        
        // OFFLINE SHOP ORG
        LocalStoreOrganization so = this.storeEnterprise.newLocalStoreOrganization();
        
        // Compliance enterprise
        TaxationOrganization to = this.complianceEnterprise.newTaxationOrganization();
        
        StockItem si = imo.getStockItemDirectory().newStockItem("stockitem1", 100, 15, 10);                                      
        imo.getStockItemDirectory().newStockItem("stockitem2", 110, 10, 8);
        imo.getStockItemDirectory().newStockItem("stockitem3", 120, 5, 5);                
                        
        go.setDistributorOrganization(ido);       
        go.setItem(si);      
        go.setMfrOrganization(imo);
        go.setOrderType(0);
        go.setQuantity(0);
        go.setTaxPc(0);
        go.setTotalSellingPrice(0);                   
        
        userAccountDirectory.newUserAccount("admin", "admin", 0); 
        oso.newUserAccount("ocus1", "ocus1", 1);
        oso.newUserAccount("odel1", "odel1", 2);        
        so.newUserAccount("mgr1", "mgr1", 3);
        so.newUserAccount("emp1", "emp1", 4);           
        to.newUserAccount("ta1", "ta1", 5); 
        ito.newUserAccount("gtrans", "gtrans", 6);    
        imo.newUserAccount("gmfr", "gmfr", 7);
        ido.newUserAccount("gdis", "gdis", 8);                
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }

    public ComplianceEnterprise getComplianceEnterprise() {
        return complianceEnterprise;
    }

    public void setComplianceEnterprise(ComplianceEnterprise complianceEnterprise) {
        this.complianceEnterprise = complianceEnterprise;
    }

    public InventoryEnterprise getInventoryEnterprise() {
        return inventoryEnterprise;
    }

    public void setInventoryEnterprise(InventoryEnterprise inventoryEnterprise) {
        this.inventoryEnterprise = inventoryEnterprise;
    }

    public StoreEnterprise getStoreEnterprise() {
        return storeEnterprise;
    }

    public void setStoreEnterprise(StoreEnterprise storeEnterprise) {
        this.storeEnterprise = storeEnterprise;
    }

    public ECommerceEnterprise getCustomerEnterprise() {
        return eCommerceEnterprise;
    }

    public GoodsOrderQueue getGoodsOrderQueue() {
        return goQueue;
    }

    public ShopOrderQueue getShopOrderQueue() {
        return soQueue;
    }
}
