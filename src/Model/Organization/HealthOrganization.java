/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Profile.Doctor;
import Model.Profile.Health;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author arnav
 */

public class HealthOrganization extends Organization {
    public HealthOrganization() {
        super(Organization.Type.Health.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Health());
        return roles;
    }
}
