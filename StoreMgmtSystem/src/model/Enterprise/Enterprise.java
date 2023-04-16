package model.Enterprise;

/**
 *
 * @author saidutt
 */
public abstract class Enterprise {
    
    private int enterpriseType;        
    
    Enterprise() {
        
        
    }
    
    Enterprise(int pType) {
                
        this.enterpriseType = pType;        
    }
        
    public int getEnterpriseType() {
        
        return enterpriseType;
    }

    public void setEnterpriseType(int enterpriseType) {
        
        this.enterpriseType = enterpriseType;
    }      
}
