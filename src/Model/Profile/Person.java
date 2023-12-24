/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Profile;

import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Organization.PersonOrganization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.Person.PersonWorkAreaJPanel;

/**
 *
 * @author ashishnevan
 */
public class Person extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new PersonWorkAreaJPanel(userProcessContainer, account, (PersonOrganization)organization, enterprise, business);
    }
    
}
