/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Profile.Admin;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author arnav
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Organization.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Admin());
        return roles;
    }
     
}
