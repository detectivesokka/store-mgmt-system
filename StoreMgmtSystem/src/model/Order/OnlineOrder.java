package model.Order;

/**
 * This order tracks the purchase from the distributor by an online customer 
 * @author saidutt
 */
public class OnlineOrder extends Order{
    
    public OnlineOrder(int pId) {
        super(pId);
    }

    @Override
    public String getStatus() {
        
        return "Online order";
    }
    
    
}
