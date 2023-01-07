package model.Organization;

import model.StockItem.StockItemDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class InvManufacturerOrganization extends Organization {
    
    private StockItemDirectory stockItemDirectory;
    private UserAccountDirectory userAccountDirectory;    

    public InvManufacturerOrganization(StockItemDirectory stockItemDirectory, UserAccountDirectory userAccountDirectory) {
        
        this.stockItemDirectory = stockItemDirectory;
        this.userAccountDirectory = userAccountDirectory;
    }        

    public InvManufacturerOrganization() {
        
        stockItemDirectory = new StockItemDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }
    
    public StockItemDirectory getStockItemDirectory() {
        
        return stockItemDirectory;
    }

    public void setStockItemDirectory(StockItemDirectory stockItemDirectory) {
        
        this.stockItemDirectory = stockItemDirectory;
    }             
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        
        this.userAccountDirectory = userAccountDirectory;
    }        
}
