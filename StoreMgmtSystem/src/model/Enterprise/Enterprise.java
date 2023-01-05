package model.Enterprise;

/**
 *
 * @author saidutt
 */
public class Enterprise {
    
    int enterpriseType;
    final int enterpriseId;

    Enterprise(int pType, int pId) {
        
        this.enterpriseId = pId;
        this.enterpriseType = pType;        
    }
    
    public int getEnterpriseId() {
        
        return enterpriseId;
    }

    public int getEnterpriseType() {
        
        return enterpriseType;
    }

    public void setEnterpriseType(int enterpriseType) {
        
        this.enterpriseType = enterpriseType;
    }          
}
