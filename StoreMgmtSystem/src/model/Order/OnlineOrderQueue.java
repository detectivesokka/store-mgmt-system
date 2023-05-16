package model.Order;

import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class OnlineOrderQueue implements OrderQueue{
    
    private int onlineOrderCount = 1;
    private final ArrayList<OnlineOrder> onlineOrders;

    public OnlineOrderQueue() {
        
        this.onlineOrders = new ArrayList<>();        
    }

    public int getOnlineOrderCount() {
        return onlineOrderCount;
    }

    public void setOnlineOrderCount(int onlineOrderCount) {
        this.onlineOrderCount = onlineOrderCount;
    }    

    public ArrayList<OnlineOrder> getOnlineOrders() {
        return onlineOrders;
    }       
    
    @Override
    public OnlineOrder newOrder() {

        OnlineOrder go = new OnlineOrder(onlineOrderCount++);
        this.getOnlineOrders().add(go);
        return go;
    }

    @Override
    public void deleteOrder(int pId) {

        OnlineOrder o = searchOrder(pId);
        this.onlineOrders.remove(o);
    }

    @Override
    public OnlineOrder searchOrder(int pId) {

        for (OnlineOrder o : this.onlineOrders) {

            if (o.getOrderID() == pId) {

                return o;
            }
        }

        return null;
    }
}
