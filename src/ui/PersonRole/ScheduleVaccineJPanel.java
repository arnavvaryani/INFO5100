/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PersonRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PersonOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.vaccinate;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ashishnevan
 */
public class ScheduleVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleVaccineJPanel
     */
    private JPanel userProcessContainer;
    private PersonOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ScheduleVaccineJPanel(JPanel userProcessContainer, PersonOrganization organization, Enterprise enterprise, EcoSystem business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = userAccount;
        populateDistCenterComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDistributorselect = new javax.swing.JLabel();
        btnReq = new javax.swing.JButton();
        cmbDistributorselect = new javax.swing.JComboBox<>();
        lblTitle = new javax.swing.JLabel();
        iconBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDistributorselect.setBackground(new java.awt.Color(0, 0, 0));
        lblDistributorselect.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblDistributorselect.setText("Select Distribution Center:");
        add(lblDistributorselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        btnReq.setBackground(new java.awt.Color(0, 0, 0));
        btnReq.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnReq.setText("Request");
        btnReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqActionPerformed(evt);
            }
        });
        add(btnReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, -1));

        cmbDistributorselect.setBackground(new java.awt.Color(0, 0, 0));
        cmbDistributorselect.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbDistributorselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbDistributorselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/network.gif"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 950, 850));

        iconBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        iconBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBackMousePressed(evt);
            }
        });
        add(iconBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqActionPerformed
        // TODO add your handling code here:
        vaccinate v = new vaccinate();
        UserAccount receiver = new UserAccount();
        UserAccount health = new UserAccount();
        if(cmbDistributorselect.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Please select a distribution center to request vaccination");
            return;
        }
        v.setDistributionCenter(cmbDistributorselect.getSelectedItem().toString());
        v.setPerson(userAccount);
        
        System.out.println(userAccount.getUsername());
        v.setSender(userAccount);
        v.setStatus("Requested");
        v.setMessage(userAccount.getUsername());
        v.setDate("Date will reflect once approved");
       
        Network currNet = enterprise.getNetwork();
        
        for(Enterprise e : currNet.getEnterpriseDirectory().getEnterpriseList()){
            System.out.print("1");
            System.out.println(e.getEnterpriseType());
            if(e.getEnterpriseType().toString().equals("Service")){
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                        System.out.println("2");
                        System.out.println(u.getUsername());
                        if(u.getRole().toString().equals("Business.Role.DistributionRole")){
                            System.out.println(u.getUsername());
                            v.setReceiver(u);
                            receiver = u;
                        }
                    }
                }
            }
        }
        for(Enterprise e : currNet.getEnterpriseDirectory().getEnterpriseList()){
            System.out.print("1");
            System.out.println(e.getEnterpriseType());
            if(e.getEnterpriseType().toString().equals("Government")){
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                        System.out.println("2");
                        System.out.println(u.getUsername());
                        if(u.getRole().toString().equals("Business.Role.HealthRole")){
                            v.setHealth(u);
                            health = u;
                            break;
                        }
                    }
                }
            }
        }
//        for(UserAccount u: business.getUserAccountDirectory().getUserAccountList()){
//            System.out.println(u.getUsername());
//            System.out.println(jComboBox1.getSelectedItem().toString());
//            System.out.println(u.getUsername().equals(jComboBox1.getSelectedItem().toString()));
//            if(u.getUsername().equals(jComboBox1.getSelectedItem().toString())){
//               System.out.println(u.getUsername());
//               v.setReceiver(u);
//               receiver = u;
//            }
//        }
        receiver.getWorkQueue().getWorkRequestList().add(v);
        userAccount.getWorkQueue().getWorkRequestList().add(v);
        health.getWorkQueue().getWorkRequestList().add(v);
        JOptionPane.showMessageDialog(this, "Request sent");
        dB4OUtil.storeSystem(business);
    }//GEN-LAST:event_btnReqActionPerformed

    private void iconBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackMousePressed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        //System.out.println("icon 2");
        PersonWorkAreaJPanel personWorkAreaJPanel = new PersonWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        //System.out.println("icon 3");
        userProcessContainer.add("PersonWorkAreaJPanel", personWorkAreaJPanel);
        //System.out.println("icon 4");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //System.out.println("icon 5");
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_iconBackMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReq;
    private javax.swing.JComboBox<String> cmbDistributorselect;
    private javax.swing.JLabel iconBack;
    private javax.swing.JLabel lblDistributorselect;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void populateDistCenterComboBox() {
        cmbDistributorselect.removeAllItems();
        
        Network currNet = enterprise.getNetwork();
        for(Enterprise e: currNet.getEnterpriseDirectory().getEnterpriseList()){
        if(e.getEnterpriseType() == Enterprise.EnterpriseType.Service){
            for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                System.out.println(o.getName());
                for(UserAccount u: o.getUserAccountDirectory().getUserAccountList()){
                    System.out.println(u.getRole().toString());
                    if(u.getRole().toString().equals("Business.Role.DistributionRole")){
                        cmbDistributorselect.addItem(u.getUsername());
                    }
                }
            }
//            currEP = e;
            }
        }
    }
}
