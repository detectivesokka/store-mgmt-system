package model.StockItem;

/**
 *
 * @author saidutt
 */
public class StockItem {
    
    private String itemName;
    private float costPrice;
    private float sellingPrice;
    private int pcTax;
    private int quantity;
    private StockItemDirectory parentDirectory;
    
    private final int itemId;

    public StockItem(int itemId, StockItemDirectory pSID) {
        
        this.itemId = itemId;
        this.parentDirectory = pSID;
    }

    public StockItem(int itemId, String itemName, float price, float pSellingPrice, int pcTax, int quantity) {
        this.itemName = itemName;
        this.costPrice = price;
        this.pcTax = pcTax;
        this.quantity = quantity;
        this.itemId = itemId;
        this.sellingPrice = pSellingPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return costPrice;
    }

    public void setPrice(float price) {
        this.costPrice = price;
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

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    
    
}
