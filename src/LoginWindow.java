/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evere
 */
public class LoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VisitorLoginButton = new javax.swing.JButton();
        EmployeeLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VisitorLoginButton.setText("Visitor");
        VisitorLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitorLoginButtonActionPerformed(evt);
            }
        });

        EmployeeLoginButton.setText("Employee");
        EmployeeLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(VisitorLoginButton)
                .addGap(75, 75, 75)
                .addComponent(EmployeeLoginButton)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VisitorLoginButton)
                    .addComponent(EmployeeLoginButton))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisitorLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitorLoginButtonActionPerformed
        this.setVisible(false);
        VisitorWindow w = new VisitorWindow();
        w.setVisible(true);
    }//GEN-LAST:event_VisitorLoginButtonActionPerformed

    private void EmployeeLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeLoginButtonActionPerformed
        this.setVisible(false);
        EmployeeWindow w = new EmployeeWindow();
        w.setVisible(true);
    }//GEN-LAST:event_EmployeeLoginButtonActionPerformed

    public static void main(String args[]) {
        // Create and display the form:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeLoginButton;
    private javax.swing.JButton VisitorLoginButton;
    // End of variables declaration//GEN-END:variables
}
