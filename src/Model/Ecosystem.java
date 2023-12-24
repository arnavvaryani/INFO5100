/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Region.Region;
import Model.Organization.Organization;
import Model.Profile.Role;
import Model.Profile.SystemAdmin;
import java.util.ArrayList;

/**
 *
 * @author nehadevarapalli
 */
public class Ecosystem extends Organization {

    private static Ecosystem business;
    private ArrayList<Region> networkList;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    public Region createAndAddNetwork() {
        Region network = new Region();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdmin());
        return roleList;
    }

    private Ecosystem() {
        super(null);
        networkList = new ArrayList<Region>();
    }

    public ArrayList<Region> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Region> networkList) {
        this.networkList = networkList;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Region network : networkList) {

        }
        return true;
    }
}
