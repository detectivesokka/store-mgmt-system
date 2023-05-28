package model.Order;

import model.Organization.InvDistributorOrganization;
import model.Organization.LocalStoreOrganization;
import model.StockItem.StockItem;

/**
 *
 * @author saidutt
 */
public class ShopOrder extends Order{
    
    private InvDistributorOrganization ido;
    private StockItem item;    
    
    public ShopOrder(int pId) {
        super(pId);
    }

    public InvDistributorOrganization getInvDistributorOrganization() {
        return ido;
    }

    public void setInvDistributorOrganization(InvDistributorOrganization ido) {
        this.ido = ido;
    }

    public StockItem getItem() {
        return item;
    }

    public void setItem(StockItem item) {
        this.item = item;
    }        

    @Override
    public String getStatus() {
       
        return "Shop order";
    }    
}
