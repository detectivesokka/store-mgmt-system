package model.Enterprise;

import java.util.ArrayList;
import model.Organization.TaxationOrganization;

/**
 *
 * @author saidutt
 */
public class ComplianceEnterprise extends Enterprise{

    private ArrayList <TaxationOrganization> taxOrgList;
    
    public ComplianceEnterprise() {
        
        super(2);
        taxOrgList = new ArrayList<>();        
    }
    
    
}
