/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Region.Region;
import Model.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author nehadevarapalli
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, Region network) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new Hospital(name, network);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Service) {
            enterprise = new Service(name, network);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Pharmaceutical) {
            enterprise = new Pharma(name, network);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Government) {
            enterprise = new Government(name, network);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

}
