package model.Organization;

import model.Enterprise.StoreEnterprise;
import model.StockItem.StockItemDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class LocalStoreOrganization extends Organization {
    
    private final StockItemDirectory stockItemDirectory;
    private final UserAccountDirectory userAccountDirectory;    
    private final StoreEnterprise storeEnterprise;
    
    public LocalStoreOrganization(StoreEnterprise pParent, String pName) {
        
        this.stockItemDirectory = new StockItemDirectory(this);
        this.userAccountDirectory = new UserAccountDirectory();
        this.storeEnterprise = pParent;
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
        return storeEnterprise;
    }     
}
