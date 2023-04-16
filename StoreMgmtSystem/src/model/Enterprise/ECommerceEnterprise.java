package model.Enterprise;

import java.util.ArrayList;
import model.Organization.OnlineStoreOrganization;

/**
 *
 * @author saidutt
 */
public class ECommerceEnterprise extends Enterprise{

    private ArrayList<OnlineStoreOrganization> onlineStrOrgList;
    
    public ECommerceEnterprise() {
        super(0);
    }                    

    public ArrayList<OnlineStoreOrganization> getOnlineStrOrgList() {
        return onlineStrOrgList;
    }

    public void setOnlineStrOrgList(ArrayList<OnlineStoreOrganization> onlineStrOrgList) {
        this.onlineStrOrgList = onlineStrOrgList;
    }
}
