package model.Order;

/**
 *
 * @author saidutt
 */
public class Order {
    
    private final int orderID;        
    private String from;
    private String to;
    private int orderType;
    private String itemName;
    private int quantity;
    private int taxPc;
    private int total;
    
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

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
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

    public int getTaxPc() {
        return taxPc;
    }

    public void setTaxPc(int taxPc) {
        this.taxPc = taxPc;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
