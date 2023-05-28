package model.Enterprise;

import java.util.ArrayList;
import model.Order.GoodsOrderQueue;
import model.Organization.InvDistributorOrganization;
import model.Organization.InvManufacturerOrganization;
import model.Organization.InvTransportationOrganization;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class InventoryEnterprise extends Enterprise{

    private final ArrayList<InvManufacturerOrganization> invManOrgList;
    private final ArrayList<InvDistributorOrganization> invDisOrgList;   
    private final ArrayList<InvTransportationOrganization> invTransOrgList;
    
    private final GoodsOrderQueue invGoodsOrderQueue;
    
    
    public InventoryEnterprise(StoreMgmtSystem pSystem) {
        
        super(3, pSystem);
        invManOrgList = new ArrayList<>();
        invDisOrgList = new ArrayList<>();
        invTransOrgList = new ArrayList<>();
        this.invGoodsOrderQueue = new GoodsOrderQueue();   
    }                

    public InvManufacturerOrganization newInvManufacturerOrganization(String pName) {
        
        InvManufacturerOrganization imf = new InvManufacturerOrganization(this, pName);
        this.invManOrgList.add(imf);
        return imf;        
    }
    
    public InvDistributorOrganization newInvDistributorOrganization(String pName) {
        
        InvDistributorOrganization id = new InvDistributorOrganization(this, pName);
        this.invDisOrgList.add(id);
        return id;        
    }
    
    public InvTransportationOrganization newInvTransportationOrganization() {
        
        InvTransportationOrganization it = new InvTransportationOrganization(this);
        this.invTransOrgList.add(it);
        return it;        
    }

    public ArrayList<Object> searchUserAccount(String pUsername, String pPassword) {
        
        UserAccount user;
        ArrayList<Object> result = new ArrayList<>();
        
        for (InvManufacturerOrganization imo : this.invManOrgList) {
            
            user = imo.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                
                result.add(imo);
                result.add(user);
                return result;
            }
        }
        
        for (InvDistributorOrganization ido : this.invDisOrgList) {
            
            user = ido.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                
                result.add(ido);
                result.add(user);
                return result;
            }
        }
        
        for (InvTransportationOrganization ito : this.invTransOrgList) {
            
            user = ito.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                
                result.add(ito);
                result.add(user);
                return result;
            }
        }
        
        return null;
    }
    
    public ArrayList<InvManufacturerOrganization> getInvManOrgList() {
        return invManOrgList;
    }        

    public ArrayList<InvDistributorOrganization> getInvDisOrgList() {
        return invDisOrgList;
    }

    public ArrayList<InvTransportationOrganization> getInvTransOrgList() {
        return invTransOrgList;
    }

    public GoodsOrderQueue getInvGoodsOrderQueue() {
        return invGoodsOrderQueue;
    }        

    public InvManufacturerOrganization searchMfrOrganization(String manufacturer) {
                
        for (InvManufacturerOrganization imo : this.invManOrgList) {
            
            if (imo.getName() != null && imo.getName().equals(manufacturer)) {
                
                return imo;
            }
        }    
        
        return null;
    }

    public InvDistributorOrganization searchDisOrganization(String seller) {
        
        for (InvDistributorOrganization ido : this.invDisOrgList) {
            
            if (ido.getName() != null && ido.getName().equals(seller)) {
                
                return ido;
            }
        }    
        
        return null;
    }
}   
