package model;

import model.UserAccount.*;

/**
 *
 * @author saidutt
 */
public class StoreMgmtSystem {

    private UserAccountDirectory userAccountDirectory;
    
    public StoreMgmtSystem() {
        
        userAccountDirectory = new UserAccountDirectory();        
        initData();
    }
    
    public void initData() {
        
        userAccountDirectory.newUserAccount("admin", "admin", 0);
        userAccountDirectory.newUserAccount("customer", "customer", 1);
        userAccountDirectory.newUserAccount("odeliveryman", "odeliveryman", 2);        
        userAccountDirectory.newUserAccount("gmfr", "gmfr", 7);        
        userAccountDirectory.newUserAccount("gdis", "gdis", 8);        
        userAccountDirectory.newUserAccount("gtran", "gtran", 6);                
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }          
    
}
