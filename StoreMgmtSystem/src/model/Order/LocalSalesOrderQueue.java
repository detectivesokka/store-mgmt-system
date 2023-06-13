package model.Order;

import java.util.ArrayList;
import model.Organization.LocalStoreOrganization;

/**
 *
 * @author saidutt
 */
public class LocalSalesOrderQueue implements OrderQueue {
    
    private LocalStoreOrganization parent;
    private int localSalesOrderCount = 1;
    private ArrayList<Order> localSalesOrders;
    
    public LocalSalesOrderQueue(LocalStoreOrganization pParent) {
        
        this.parent = pParent;        
        this.localSalesOrders = new ArrayList<>();
    }

    public LocalStoreOrganization getParent() {
        return parent;
    }

    public ArrayList<Order> getLocalSalesOrders() {
        return localSalesOrders;
    }        

    @Override
    public Order newOrder() {
        
        Order go = new Order(localSalesOrderCount++);
        this.getLocalSalesOrders().add(go);
        return go;        
        
    }

    @Override
    public Order searchOrder(int pId) {
        
        for (Order o : this.localSalesOrders) {
            
            if (o.getOrderID() == pId) {
                
                return o;
            }
            
        }
        
        return null;
    }

    @Override
    public void deleteOrder(int pId) {
        
        Order o = searchOrder(pId);
        this.localSalesOrders.remove(o);        
    }

   public float getTotalRevenue() {
        
        float result = 0.0f;
        
        for (Order o : this.localSalesOrders) {
            
            result += o.getTotalSellingPrice() * o.getQuantity();
        }
        
        return result;
    }

    public float getTotalTaxAmount() {
        
        float result = 0.0f;
        
        for (Order o : this.localSalesOrders) {
            
            result += o.getTotalSellingPrice()* o.getTaxPc() * o.getQuantity();
        }
        
        return result;
    }
}
