/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Profile.Doctor;
import Model.Profile.Manufacturing;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author arnav
 */

public class ManufacturingOrganization extends Organization{

    
    private ArrayList<Vaccine> vaccineDirectory;
    
    public ManufacturingOrganization() {
        super(Organization.Type.Manufacturing.getValue());
        this.vaccineDirectory = new ArrayList<Vaccine>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Manufacturing());
        return roles;
    }
     
    public ArrayList<Vaccine> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<Vaccine> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }
    
    public Vaccine addVaccine(Vaccine vaccine){
        this.vaccineDirectory.add(vaccine);
        return vaccine;
    }
    
    public void updateVaccine(Vaccine vaccine){
        int index = vaccineDirectory.indexOf(vaccine);
        vaccineDirectory.set(index, vaccine);
    }
    
    public void deleteVaccine(Vaccine vaccine){
        vaccineDirectory.remove(vaccine);
    }
}