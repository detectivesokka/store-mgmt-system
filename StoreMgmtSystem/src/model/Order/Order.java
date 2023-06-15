package model.Order;

/**
 *
 * @author saidutt
 */
public class Order {
    
    private int orderID;        
    private String from;
    private String to;    
    private String itemName;
    private int quantity;
    private float taxPc;
    private double totalSellingPrice;
    private String orderStatus;
    
    Order(int pId) {
        
        this.orderID = pId;
    }    

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        
        this.to = to;
    }      
    
    public int getOrderID() {
        return orderID;
    }        

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        
        this.itemName = itemName;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTaxPc() {
        return taxPc;
    }

    public void setTaxPc(float taxPc) {
        this.taxPc = taxPc;
    }

    public double getTotalSellingPrice() {
        
        return totalSellingPrice;
    }

    public void setTotalSellingPrice(double totalSellingPrice) {
        
        this.totalSellingPrice = totalSellingPrice;
    }

    public String getStatus() {
        return orderStatus;
    }

    public void setStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
