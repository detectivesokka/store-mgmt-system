package model.StockItem;

import java.util.ArrayList;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class StockItemDirectory {
    
    private ArrayList<StockItem> stockItemList;
    private int itemCount = 1;
    
    public StockItemDirectory() {
        
        stockItemList = new ArrayList<> ();
    }

    public ArrayList<StockItem> getStockItemList() {
        
        return stockItemList;
    }

    public void setStockItemList(ArrayList<StockItem> stockItemList) {
        
        this.stockItemList = stockItemList;
    }       
    
    public StockItem newStockItem () {
        
        StockItem si = new StockItem(itemCount++);
        this.stockItemList.add(si);
        return si;        
    }
    
    public StockItem newStockItem (String pName, float pPrice, int pTax, int pQuant) {
        
        StockItem si = new StockItem(itemCount++, pName, pPrice, pTax, pQuant);
        this.stockItemList.add(si);
        return si;        
    }
}
