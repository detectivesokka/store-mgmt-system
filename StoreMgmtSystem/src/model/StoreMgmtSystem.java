package model;

import model.UserAccount.*;
import model.Enterprise.*;
import model.Order.GoodsOrderQueue;
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

    private UserAccount superAdmin;
    
    private ComplianceEnterprise complianceEnterprise;
    private InventoryEnterprise inventoryEnterprise;
    private StoreEnterprise storeEnterprise;
    private ECommerceEnterprise eCommerceEnterprise;
    
    private GoodsOrderQueue goQueue;    
           
    
    public StoreMgmtSystem() {               
        
        complianceEnterprise = new ComplianceEnterprise(this);
        inventoryEnterprise = new InventoryEnterprise(this);
        storeEnterprise = new StoreEnterprise(this);                
        eCommerceEnterprise = new ECommerceEnterprise(this);
        
        goQueue = new GoodsOrderQueue();        
        
        //initData();
    }
    
    public void initData() {
                
        // add items
        // INV ORGANIZATIONS
        InvManufacturerOrganization imo = inventoryEnterprise.newInvManufacturerOrganization("imo1");
        InvDistributorOrganization ido = inventoryEnterprise.newInvDistributorOrganization("ido1");
        InvTransportationOrganization ito = inventoryEnterprise.newInvTransportationOrganization("ito1");
                        
        // E-COMM ORGANIZATIONS
        OnlineStoreOrganization oso = this.eCommerceEnterprise.newOnlineStoreOrganization("oso1");
        
        // OFFLINE SHOP ORG
        LocalStoreOrganization so = this.storeEnterprise.newLocalStoreOrganization("lso1");
        
        // Compliance enterprise
        TaxationOrganization to = this.complianceEnterprise.newTaxationOrganization("to1");
        
        StockItem si = imo.getStockItemDirectory().newStockItem("stockitem1", 100.0f, 120.0f, 15, 10);                                      
        imo.getStockItemDirectory().newStockItem("stockitem2", 110f, 150f, 10, 8);
        imo.getStockItemDirectory().newStockItem("stockitem3", 120f, 122f, 5, 5);                
                                        
        this.superAdmin = new UserAccount("admin", "admin");
        
        oso.newUserAccount("ocus1", "ocus1", 1);
        oso.newUserAccount("odel1", "odel1", 2);        
        so.newUserAccount("mgr1", "mgr1", 3);
        so.newUserAccount("emp1", "emp1", 4);           
        to.newUserAccount("ta1", "ta1", 5); 
        ito.newUserAccount("gtrans", "gtrans", 6);    
        imo.newUserAccount("gmfr", "gmfr", 7);
        ido.newUserAccount("gdis", "gdis", 8);                       
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

    public UserAccount getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(UserAccount superAdmin) {
        this.superAdmin = superAdmin;
    }        
}
