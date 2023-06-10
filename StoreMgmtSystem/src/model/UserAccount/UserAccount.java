package model.UserAccount;

import model.Organization.Organization;

/**
 *
 * @author saidutt
 */
public class UserAccount {
    
    private String userName;
    private String password;
    private int role;
    private   int userId;
    private Organization parentOrg;
    
    
    UserAccount(int pUserId, Organization pParentOrg) {
        
        this.userId = pUserId;     
        this.parentOrg = pParentOrg;        
    }
    
    UserAccount(int pUserId, String pUserName, String pPassword, int pRole) {
        
        this.userId = pUserId;
        this.userName = pUserName;
        this.password = pPassword;
        this.role = pRole;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }           

    public String getRoleString() {
        
        String roleName;
        
        switch(this.role) {
            
            case 0 : roleName = "Admin";
            break;            
            case 1 : roleName = "Online Customer";
            break;
            case 2 : roleName = "Online Delivery Man";
            break;            
            case 3 : roleName = "Shop Manager";
            break;
            case 4 : roleName = "Shop Employee";
            break;
            case 5 : roleName = "Govt Tax Auditor";
            break;
            case 6 : roleName = "Goods Transporter";
            break;
            case 7 : roleName = "Goods Manufacturer";
            break;
            case 8 : roleName = "Goods Distributor";
            break;
            default: roleName = "";
        }
        
        return roleName;
    }
    
    public int getRole() {
        
        return this.role;
    }
    
    public void setRole(int pRole) {
        
        this.role = pRole;
    }

    public Organization getParentOrg() {
        return parentOrg;
    }

    public void setParentOrg(Organization parentOrg) {
        this.parentOrg = parentOrg;
    }
}
