/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Profile.Distributor;
import Model.Profile.Doctor;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author arnav
 */

public class DistributionOrganization extends Organization {
    public ArrayList<PersonOrganization> personDirectory;
    
    public ArrayList<VaccineCount> vaccineDirectory;

    public ArrayList<VaccineCount> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<VaccineCount> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public ArrayList<PersonOrganization> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<PersonOrganization> personDirectory) {
        this.personDirectory = personDirectory;
    }
    public DistributionOrganization() {
        super(Organization.Type.Distribution.getValue());
        this.personDirectory = new ArrayList<PersonOrganization>();
        this.vaccineDirectory = new ArrayList<VaccineCount>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Distributor());
        return roles;
    }
}
