package model.Organization;

import model.Enterprise.ECommerceEnterprise;
import model.Order.OnlineOrderQueue;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class OnlineStoreOrganization extends Organization {
        
    private final UserAccountDirectory userAccountDirectory;    
    private final ECommerceEnterprise eCommerceEnterprise;
    private final OnlineOrderQueue onlineOrderQueue;        
    
    public OnlineStoreOrganization(ECommerceEnterprise pParent, String pName) {
                
        this.userAccountDirectory = new UserAccountDirectory(this);
        this.onlineOrderQueue = new OnlineOrderQueue(this);
        this.eCommerceEnterprise = pParent;
        this.setName(pName);
    }        
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }    

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public ECommerceEnterprise geteCommerceEnterprise() {
        return eCommerceEnterprise;
    }     

    public OnlineOrderQueue getOnlineOrderQueue() {
        return onlineOrderQueue;
    }        
}
