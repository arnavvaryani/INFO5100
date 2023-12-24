package Model;

import Model.Employee.Employee;
import Model.Profile.SystemAdmin;
import Model.UserAccount.UserAccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nehadevarapalli
 */
public class SystemInit {

    public static Ecosystem configure() {

        Ecosystem system = Ecosystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("superuser");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("superuser", "superuser", employee, new SystemAdmin());

        return system;
    }
}
