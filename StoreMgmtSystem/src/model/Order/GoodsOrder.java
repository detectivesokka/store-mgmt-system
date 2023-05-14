package model.Order;

import model.Organization.*;
import model.StockItem.StockItem;

/**
 * This order tracks the transfer of goods between Manufacturer and Distributor
 * @author saidutt
 */

public class GoodsOrder extends Order {
        
    private InvManufacturerOrganization imo;
    private InvDistributorOrganization ido;
    private StockItem item;
    
    public GoodsOrder(int pId) {
        
        super(pId);
    }

    public InvManufacturerOrganization getMfrOrganization() {
        
        return imo;
    }

    public void setMfrOrganization(InvManufacturerOrganization imo) {
        
        this.imo = imo;
        this.setFrom(imo.getName());
    }

    public InvDistributorOrganization getDistributorOrganization() {
        
        return ido;
    }

    public void setDistributorOrganization(InvDistributorOrganization ido) {
        
        this.ido = ido;
        this.setTo(ido.getName());
    }

    public StockItem getItem() {
        
        return item;
    }

    public void setItem(StockItem item) {
        
        this.item = item;
        this.setItemName(item.getItemName());
        this.setTaxPc(item.getPcTax());
    }   
    
    public void dispatchToDistributor() throws Exception {
        
        if (this.item.getQuantity() - this.getQuantity() < 0) {
        
            throw new Exception("Can't send more items than present");
        }
        
        this.item.setQuantity(this.item.getQuantity() - this.getQuantity());         
    }
    
    public void addToDistributorInventory() {
        
        this.getDistributorOrganization().getStockItemDirectory().newStockItem(this.item.getItemName(), this.item.getPrice(), this.item.getPcTax(), this.getQuantity());
    }
}
