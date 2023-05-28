package model.Organization;

import model.Enterprise.InventoryEnterprise;
import model.Order.OnlineOrderQueue;
import model.StockItem.StockItemDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 **/
public class InvDistributorOrganization extends Organization {
        
    private final UserAccountDirectory userAccountDirectory;
    private final InventoryEnterprise parentInvEnterprise;
    private final StockItemDirectory stockItemDirectory;      
    
    public InvDistributorOrganization(InventoryEnterprise pParent, String pName) {
                
        this.userAccountDirectory = new UserAccountDirectory(this);        
        this.stockItemDirectory = new StockItemDirectory(this);        
        
        this.setName(pName);
        this.parentInvEnterprise = pParent;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }

    public InventoryEnterprise getParentInvEnterprise() {
        return parentInvEnterprise;
    }        

    public StockItemDirectory getStockItemDirectory() {
        return stockItemDirectory;
    }           
}
