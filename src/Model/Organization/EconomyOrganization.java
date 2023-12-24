/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Profile.Doctor;
import Model.Profile.Econ;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author arnav
 */
public class EconomyOrganization extends Organization {
    public EconomyOrganization() {
        super(Organization.Type.Economy.getValue());
    }
    
    private VaccineDirectory directory = new VaccineDirectory();

    public VaccineDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(VaccineDirectory directory) {
        this.directory = directory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Econ());
        return roles;
    }
}
