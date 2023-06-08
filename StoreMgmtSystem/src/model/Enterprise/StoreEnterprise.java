package model.Enterprise;

import java.io.Serializable;
import java.util.ArrayList;
import model.Organization.LocalStoreOrganization;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class StoreEnterprise extends Enterprise implements Serializable {

    private final ArrayList<LocalStoreOrganization> localOrgList;    
    
    public StoreEnterprise(StoreMgmtSystem pSystem) {
        
        super(1, pSystem);
        localOrgList = new ArrayList<>();
        
    }

    public ArrayList<LocalStoreOrganization> getLocalOrgList() {
        return localOrgList;
    }
       
    public LocalStoreOrganization newLocalStoreOrganization() {
        
        LocalStoreOrganization imf = new LocalStoreOrganization(this, "imo1");
        this.localOrgList.add(imf);
        return imf;        
    }
    
    public ArrayList<Object> searchUserAccount(String pUsername, String pPassword) {
        
        UserAccount user;       
        ArrayList<Object> result = new ArrayList<>();
        
        for (LocalStoreOrganization imo : this.localOrgList) {
            
            user = imo.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                                
                result.add(imo);
                result.add(user);
                return result;
            }
        }         
        
        return null;
    }
}
