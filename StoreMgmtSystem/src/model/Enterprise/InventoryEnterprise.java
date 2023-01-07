package model.Enterprise;

import java.util.ArrayList;
import model.Organization.InvDistributorOrganization;
import model.Organization.InvManufacturerOrganization;

/**
 *
 * @author saidutt
 */
public class InventoryEnterprise extends Enterprise{

    private ArrayList<InvManufacturerOrganization> invManOrgList;
    private ArrayList<InvDistributorOrganization> invDisOrgList;    
    
    public InventoryEnterprise() {
        
        super(3);
        invManOrgList = new ArrayList<>();
        invDisOrgList = new ArrayList<>();                
    }                

    public ArrayList<InvManufacturerOrganization> getInvManOrgList() {
        return invManOrgList;
    }
    
    public InvManufacturerOrganization newInvManufacturerOrganization() {
        
        InvManufacturerOrganization imf = new InvManufacturerOrganization();
        this.invManOrgList.add(imf);
        return imf;        
    }
    
    public InvDistributorOrganization newInvDistributorOrganization() {
        
        InvDistributorOrganization id = new InvDistributorOrganization();
        this.invDisOrgList.add(id);
        return id;        
    }
}   
