/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Flow;

import Model.UserAccount.UserAccount;

/**
 *
 * @author ashishnevan
 */
public class PrescribeMedicine extends WorkRequest{
    private UserAccount person;
    private String MedList;

    public String getMedList() {
        return MedList;
    }

    public void setMedList(String MedList) {
        this.MedList = MedList;
    }

    public UserAccount getPerson() {
        return person;
    }

    public void setPerson(UserAccount person) {
        this.person = person;
    }
}
