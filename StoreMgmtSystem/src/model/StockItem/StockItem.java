package model.StockItem;

/**
 *
 * @author saidutt
 */
public class StockItem {
    
    private String itemName;
    private float price;
    private int pcTax;
    private int quantity;
    private StockItemDirectory parentDirectory;
    
    private final int itemId;

    public StockItem(int itemId, StockItemDirectory pSID) {
        
        this.itemId = itemId;
        this.parentDirectory = pSID;
    }

    public StockItem(int itemId, String itemName, float price, int pcTax, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.pcTax = pcTax;
        this.quantity = quantity;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPcTax() {
        return pcTax;
    }

    public void setPcTax(int pcTax) {
        this.pcTax = pcTax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }           

    public int getItemId() {
        return itemId;
    }        

    public StockItemDirectory getParentDirectory() {
        return parentDirectory;
    }
    
    
}
