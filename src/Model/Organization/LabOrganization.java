/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Profile.Lab;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author arnav
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Lab());
        return roles;
    }
     
   
    
    
}
