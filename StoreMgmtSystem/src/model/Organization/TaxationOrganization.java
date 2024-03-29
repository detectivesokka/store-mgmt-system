package model.Organization;

import model.Enterprise.ComplianceEnterprise;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class TaxationOrganization extends Organization {
        
    private   UserAccountDirectory userAccountDirectory;    
    private   ComplianceEnterprise complianceEnterprise;

    public TaxationOrganization(ComplianceEnterprise parent, String imo1) {
        
        this.complianceEnterprise = parent;
        this.userAccountDirectory = new UserAccountDirectory(this);
        this.setName(imo1);
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }   

    public ComplianceEnterprise getComplianceEnterprise() {
        return complianceEnterprise;
    }
    
    public UserAccount newUserAccount(String pUserName, String pPassword, int pRole) {
        
        return this.userAccountDirectory.newUserAccount(pUserName, pPassword, pRole);
    }
}
