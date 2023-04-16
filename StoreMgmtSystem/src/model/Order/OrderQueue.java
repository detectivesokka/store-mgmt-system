package model.Order;

/**
 *
 * @author saidutt
 */
public interface OrderQueue {             
    
    public abstract Order newOrder ();
    
    public abstract Order searchStockItem(int pId);
    
    public abstract void deleteStockItem(int pId) ;
}
