package model.Enterprise;

import model.Order.OrderQueue;

/**
 *
 * @author saidutt
 */
public class Enterprise {
    
    private int enterpriseType;        
    private OrderQueue orderQueue;
    
    Enterprise() {
                
        orderQueue = new OrderQueue();        
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
}
