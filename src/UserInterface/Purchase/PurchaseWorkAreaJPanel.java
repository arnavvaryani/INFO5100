/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Purchase;

import Util.DB4OUtil;
import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Enterprise.Service;
import Model.Organization.Organization;
import Model.Organization.PurchaseOrganization;
import Model.UserAccount.UserAccount;
import Model.Flow.WorkRequest;
import Model.Flow.RequestVaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class PurchaseWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private PurchaseOrganization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public int currEP;
    public int currentCount;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public PurchaseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PurchaseOrganization organization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        currEP = ((Service) enterprise).getVaccineCount();
        currentCount = 0;
        lblVal.setText(account.getEmployee().getName());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVacc = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();
        lblTxt = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        cardRequestPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tblVacc.setForeground(new java.awt.Color(36, 47, 65));
        tblVacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        tblVacc.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblVacc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 630, 180));

        btnRequest.setBackground(new java.awt.Color(255, 255, 255));
        btnRequest.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnRequest.setText("Request Vaccine");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        lblTxt.setBackground(new java.awt.Color(0, 0, 0));
        lblTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTxt.setText("Currently Logged in as:");
        add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, 30));

        lblVal.setBackground(new java.awt.Color(255, 255, 255));
        lblVal.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        lblVal.setText("<value>");
        add(lblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 230, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Vaccine Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1440, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient-big.jpg"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));

        cardRequestPanel.setBackground(new java.awt.Color(255, 255, 255));
        cardRequestPanel.setMinimumSize(new java.awt.Dimension(670, 848));
        cardRequestPanel.setPreferredSize(new java.awt.Dimension(670, 848));
        cardRequestPanel.setLayout(new java.awt.CardLayout());
        add(cardRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        populateTable();
        int count = tblVacc.getModel().getRowCount();
        System.out.println("Current count -> " + currentCount);
        if(currentCount <= 10){
        RequestVaccineJPanel requestVaccineJPanel = new RequestVaccineJPanel(enterprise.getOrganizationDirectory(), userProcessContainer, organization, enterprise, userAccount);
        cardRequestPanel.add("requestVaccineJPanel", requestVaccineJPanel);
        CardLayout layout = (CardLayout) cardRequestPanel.getLayout();
        layout.next(cardRequestPanel);
        dB4OUtil.storeSystem(system);
        }
        else{
            JOptionPane.showMessageDialog(this, "You already have enough vaccine in stock please utilise them before ordering");
        }

        
    }//GEN-LAST:event_btnRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JPanel cardRequestPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblVal;
    private javax.swing.JTable tblVacc;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVacc.getModel();
        model.setRowCount(0);
        UserAccount distributor = new UserAccount();
        try{
        for(WorkRequest rv:userAccount.getWorkQueue().getWorkRequestList()){
            System.out.println(enterprise.getName());
//        ArrayList<PurchaseInventory> inv = ((RequestVaccine) rv).getInventoryPurchase();
            Object row[] = new Object[4];
            row[0] = rv;
            row[1] = rv.getReceiver().getUsername();
            
//            if(inv!=null){
//            for(PurchaseInventory p : inv){
                
                if(rv.getStatus().equals("Approved")){
                System.out.println(enterprise.getName());
                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                        System.out.println(u.getRole().toString());
                        if(u.getRole().toString().equals("Business.Role.DistributionRole")){
                            ((RequestVaccine) rv).setDistribution(u);
                            distributor = u;
                            System.out.println(distributor.getUsername());
                            int c = ((RequestVaccine) rv).getCount();
                row[2] = c;
                
                currentCount = c;
                ((RequestVaccine) rv).setCount(c);
//                            System.out.println(o.getName());
//                            VaccineCount vc = new VaccineCount();
//                            vc.setVaccineName(rv.getReceiver().toString());
//                            vc.setCount(p.getQty());
//                            currEP += p.getQty();
//                            System.out.println(p.getQty());
//                            c+=p.getQty();
//                            System.out.println(c);
                            
//                            DistributionOrganization org = ((DistributionOrganization) o).getVaccineDirectory().add(vc);
                        }
                    }
                }
            }
                
                distributor.getWorkQueue().getWorkRequestList().add(rv);
                
//            }
//            }
            row[3] = rv.getStatus();
            System.out.println(rv.getStatus());
            
//            row[2] = 
            model.addRow(row);
        }
        }
        catch(NullPointerException e){
            System.out.println("No records found");
        }
    }
}
