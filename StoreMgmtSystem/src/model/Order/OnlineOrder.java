package model.Order;

import model.Organization.InvDistributorOrganization;
import model.StockItem.StockItem;
import model.UserAccount.UserAccount;

/**
 * This order tracks the purchase from the distributor by an online customer 
 * @author saidutt
 */
public class OnlineOrder extends Order{
        
    private InvDistributorOrganization ido;    
    private StockItem item;
    private UserAccount customer;
    
    public OnlineOrder(int pId) {
        super(pId);
    }    

    public InvDistributorOrganization getInvDisOrganization() {
        
        return ido;
    }

    public void setInvDisOrganization(InvDistributorOrganization ido) {
        
        this.ido = ido;
    }    

    public StockItem getItem() {
        
        return item;
    }

    public void setItem(StockItem item) {
        
        this.item = item;
    }    
   
    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }        
}
