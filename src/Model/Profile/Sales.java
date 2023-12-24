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
import Model.Organization.SalesOrganization;
import Model.UserAccount.UserAccount;
import UserInterface.Sales.SalesWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashishnevan
 */
public class Sales extends Role{
   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new SalesWorkAreaJPanel(userProcessContainer, account, (SalesOrganization)organization, enterprise, business);
    }

    

}
