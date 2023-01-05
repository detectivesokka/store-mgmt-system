package model.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    private int userCount = 1;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount searchUser(String name) {
        
        for(UserAccount e : this.userAccountList){
            
            if(e.getUserName().equals(name)) {
                
                return e;
            }
        }       
        
        return null;
    }
    
    public void deleteUser (String name) { 
        
        UserAccount e;                
        
        e = searchUser(name);
        
        if (e != null) {
                        
            this.userAccountList.remove(e);                        
        }                
    }

    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        UserAccount ua = new UserAccount(userCount++, pUserName, pPassword, pRole);
        this.userAccountList.add(ua);
        return ua;        
    }
}
