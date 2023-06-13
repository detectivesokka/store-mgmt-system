package model.Enterprise;

import java.io.Serializable;
import java.util.ArrayList;
import model.Organization.TaxationOrganization;
import model.StoreMgmtSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author saidutt
 */
public class ComplianceEnterprise extends Enterprise {

    private ArrayList <TaxationOrganization> taxOrgList;
    
    public ComplianceEnterprise(StoreMgmtSystem pSystem) {
        
        super(2, pSystem);
        taxOrgList = new ArrayList<>();        
    }

    public TaxationOrganization newTaxationOrganization(String text) {
        
        TaxationOrganization to = new TaxationOrganization(this, text);
        this.taxOrgList.add(to);
        return to;  
    }

    public ArrayList<Object> searchUserAccount(String pUsername, String pPassword) {
       
        
        UserAccount user;       
        ArrayList<Object> result = new ArrayList<>();
        
        for (TaxationOrganization to : this.taxOrgList) {
            
            user = to.getUserAccountDirectory().searchUser(pUsername);
            
            if(user != null) {
                                                
                result.add(to);
                result.add(user);
                return result;
            }
        }         
        
        return null;
    }

    public ArrayList<TaxationOrganization> getTaxOrgList() {
        return taxOrgList;
    }

    public void setTaxOrgList(ArrayList<TaxationOrganization> taxOrgList) {
        this.taxOrgList = taxOrgList;
    }

    public TaxationOrganization searchTaxationOrganization(String organizationName) {
        
        for (TaxationOrganization to : this.taxOrgList) {
                                   
            if(to.getName().equals(organizationName)) {
                                                
                return to;
            }
        }         
        
        return null;        
    }
    
    
}
