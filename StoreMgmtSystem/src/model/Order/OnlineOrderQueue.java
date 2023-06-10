package model.Order;

import java.util.ArrayList;
import model.Organization.Organization;

/**
 *
 * @author saidutt
 */
public class OnlineOrderQueue implements OrderQueue{
    
    private int onlineOrderCount = 1;
    private ArrayList<OnlineOrder> onlineOrders;
    private Organization parent;

    public OnlineOrderQueue(Organization pParent) {
        
        this.onlineOrders = new ArrayList<>();  
        this.parent = pParent;
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

    public Organization getParent() {
        return parent;
    }    

    public float getTotalRevenue() {
        
        float result = 0.0f;
        
        for (OnlineOrder o : this.onlineOrders) {
            
            result += o.getItem().getSellingPrice() * o.getItem().getQuantity();            
        }
        
        return result;
    }

    public float getTotalTaxAmount() {
        
        float result = 0.0f;
        
        for (OnlineOrder o : this.onlineOrders) {
            
            result += o.getItem().getSellingPrice()* o.getItem().getPcTax() * o.getItem().getQuantity();
        }
        
        return result;
    }
    
}
