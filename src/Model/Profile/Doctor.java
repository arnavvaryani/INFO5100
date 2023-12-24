/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Profile;

import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Organization.DoctorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UserInterface.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashishnevan
 */
public class Doctor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise, business);
    }

    
    
    
}
