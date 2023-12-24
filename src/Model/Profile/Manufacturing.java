/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Profile;

import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Organization.LabOrganization;
import Model.Organization.Organization;
import Model.Organization.ManufacturingOrganization;
import Model.UserAccount.UserAccount;
import UserInterface.Manufacturer.ManufacturingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashishnevan
 */
public class Manufacturing extends Role{
    
    
//JPanel userProcessContainer, Ecosystem ecoSystem, UserAccount account, Region network, ManufacturingOrganization organization, Enterprise enterprise

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
       return new ManufacturingWorkAreaJPanel(userProcessContainer, account, (ManufacturingOrganization)organization, enterprise, business);
    }

}
