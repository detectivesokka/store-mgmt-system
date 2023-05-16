package model.Organization;

import model.Enterprise.ECommerceEnterprise;
import model.Order.OnlineOrderQueue;
import model.Order.ShopOrderQueue;
import model.StockItem.StockItemDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;
import org.xml.sax.SAXException;

/**
 *
 * @author saidutt
 */
public class OnlineStoreOrganization extends Organization {
    
    private final StockItemDirectory stockItemDirectory;
    private final UserAccountDirectory userAccountDirectory;    
    private final ECommerceEnterprise eCommerceEnterprise;
    private final OnlineOrderQueue onlineOrderQueue;        
    
    public OnlineStoreOrganization(ECommerceEnterprise pParent, String pName) {
        
        this.stockItemDirectory = new StockItemDirectory(this);
        this.userAccountDirectory = new UserAccountDirectory(this);
        this.onlineOrderQueue = new OnlineOrderQueue();
        this.eCommerceEnterprise = pParent;
        this.setName(pName);
    }        
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }

    public StockItemDirectory getStockItemDirectory() {
        return stockItemDirectory;
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
