package model.Order;

import model.Organization.InvDistributorOrganization;
import model.Organization.InvManufacturerOrganization;
import model.Organization.OnlineStoreOrganization;
import model.StockItem.StockItem;

/**
 * This order tracks the purchase from the distributor by an online customer 
 * @author saidutt
 */
public class OnlineOrder extends Order{
        
    private InvDistributorOrganization ido;
    private OnlineStoreOrganization oso;
    private StockItem item;
    
    public OnlineOrder(int pId) {
        super(pId);
    }

    @Override
    public String getStatus() {
        
        return "Online order";
    }

    public InvDistributorOrganization getIdo() {
        
        return ido;
    }

    public void setIdo(InvDistributorOrganization ido) {
        
        this.ido = ido;
    }

    public OnlineStoreOrganization getOso() {
        
        return oso;
    }

    public void setOso(OnlineStoreOrganization oso) {
        
        this.oso = oso;
    }

    public StockItem getItem() {
        
        return item;
    }

    public void setItem(StockItem item) {
        
        this.item = item;
    }    
}
