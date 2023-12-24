/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import java.util.ArrayList;

/**
 *
 * @author nehadevarapalli
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Person.getValue())) {
            organization = new PersonOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Pharma.getValue())) {
            organization = new PharmaOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Manufacturing.getValue())) {
            organization = new ManufacturingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Sales.getValue())) {
            organization = new SalesOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Purchase.getValue())) {
            organization = new PurchaseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Health.getValue())) {
            organization = new HealthOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Economy.getValue())) {
            organization = new EconomyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Distribution.getValue())) {
            organization = new DistributionOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

}
