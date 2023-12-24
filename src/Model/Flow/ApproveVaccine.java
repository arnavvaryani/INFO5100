/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Flow;

import Model.Organization.Vaccine;
import Model.UserAccount.UserAccount;

/**
 *
 * @author ashishnevan
 */
public class ApproveVaccine extends WorkRequest{
    
    private String testResult;
    
    private Vaccine vaccine;
    
    private UserAccount sales;

    public UserAccount getSales() {
        return sales;
    }

    public void setSales(UserAccount sales) {
        this.sales = sales;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    

}
