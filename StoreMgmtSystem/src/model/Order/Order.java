package model.Order;

/**
 *
 * @author saidutt
 */
public class Order {
    
    private final int orderID;        
    private int fromId;
    private int toId;
    private int orderType;
    
    Order(int pId) {
        
        this.orderID = pId;
    }    

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public int getOrderID() {
        return orderID;
    }            
}
