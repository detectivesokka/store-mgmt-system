package model.Enterprise;

import model.StoreMgmtSystem;

/**
 *
 * @author saidutt
 */
public abstract class Enterprise {
    
    private int enterpriseType;   
    private StoreMgmtSystem system;       
    
    Enterprise(int pType, StoreMgmtSystem pSystem) {
                
        this.enterpriseType = pType;        
        this.system = pSystem;
    }
        
    public int getEnterpriseType() {
        
        return enterpriseType;
    }

    public StoreMgmtSystem getSystem() {
        
        return system;
    }   
}
