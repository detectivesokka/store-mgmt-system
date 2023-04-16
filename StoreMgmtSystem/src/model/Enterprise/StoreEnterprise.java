package model.Enterprise;

import java.util.ArrayList;
import model.Organization.LocalStoreOrganization;

/**
 *
 * @author saidutt
 */
public class StoreEnterprise extends Enterprise {

    private final ArrayList<LocalStoreOrganization> localOrgList;
       
    
    public StoreEnterprise() {
        
        super(1);
        localOrgList = new ArrayList<>();
    }

    public ArrayList<LocalStoreOrganization> getLocalOrgList() {
        return localOrgList;
    }
}
