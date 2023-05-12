package model.Organization;

import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 **/
public class InvDistributorOrganization extends Organization {
        
    private final UserAccountDirectory userAccountDirectory;    
    
    public InvDistributorOrganization() {
                
        userAccountDirectory = new UserAccountDirectory(this);
    }

    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }
}
