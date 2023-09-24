package healy;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupPatient = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        loginButtonPatient = new javax.swing.JButton();
        registerButtonPatient = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        popupAdmin = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        loginButtonAdmin = new javax.swing.JButton();
        registerButtonAdmin = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        popupDoctor = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        loginButtonDoctor = new javax.swing.JButton();
        registerButtonDoctor = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonAdmin = new javax.swing.JButton();
        buttonDoctor = new javax.swing.JButton();
        buttonUser = new javax.swing.JButton();

        popupPatient.setBackground(new java.awt.Color(13, 76, 115));
        popupPatient.setLocation(new java.awt.Point(735, 320));
        popupPatient.setMinimumSize(new java.awt.Dimension(375, 328));
        popupPatient.setResizable(false);
        popupPatient.setSize(new java.awt.Dimension(375, 300));
        popupPatient.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 76, 115));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButtonPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonLogin.png"))); // NOI18N
        loginButtonPatient.setBorderPainted(false);
        loginButtonPatient.setContentAreaFilled(false);
        loginButtonPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtonPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonPatientMouseClicked(evt);
            }
        });
        loginButtonPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonPatientActionPerformed(evt);
            }
        });
        jPanel3.add(loginButtonPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 69));

        registerButtonPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonSignup.png"))); // NOI18N
        registerButtonPatient.setBorderPainted(false);
        registerButtonPatient.setContentAreaFilled(false);
        registerButtonPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButtonPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonPatientMouseClicked(evt);
            }
        });
        registerButtonPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonPatientActionPerformed(evt);
            }
        });
        jPanel3.add(registerButtonPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 330, 69));

        popupPatient.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 150));

        jPanel2.setBackground(new java.awt.Color(13, 76, 115));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN or SIGN UP");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(144, 224, 239));
        jLabel4.setText("as PATIENT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        popupPatient.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        popupAdmin.setBackground(new java.awt.Color(13, 76, 115));
        popupAdmin.setLocation(new java.awt.Point(735, 320));
        popupAdmin.setMinimumSize(new java.awt.Dimension(375, 328));
        popupAdmin.setResizable(false);
        popupAdmin.setSize(new java.awt.Dimension(375, 300));
        popupAdmin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(13, 76, 115));
        jPanel4.setLayout(new java.awt.GridLayout(2, 0, 1, 12));

        loginButtonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonLogin.png"))); // NOI18N
        loginButtonAdmin.setBorderPainted(false);
        loginButtonAdmin.setContentAreaFilled(false);
        loginButtonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtonAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonAdminMouseClicked(evt);
            }
        });
        loginButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonAdminActionPerformed(evt);
            }
        });
        jPanel4.add(loginButtonAdmin);

        registerButtonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonSignup.png"))); // NOI18N
        registerButtonAdmin.setBorderPainted(false);
        registerButtonAdmin.setContentAreaFilled(false);
        registerButtonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButtonAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonAdminMouseClicked(evt);
            }
        });
        registerButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonAdminActionPerformed(evt);
            }
        });
        jPanel4.add(registerButtonAdmin);

        popupAdmin.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 150));

        jPanel5.setBackground(new java.awt.Color(13, 76, 115));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGIN or SIGN UP");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(144, 224, 239));
        jLabel6.setText("as ADMIN");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        popupAdmin.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        popupDoctor.setBackground(new java.awt.Color(13, 76, 115));
        popupDoctor.setLocation(new java.awt.Point(735, 320));
        popupDoctor.setMinimumSize(new java.awt.Dimension(375, 328));
        popupDoctor.setResizable(false);
        popupDoctor.setSize(new java.awt.Dimension(375, 300));
        popupDoctor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(13, 76, 115));
        jPanel6.setLayout(new java.awt.GridLayout(2, 0, 1, 12));

        loginButtonDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonLogin.png"))); // NOI18N
        loginButtonDoctor.setBorderPainted(false);
        loginButtonDoctor.setContentAreaFilled(false);
        loginButtonDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtonDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonDoctorMouseClicked(evt);
            }
        });
        loginButtonDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonDoctorActionPerformed(evt);
            }
        });
        jPanel6.add(loginButtonDoctor);

        registerButtonDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonSignup.png"))); // NOI18N
        registerButtonDoctor.setBorderPainted(false);
        registerButtonDoctor.setContentAreaFilled(false);
        registerButtonDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButtonDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonDoctorMouseClicked(evt);
            }
        });
        registerButtonDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonDoctorActionPerformed(evt);
            }
        });
        jPanel6.add(registerButtonDoctor);

        popupDoctor.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 150));

        jPanel7.setBackground(new java.awt.Color(13, 76, 115));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LOGIN or SIGN UP");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(144, 224, 239));
        jLabel8.setText("as COUNSELOR");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        popupDoctor.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(720, 60));
        setPreferredSize(new java.awt.Dimension(408, 876));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 76, 115));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/doctor authen_1.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(595, 657));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 170, 372, 420);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/healy-logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 30, 197, 113);

        buttonAdmin.setBackground(new java.awt.Color(13, 76, 115));
        buttonAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonAdmin.setForeground(new java.awt.Color(13, 76, 115));
        buttonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/adminButton.png"))); // NOI18N
        buttonAdmin.setBorder(null);
        buttonAdmin.setBorderPainted(false);
        buttonAdmin.setContentAreaFilled(false);
        buttonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdmin.setVerifyInputWhenFocusTarget(false);
        buttonAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAdminMouseClicked(evt);
            }
        });
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdmin);
        buttonAdmin.setBounds(210, 670, 174, 56);

        buttonDoctor.setBackground(new java.awt.Color(13, 76, 115));
        buttonDoctor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonDoctor.setForeground(new java.awt.Color(13, 76, 115));
        buttonDoctor.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Healy\\src\\healy\\asset\\doctorButton.png")); // NOI18N
        buttonDoctor.setBorderPainted(false);
        buttonDoctor.setContentAreaFilled(false);
        buttonDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDoctorMouseClicked(evt);
            }
        });
        buttonDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDoctor);
        buttonDoctor.setBounds(90, 760, 220, 56);

        buttonUser.setBackground(new java.awt.Color(13, 76, 115));
        buttonUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonUser.setForeground(new java.awt.Color(13, 76, 115));
        buttonUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Healy\\src\\healy\\asset\\patientButton.png")); // NOI18N
        buttonUser.setBorder(null);
        buttonUser.setBorderPainted(false);
        buttonUser.setContentAreaFilled(false);
        buttonUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonUserMouseClicked(evt);
            }
        });
        buttonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUserActionPerformed(evt);
            }
        });
        jPanel1.add(buttonUser);
        buttonUser.setBounds(10, 670, 174, 56);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 852));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdminActionPerformed

    private void buttonDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDoctorActionPerformed

    private void buttonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUserActionPerformed
        
    }//GEN-LAST:event_buttonUserActionPerformed

    private void buttonUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUserMouseClicked
        popupPatient.show();
        popupAdmin.dispose();
        popupDoctor.dispose();
    }//GEN-LAST:event_buttonUserMouseClicked

    private void loginButtonPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonPatientActionPerformed

    private void registerButtonPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonPatientActionPerformed

    private void loginButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonAdminActionPerformed

    private void registerButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonAdminActionPerformed

    private void loginButtonDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonDoctorActionPerformed

    private void registerButtonDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonDoctorActionPerformed

    private void buttonAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdminMouseClicked
        popupAdmin.show();
        popupPatient.dispose();
        popupDoctor.dispose();
    }//GEN-LAST:event_buttonAdminMouseClicked

    private void buttonDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDoctorMouseClicked
        popupDoctor.show();
        popupPatient.dispose();
        popupAdmin.dispose();
    }//GEN-LAST:event_buttonDoctorMouseClicked

    private void loginButtonPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonPatientMouseClicked
        LoginClient loginP = new LoginClient();
        loginP.show();
        dispose();
    }//GEN-LAST:event_loginButtonPatientMouseClicked

    private void loginButtonAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonAdminMouseClicked
        LoginAdmin loginA = new LoginAdmin();
        loginA.show();
        dispose();
    }//GEN-LAST:event_loginButtonAdminMouseClicked

    private void loginButtonDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonDoctorMouseClicked
        LoginDoctor loginD = new LoginDoctor();
        loginD.show();
        dispose();
    }//GEN-LAST:event_loginButtonDoctorMouseClicked

    private void registerButtonPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonPatientMouseClicked
        SignUpClient signUpC = new SignUpClient();
        signUpC.show();
        dispose();
    }//GEN-LAST:event_registerButtonPatientMouseClicked

    private void registerButtonAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonAdminMouseClicked
        SignUpAdmin signUpA = new SignUpAdmin();
        signUpA.show();
        dispose();
    }//GEN-LAST:event_registerButtonAdminMouseClicked

    private void registerButtonDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonDoctorMouseClicked
        SignUpDoctor signUpD = new SignUpDoctor();
        signUpD.show();
        dispose();
    }//GEN-LAST:event_registerButtonDoctorMouseClicked

    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonDoctor;
    private javax.swing.JButton buttonUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton loginButtonAdmin;
    private javax.swing.JButton loginButtonDoctor;
    private javax.swing.JButton loginButtonPatient;
    private javax.swing.JDialog popupAdmin;
    private javax.swing.JDialog popupDoctor;
    private javax.swing.JDialog popupPatient;
    private javax.swing.JButton registerButtonAdmin;
    private javax.swing.JButton registerButtonDoctor;
    private javax.swing.JButton registerButtonPatient;
    // End of variables declaration//GEN-END:variables
}
