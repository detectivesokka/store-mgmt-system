package model.Enterprise;

/**
 *
 * @author saidutt
 */
public class Enterprise {
    
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
