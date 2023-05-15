package model.StockItem;

import java.util.ArrayList;
import model.Organization.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class StockItemDirectory {
    
    private final ArrayList<StockItem> stockItemList;
    private final Organization parentOrg;
            
    private int itemCount = 1;
    
    public StockItemDirectory(Organization pParent) {
        
        stockItemList = new ArrayList<> ();    
        this.parentOrg = pParent;
    }

    public ArrayList<StockItem> getStockItemList() {
        
        return stockItemList;
    }  
    
    public StockItem newStockItem () {
        
        StockItem si = new StockItem(itemCount++, this);
        this.stockItemList.add(si);
        return si;        
    }
    
    public StockItem newStockItem (String pName, float pPrice, float pSellingPrice, int pTax, int pQuant) {
        
        StockItem si = new StockItem(itemCount++, pName, pPrice, pSellingPrice, pTax, pQuant);
        this.stockItemList.add(si);
        return si;        
    }
    
    public StockItem searchStockItem(int pId) {
        
        for( StockItem si : this.stockItemList) {
            
            if (si.getItemId() == pId) {
                
                return si;
            }
        }
        
        return null;
    }
    
    public StockItem searchStockItem(String pItemName) {
        
        for( StockItem si : this.stockItemList) {
            
            if (si.getItemName().equals(pItemName)) {
                
                return si;
            }
        }
        
        return null;
    }
    
    public void deleteStockItem(int pId) {
        
        StockItem si = searchStockItem(pId);        
        this.stockItemList.remove(si);
    }
    
    public void deleteStockItem(String pItemName) {
        
        StockItem si = searchStockItem(pItemName);        
        this.stockItemList.remove(si);
    }

    public Organization getParentOrg() {
        return parentOrg;
    }
        
}
