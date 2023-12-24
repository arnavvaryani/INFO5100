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
public class Pharma extends Enterprise {
    public Pharma(String name,Region network){
        super(name,Enterprise.EnterpriseType.Pharmaceutical, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
