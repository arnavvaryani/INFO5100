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
import Model.Organization.HealthOrganization;
import Model.UserAccount.UserAccount;
import UserInterface.Health.HealthWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashishnevan
 */
public class Health extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new HealthWorkAreaJPanel(userProcessContainer, account, (HealthOrganization)organization, enterprise, business);
    }

}