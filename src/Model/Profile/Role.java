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

/**
 *
 * @author nehadevarapalli
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Distribution("Distribution - Service"),
        Doctor("Doctor - Hospital"),
        Economy("Economy - Government"),
        Health("Health Ministry - Government"),
        Lab("Lab - Hosptial"),
        Manufacturing("Manufacturing - Pharmaceutical"),
        Person("Person - Government"),
        Pharma("Pharma - Hospital"),
        Purchase("Purchase - Service"),
        Sales("Sales - Pharmaceutical");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business);

//    public abstract JPanel createWorkArean(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network);
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
