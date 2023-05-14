package model.Order;

/**
 *
 * @author saidutt
 */
public interface OrderQueue {             
    
    public abstract Order newOrder ();
    
    public abstract Order searchOrder(int pId);
    
    public abstract void deleteOrder(int pId) ;
}
