package model.Organization;

import model.Enterprise.InventoryEnterprise;
import model.StockItem.StockItem;
import model.StockItem.StockItemDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class InvManufacturerOrganization extends Organization {
    
    private final StockItemDirectory stockItemDirectory;
    private final UserAccountDirectory userAccountDirectory;    
    private final InventoryEnterprise parentInvEnterprise;

    public InvManufacturerOrganization(StockItemDirectory stockItemDirectory, UserAccountDirectory userAccountDirectory, InventoryEnterprise pParent, String pName) {
        
        this.stockItemDirectory = stockItemDirectory;
        this.userAccountDirectory = userAccountDirectory;
        this.parentInvEnterprise = pParent;
        this.setName(pName);
    }

    public InvManufacturerOrganization(InventoryEnterprise pParent, String pName) {
        
        stockItemDirectory = new StockItemDirectory(this);
        userAccountDirectory = new UserAccountDirectory(this);
        parentInvEnterprise = pParent;
        this.setName(pName);
    }
    
    public StockItemDirectory getStockItemDirectory() {
        
        return stockItemDirectory;
    }
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }

    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }    

    public InventoryEnterprise getParentInvEnterprise() {
        
        return parentInvEnterprise;
    }

    public float getTotalRevenue() {
        
        float result = 0.0f;
        
        for (StockItem si : this.stockItemDirectory.getStockItemList()) {
            
            result += si.getSellingPrice() * si.getQuantity();            
        }
        
        return result;
    }

    public float getTotalTaxAmount() {
        
        float result = 0.0f;
        
        for (StockItem si : this.stockItemDirectory.getStockItemList()) {
            
            result += si.getSellingPrice()* si.getPcTax() * si.getQuantity();
        }
        
        return result;
    }
}
