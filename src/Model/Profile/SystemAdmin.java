/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Profile;

import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author nehadevarapalli
 */
public class SystemAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }

}
