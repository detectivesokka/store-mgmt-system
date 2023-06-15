package model.Organization;

/**
 *
 * @author saidutt
 */
public abstract class Organization {
    
    private String name;
    private int organizationId;  
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }                  
}
