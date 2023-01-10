package model.Order;

import model.Organization.InvDistributorOrganization;
import model.Organization.ShopOrganization;
import model.StockItem.StockItem;

/**
 * Tracks orders made by a shop
 * @author saidutt
 */
public class ShopOrderQueue extends OrderQueue{
        
    private InvDistributorOrganization ido;
    private ShopOrganization shop;
    private StockItem si;
    
    private int shopOrderCount = 1;
    
    
    @Override
    public ShopOrder newOrder () {
        
        ShopOrder so = new ShopOrder(shopOrderCount++);
        this.getOrderList().add(so);
        return so;        
    }     

    public InvDistributorOrganization getIdo() {
        return ido;
    }

    public void setIdo(InvDistributorOrganization ido) {
        this.ido = ido;
    }

    public ShopOrganization getShop() {
        return shop;
    }

    public void setShop(ShopOrganization shop) {
        this.shop = shop;
    }

    public StockItem getSi() {
        return si;
    }

    public void setSi(StockItem si) {
        this.si = si;
    }       
}
