package model.Organization;

import model.Enterprise.InventoryEnterprise;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class InvTransportationOrganization extends Organization{
    
     private final UserAccountDirectory userAccountDirectory; 
     private final InventoryEnterprise parentInvEnterprise;
    
    public InvTransportationOrganization(InventoryEnterprise pParent) {
                
        userAccountDirectory = new UserAccountDirectory(this);
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
}
