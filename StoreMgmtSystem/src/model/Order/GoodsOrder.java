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

    public InvManufacturerOrganization getDistributorOrganization() {
        
        return imo;
    }

    public void setMfrOrganization(InvManufacturerOrganization imo) {
        
        this.imo = imo;
        setFrom(imo.getName());
    }

    public InvDistributorOrganization getMfrOrganization() {
        
        return ido;
    }

    public void setDistributorOrganization(InvDistributorOrganization ido) {
        
        this.ido = ido;       
        setTo(ido.getName());
    }

    public StockItem getItem() {
        
        return item;
    }

    public void setItem(StockItem item) {
        
        this.item = item;
        setItemName(item.getItemName());
    }

    @Override
    public String getStatus() {
        
        return "Goods order";
    }
    
    
}
