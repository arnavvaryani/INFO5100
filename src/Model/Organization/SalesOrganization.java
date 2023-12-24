/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Profile.Role;
import Model.Profile.Sales;
import java.util.ArrayList;

/**
 *
 * @author arnav
 */
public class SalesOrganization extends Organization {

    public SalesOrganization() {
        super(Organization.Type.Sales.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Sales());
        return roles;
    }
}
