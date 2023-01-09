package model.Organization;

import model.StockItem.StockItemDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class InvDistributorOrganization extends Organization {
        
    private UserAccountDirectory userAccountDirectory;    
    
    public InvDistributorOrganization() {
                
        userAccountDirectory = new UserAccountDirectory();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }
}
