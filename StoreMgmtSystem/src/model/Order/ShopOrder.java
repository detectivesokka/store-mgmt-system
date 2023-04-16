package model.Order;

import model.Organization.InvDistributorOrganization;
import model.Organization.LocalStoreOrganization;
import model.StockItem.StockItem;

/**
 *
 * @author saidutt
 */
public class ShopOrder extends Order{
    
    LocalStoreOrganization shop;
    InvDistributorOrganization ido;
    StockItem item;
    
    public ShopOrder(int pId) {
        super(pId);
    }

    public LocalStoreOrganization getShop() {
        return shop;
    }

    public void setShop(LocalStoreOrganization shop) {
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

    @Override
    public String getStatus() {
       
        return "Shop order";
    }
}
