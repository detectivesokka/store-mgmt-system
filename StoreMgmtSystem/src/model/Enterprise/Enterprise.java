package model.Enterprise;

import model.Order.OrderQueue;

/**
 *
 * @author saidutt
 */
public abstract class Enterprise {
    
    private int enterpriseType;        
    private OrderQueue orderQueue;
    
    Enterprise() {
                
    }
    
    Enterprise(int pType) {
                
        this.enterpriseType = pType;        
    }
        
    public int getEnterpriseType() {
        
        return enterpriseType;
    }

    public void setEnterpriseType(int enterpriseType) {
        
        this.enterpriseType = enterpriseType;
    }      

    public OrderQueue getOrderQueue() {
        return orderQueue;
    }

    public void setOrderQueue(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }
}
