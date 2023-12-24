/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Enterprise.Enterprise;

/**
 *
 * @author arnav
 */
public class PurchaseInventory {

    private int Qty;
    private Enterprise manuEP;

    public Enterprise getManuEP() {
        return manuEP;
    }

    public void setManuEP(Enterprise manuEP) {
        this.manuEP = manuEP;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    @Override
    public String toString() {
        return manuEP.getName();
    }
}
