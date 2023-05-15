package model.Enterprise;

import java.util.ArrayList;
import model.Order.ShopOrderQueue;
import model.Organization.OnlineStoreOrganization;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class ECommerceEnterprise extends Enterprise{

    private final ArrayList<OnlineStoreOrganization> onlineStrOrgList;
    private final ShopOrderQueue shopOrderQueue;        
    
    public ECommerceEnterprise(StoreMgmtSystem pSystem) {
        super(0, pSystem);
        onlineStrOrgList = new ArrayList<>();
        shopOrderQueue = new ShopOrderQueue();
    }                    

    public ArrayList<OnlineStoreOrganization> getOnlineStrOrgList() {
        return onlineStrOrgList;
    }

    public OnlineStoreOrganization newLocalStoreOrganization() {
        
        OnlineStoreOrganization imf = new OnlineStoreOrganization(this, "imo1");
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
}
