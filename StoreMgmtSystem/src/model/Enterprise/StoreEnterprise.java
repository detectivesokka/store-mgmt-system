package model.Enterprise;

import java.io.Serializable;
import java.util.ArrayList;
import model.Order.ShopOrder;
import model.Organization.InvDistributorOrganization;
import model.Organization.InvTransportationOrganization;
import model.Organization.LocalStoreOrganization;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class StoreEnterprise extends Enterprise implements Serializable {

    private ArrayList<LocalStoreOrganization> localOrgList;    
    
    public StoreEnterprise(StoreMgmtSystem pSystem) {
        
        super(1, pSystem);
        localOrgList = new ArrayList<>();
        
    }

    public ArrayList<LocalStoreOrganization> getLocalOrgList() {
        return localOrgList;
    }
       
    public LocalStoreOrganization newLocalStoreOrganization(String text) {
        
        LocalStoreOrganization imf = new LocalStoreOrganization(this, text);
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

    public LocalStoreOrganization searchLocalStoreOrganization(String organizationName) {
        
        for (LocalStoreOrganization imo : this.localOrgList) {                        
            
            if(imo.getName().equals(organizationName)) {
                                                                
                return imo;
            }
        }         
        
        return null;        
    }

    public ShopOrder searchShopOrders(int pOrderId, String pOrg) {
        
        for (LocalStoreOrganization imo : this.localOrgList) {                        
            
            for (ShopOrder so : imo.getShopOrderQueue().getOrderList()) {
                
                if (so.getInvDistributorOrganization().getName().equals(pOrg) && so.getOrderID() == pOrderId) {
                    
                    return so;
                }                
            }
        }
        return null;
    }
}
