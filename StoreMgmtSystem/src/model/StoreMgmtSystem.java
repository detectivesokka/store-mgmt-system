package model;

import model.UserAccount.*;
import model.Enterprise.*;
import model.Order.GoodsOrderQueue;
import model.Order.ShopOrderQueue;

/**
 *
 * @author saidutt
 */
public class StoreMgmtSystem {

    private UserAccountDirectory userAccountDirectory;
    
    private ComplianceEnterprise complianceEnterprise;
    private InventoryEnterprise inventoryEnterprise;
    private StoreEnterprise storeEnterprise;
    private CustomerEnterprise customerEnterprise;
    
    private GoodsOrderQueue goQueue;
    private ShopOrderQueue soQueue;
    
    
    public StoreMgmtSystem() {
        
        userAccountDirectory = new UserAccountDirectory();     
        
        complianceEnterprise = new ComplianceEnterprise();
        inventoryEnterprise = new InventoryEnterprise();
        storeEnterprise = new StoreEnterprise();                
        customerEnterprise = new CustomerEnterprise();
        
        goQueue = new GoodsOrderQueue();
        soQueue = new ShopOrderQueue();                
        
        initData();
    }
    
    public void initData() {
        
        userAccountDirectory.newUserAccount("admin", "admin", 0);
        userAccountDirectory.newUserAccount("customer", "customer", 1);
        userAccountDirectory.newUserAccount("odeliveryman", "odeliveryman", 2);        
        //userAccountDirectory.newUserAccount("gmfr", "gmfr", 7);        
        //userAccountDirectory.newUserAccount("gdis", "gdis", 8);        
        //userAccountDirectory.newUserAccount("gtran", "gtran", 6);                
        
        // add items
        inventoryEnterprise.newInvManufacturerOrganization().newUserAccount("gmfr", "gmfr", 7);
        inventoryEnterprise.newInvDistributorOrganization().newUserAccount("gdis", "gdis", 8);
        inventoryEnterprise.newInvDistributorOrganization().newUserAccount("gtrans", "gtrans", 6);                
        
        inventoryEnterprise.getInvManOrgList().get(0).getStockItemDirectory().newStockItem("stockitem1", 100, 15, 10);
        inventoryEnterprise.getInvManOrgList().get(0).getStockItemDirectory().newStockItem("stockitem2", 110, 10, 8);
        inventoryEnterprise.getInvManOrgList().get(0).getStockItemDirectory().newStockItem("stockitem3", 120, 5, 5);
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

    public CustomerEnterprise getCustomerEnterprise() {
        return customerEnterprise;
    }

    public GoodsOrderQueue getGoodsOrderQueue() {
        return goQueue;
    }

    public ShopOrderQueue getShopOrderQueue() {
        return soQueue;
    }            
}
