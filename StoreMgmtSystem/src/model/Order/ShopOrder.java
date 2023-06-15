package model.Order;

import model.Organization.InvDistributorOrganization;
import model.Organization.LocalStoreOrganization;
import model.StockItem.StockItem;

/**
 *
 * @author saidutt
 */
public class ShopOrder extends Order{
    
    private InvDistributorOrganization ido;
    private LocalStoreOrganization parent;
    private StockItem item;    
    
    public ShopOrder(int pId, LocalStoreOrganization pParent) {
        
        super(pId);
        this.parent = pParent;
    }

    public InvDistributorOrganization getInvDistributorOrganization() {
        return ido;
    }

    public void setInvDistributorOrganization(InvDistributorOrganization ido) {
        this.ido = ido;
    }

    public StockItem getItem() {
        return item;
    }

    public void setItem(StockItem item) {
        this.item = item;    
        this.setItemName(item.getItemName());
        this.setTaxPc(item.getPcTax());
        this.setTotalSellingPrice(item.getPrice() + 5);
    }        
    
    public LocalStoreOrganization getParent() {
        return parent;
    }

    public void setParent(LocalStoreOrganization parent) {
        this.parent = parent;
    }        

    public void updateShopInventory() {
        
        this.parent.getStockItemDirectory().newStockItem(this.getItemName(), this.getItem().getSellingPrice(), 0, this.getItem().getPcTax(), this.getQuantity());                        
    }
    
    
}
