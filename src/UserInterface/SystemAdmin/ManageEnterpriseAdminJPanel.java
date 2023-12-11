/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Util.DB4OUtil;
import Model.Ecosystem;
import Model.Employee.Employee;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Profile.Admin;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterpriselect.getModel();

        model.setRowCount(0);
        for (Region network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        cmbNetworkselect.removeAllItems();
        
        for (Region network : system.getNetworkList()){
            cmbNetworkselect.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Region network){
        cmbEnterpriseselect.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cmbEnterpriseselect.addItem(enterprise);
        }
        
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
        tblEnterpriselect = new javax.swing.JTable();
        lblNetworkselect = new javax.swing.JLabel();
        cmbNetworkselect = new javax.swing.JComboBox();
        lblUsernamee = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEnterpriseselect = new javax.swing.JLabel();
        cmbEnterpriseselect = new javax.swing.JComboBox();
        btnSub = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterpriselect.setForeground(new java.awt.Color(36, 47, 65));
        tblEnterpriselect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise", "Region", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterpriselect.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblEnterpriselect);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 560, 180));

        lblNetworkselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblNetworkselect.setText("Region:");
        add(lblNetworkselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        cmbNetworkselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cmbNetworkselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetworkselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkselectActionPerformed(evt);
            }
        });
        add(cmbNetworkselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 136, -1));

        lblUsernamee.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblUsernamee.setText("Username:");
        add(lblUsernamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));

        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtUsername.setBorder(null);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 210, 20));

        lblEnterpriseselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblEnterpriseselect.setText("Enterprise:");
        lblEnterpriseselect.setToolTipText("");
        add(lblEnterpriseselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        cmbEnterpriseselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cmbEnterpriseselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterpriseselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseselectActionPerformed(evt);
            }
        });
        add(cmbEnterpriseselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 136, -1));

        btnSub.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnSub.setText("Submit");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 760, -1, -1));

        lblPass.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblPass.setText("Password:");
        add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 650, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtName.setBorder(null);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 700, 210, 20));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 700, -1, -1));

        txtPass.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 650, 210, 20));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Enterprises");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1440, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkselectActionPerformed

        Region network = (Region) cmbNetworkselect.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_cmbNetworkselectActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        
        Enterprise enterprise = (Enterprise) cmbEnterpriseselect.getSelectedItem();
        System.out.println(enterprise.getNetwork().getName());
        String username = txtUsername.getText();
        String password = String.valueOf(txtPass.getPassword());
        String name = txtName.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if(username.equals("") || password.equals("")||name.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter all Values", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!Util.Validation.passwordValidator(password)){
            JOptionPane.showMessageDialog(null, "Password Criteria not Satisfied. Enter a password with 8 Characters, a Special character, 1 Uppercase and Numerical values", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists, select a new username", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new Admin());
        populateTable();
        
        dB4OUtil.storeSystem(system);
        txtPass.setText("");
        txtName.setText("");
        txtUsername.setText("");
      
        
    }//GEN-LAST:event_btnSubActionPerformed


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        try{
            SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        
        //JTree removed --> sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    private void cmbEnterpriseselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEnterpriseselectActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSub;
    private javax.swing.JComboBox cmbEnterpriseselect;
    private javax.swing.JComboBox cmbNetworkselect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterpriseselect;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetworkselect;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsernamee;
    private javax.swing.JTable tblEnterpriselect;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
