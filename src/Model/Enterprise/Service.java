/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Region.Region;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author nehadevarapalli
 */
public class Service extends Enterprise {
    private int vaccineCount;

    public int getVaccineCount() {
        return vaccineCount;
    }

    public void setVaccineCount(int vaccineCount) {
        this.vaccineCount = vaccineCount;
    }
     public Service(String name, Region network){
        super(name,Enterprise.EnterpriseType.Service, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
