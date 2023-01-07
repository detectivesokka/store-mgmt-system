package model.Order;

import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class OrderQueue {
    
    private ArrayList<Order> orderList;
    private int orderCount = 1;
    
    OrderQueue() {
        
        orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public Order newStockItem () {
        
        Order o = new Order(orderCount++);
        this.orderList.add(o);
        return o;        
    }        
    
    public Order searchStockItem(int pId) {
        
        for( Order o : this.orderList) {
            
            if (o.getOrderID() == pId) {
                
                return o;
            }
        }
        
        return null;
    }
    
    public void deleteStockItem(int pId) {
        
        Order o = searchStockItem(pId);        
        this.orderList.remove(o);
    }
}
