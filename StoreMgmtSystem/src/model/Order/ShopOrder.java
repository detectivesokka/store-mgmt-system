package model.Order;

import model.Organization.InvDistributorOrganization;
import model.Organization.ShopOrganization;
import model.StockItem.StockItem;

/**
 *
 * @author saidutt
 */
public class ShopOrder extends Order{
    
    ShopOrganization shop;
    InvDistributorOrganization ido;
    StockItem item;
    
    public ShopOrder(int pId) {
        super(pId);
    }

    public ShopOrganization getShop() {
        return shop;
    }

    public void setShop(ShopOrganization shop) {
        this.shop = shop;
    }

    public InvDistributorOrganization getIdo() {
        return ido;
    }

    public void setIdo(InvDistributorOrganization ido) {
        this.ido = ido;
    }

    public StockItem getItem() {
        return item;
    }

    public void setItem(StockItem item) {
        this.item = item;
    }        
}
