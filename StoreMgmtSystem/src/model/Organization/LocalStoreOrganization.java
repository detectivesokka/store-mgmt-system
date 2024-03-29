package model.Organization;

import java.io.Serializable;
import model.Enterprise.StoreEnterprise;
import model.Order.LocalSalesOrderQueue;
import model.Order.ShopOrderQueue;
import model.StockItem.StockItemDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class LocalStoreOrganization extends Organization implements Serializable {
    
    private StockItemDirectory stockItemDirectory;
    private UserAccountDirectory userAccountDirectory;
    private StoreEnterprise parent;
    private ShopOrderQueue shopOrderQueue;        
    private LocalSalesOrderQueue salesOrderQueue;    
    
    public LocalStoreOrganization(StoreEnterprise pParent, String pName) {
        
        this.stockItemDirectory = new StockItemDirectory(this);
        this.userAccountDirectory = new UserAccountDirectory(this);                
        this.parent = pParent;
        this.shopOrderQueue = new ShopOrderQueue(this);
        this.salesOrderQueue = new LocalSalesOrderQueue(this);
        this.setName(pName);
    }        
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }

    public StockItemDirectory getStockItemDirectory() {
        return stockItemDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public StoreEnterprise geteCommerceEnterprise() {
        return parent;
    }     

    public StoreEnterprise getParent() {
        return parent;
    }

    public ShopOrderQueue getShopOrderQueue() {
        return shopOrderQueue;
    }        

    public LocalSalesOrderQueue getSalesOrderQueue() {
        return salesOrderQueue;
    }        

    public float getTotalRevenue() {
        
        return this.salesOrderQueue.getTotalRevenue();
        
    }

    public float getTotalTaxAmount() {
        
        return this.salesOrderQueue.getTotalTaxAmount();
        
    }
}
