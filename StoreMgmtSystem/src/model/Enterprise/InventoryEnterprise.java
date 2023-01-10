package model.Enterprise;

import java.util.ArrayList;
import java.util.HashMap;
import model.Order.GoodsOrderQueue;
import model.Organization.InvDistributorOrganization;
import model.Organization.InvManufacturerOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class InventoryEnterprise extends Enterprise{

    private ArrayList<InvManufacturerOrganization> invManOrgList;
    private ArrayList<InvDistributorOrganization> invDisOrgList;    
    private GoodsOrderQueue goQueue;
    
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

    public ArrayList<Object> searchUserAccount(String pUsername, String pPassword) {
        
        UserAccount user;
        ArrayList<Object> result = new ArrayList<Object>();
        
        for (InvManufacturerOrganization imo : this.invManOrgList) {
            
            user = imo.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                
                result.add(imo);
                result.add(user);
                return result;
            }
        }
        
        for (InvManufacturerOrganization imo : this.invManOrgList) {
            
            user = imo.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                
                result.add(imo);
                result.add(user);
                return result;
            }
        }
        
        return null;
    }

    public GoodsOrderQueue getGOQueue() {
        return goQueue;
    }        
}   
