package model.Order;

import java.util.ArrayList;
import model.Organization.LocalStoreOrganization;
import model.StockItem.StockItem;

/**
 * Tracks orders made by a shop
 *
 * @author saidutt
 */
public class ShopOrderQueue implements OrderQueue {
    
    private LocalStoreOrganization shop;
    private StockItem si;
    private ArrayList<ShopOrder> orderList;

    private int shopOrderCount = 1;
    
    public ShopOrderQueue(LocalStoreOrganization pStore) {
        
        this.shop = pStore;
        this.orderList = new ArrayList<>();
    }

    @Override
    public ShopOrder newOrder() {

        ShopOrder so = new ShopOrder(shopOrderCount++, shop);
        this.getOrderList().add(so);
        return so;
    }
    
    public LocalStoreOrganization getShop() {
        return shop;
    }

    public void setShop(LocalStoreOrganization shop) {
        this.shop = shop;
    }

    public StockItem getSi() {
        return si;
    }

    public void setSi(StockItem si) {
        this.si = si;
    }

    public ArrayList<ShopOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<ShopOrder> orderList) {
        this.orderList = orderList;
    }

    public int getShopOrderCount() {
        return shopOrderCount;
    }

    public void setShopOrderCount(int shopOrderCount) {
        this.shopOrderCount = shopOrderCount;
    }

    @Override
    public ShopOrder searchOrder(int pId) {

        for (ShopOrder o : this.orderList) {

            if (o.getOrderID() == pId) {

                return o;
            }
        }

        return null;
    }

    @Override
    public void deleteOrder(int pId) {
        ShopOrder o = searchOrder(pId);
        this.orderList.remove(o);
    }

}
