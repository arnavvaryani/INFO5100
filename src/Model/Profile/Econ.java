/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Profile;

import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Organization.Organization;
import Model.Organization.EconomyOrganization;
import Model.UserAccount.UserAccount;
import UserInterface.Economy.EconomyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashishnevan
 */
public class Econ extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new EconomyWorkAreaJPanel(userProcessContainer, account, (EconomyOrganization)organization, enterprise, business);
    }

    

}
