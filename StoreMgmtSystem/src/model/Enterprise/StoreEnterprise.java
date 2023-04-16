package model.Enterprise;

import java.util.ArrayList;
import model.Order.ShopOrderQueue;
import model.Organization.LocalStoreOrganization;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class StoreEnterprise extends Enterprise {

    private final ArrayList<LocalStoreOrganization> localOrgList;
    private final ShopOrderQueue shopOrderQueue;        
    
    public StoreEnterprise() {
        
        super(1);
        localOrgList = new ArrayList<>();
        shopOrderQueue = new ShopOrderQueue();
    }

    public ArrayList<LocalStoreOrganization> getLocalOrgList() {
        return localOrgList;
    }
    
    public ShopOrderQueue getShopOrderQueue() {
        return shopOrderQueue;
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
