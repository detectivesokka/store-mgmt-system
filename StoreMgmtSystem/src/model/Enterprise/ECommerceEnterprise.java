package model.Enterprise;

import java.io.Serializable;
import java.util.ArrayList;
import model.Organization.OnlineStoreOrganization;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class ECommerceEnterprise extends Enterprise implements Serializable {

    private ArrayList<OnlineStoreOrganization> onlineStrOrgList;    
    
    public ECommerceEnterprise(StoreMgmtSystem pSystem) {
        super(0, pSystem);
        onlineStrOrgList = new ArrayList<>();       
    }                    

    public ArrayList<OnlineStoreOrganization> getOnlineStrOrgList() {
        return onlineStrOrgList;
    }

    public OnlineStoreOrganization newOnlineStoreOrganization(String text) {
        
        OnlineStoreOrganization imf = new OnlineStoreOrganization(this, text);
        this.onlineStrOrgList.add(imf);
        return imf;        
    }
    
    public ArrayList<Object> searchUserAccount(String pUsername, String pPassword) {
        
        UserAccount user;       
        ArrayList<Object> result = new ArrayList<>();
        
        for (OnlineStoreOrganization imo : this.onlineStrOrgList) {
            
            user = imo.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                                
                result.add(imo);
                result.add(user);
                return result;
            }
        }         
        
        return null;
    }    

    public OnlineStoreOrganization searchOnlineOrganization(String organizationName) {
        
        for (OnlineStoreOrganization imo : this.onlineStrOrgList) {                     
            
            if(imo.getName().equals(organizationName)) {
                                                                
                return imo;
            }
        }         
        
        return null;        
    }
}
