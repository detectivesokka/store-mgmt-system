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
        userAccountDirectory.newUserAccount("ocustomer", "ocustomer", 2);
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }          
    
}
