package healy;

public class DiaryCl extends javax.swing.JFrame {
    private static int id;
    
    public DiaryCl(int iduser) {
        initComponents();
        
        Patient client = new Patient();
        System.out.println(iduser);
        int result = client.getData(iduser);
        this.id = iduser;
        
        System.out.println(iduser);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footer = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonDiary = new javax.swing.JButton();
        buttonClinic = new javax.swing.JButton();
        buttonForum = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDiary = new javax.swing.JTextArea();
        inputTitle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(720, 60));
        setMinimumSize(new java.awt.Dimension(416, 872));
        setResizable(false);
        setSize(new java.awt.Dimension(416, 872));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        footer.setBackground(new java.awt.Color(13, 76, 115));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setBackground(new java.awt.Color(144, 224, 239));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonHome.png"))); // NOI18N
        buttonHome.setBorder(null);
        buttonHome.setBorderPainted(false);
        buttonHome.setContentAreaFilled(false);
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeMouseClicked(evt);
            }
        });
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        footer.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        buttonDiary.setBackground(new java.awt.Color(144, 224, 239));
        buttonDiary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonDiary-select.png"))); // NOI18N
        buttonDiary.setBorder(null);
        buttonDiary.setBorderPainted(false);
        buttonDiary.setContentAreaFilled(false);
        buttonDiary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDiaryMouseClicked(evt);
            }
        });
        footer.add(buttonDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, -1));

        buttonClinic.setBackground(new java.awt.Color(144, 224, 239));
        buttonClinic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonClinic.png"))); // NOI18N
        buttonClinic.setBorder(null);
        buttonClinic.setBorderPainted(false);
        buttonClinic.setContentAreaFilled(false);
        buttonClinic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClinic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClinicMouseClicked(evt);
            }
        });
        buttonClinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClinicActionPerformed(evt);
            }
        });
        footer.add(buttonClinic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 80, -1));

        buttonForum.setBackground(new java.awt.Color(144, 224, 239));
        buttonForum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonForum.png"))); // NOI18N
        buttonForum.setBorder(null);
        buttonForum.setBorderPainted(false);
        buttonForum.setContentAreaFilled(false);
        buttonForum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonForum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonForumMouseClicked(evt);
            }
        });
        footer.add(buttonForum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/footerWide.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        footer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, -1));

        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 400, 120));

        body.setBackground(new java.awt.Color(13, 76, 115));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 119, 182));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        inputDiary.setBackground(new java.awt.Color(0, 119, 182));
        inputDiary.setColumns(20);
        inputDiary.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputDiary.setForeground(new java.awt.Color(255, 255, 255));
        inputDiary.setRows(5);
        inputDiary.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(inputDiary);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 340, 390));

        inputTitle.setBackground(new java.awt.Color(0, 119, 182));
        inputTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        inputTitle.setForeground(new java.awt.Color(255, 255, 255));
        inputTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTitle.setText("TITLE");
        inputTitle.setBorder(null);
        inputTitle.setCaretColor(new java.awt.Color(255, 255, 255));
        inputTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTitleActionPerformed(evt);
            }
        });
        body.add(inputTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 320, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/backgroundDiary.png"))); // NOI18N
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 510));

        buttonSave.setBackground(new java.awt.Color(13, 76, 115));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonSave.png"))); // NOI18N
        buttonSave.setBorder(null);
        buttonSave.setBorderPainted(false);
        buttonSave.setContentAreaFilled(false);
        buttonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSaveMouseClicked(evt);
            }
        });
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        body.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 530, 120, 50));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, 610));

        header.setBackground(new java.awt.Color(13, 76, 115));
        header.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/healy-logo.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(232, 188));
        jLabel3.setMinimumSize(new java.awt.Dimension(232, 188));
        jLabel3.setPreferredSize(new java.awt.Dimension(232, 188));
        header.add(jLabel3);
        jLabel3.setBounds(200, 10, 200, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/headerDiary.png"))); // NOI18N
        header.add(jLabel5);
        jLabel5.setBounds(0, 0, 190, 113);

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTitleActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonClinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClinicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClinicActionPerformed

    private void buttonSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSaveMouseClicked
        String title = inputTitle.getText();
        String entry = inputDiary.getText();
        Diary diary = new Diary();
        int result = diary.insert(title, entry, id);
        if(result == 1){
            DiaryMenuCl diaryMenu = new DiaryMenuCl(id);
            diaryMenu.show();
            dispose();
        }else System.out.println("[DEBUG] DIARY ENTRY ERROR");
    }//GEN-LAST:event_buttonSaveMouseClicked

    private void buttonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseClicked
        HomeCl homeCl = new HomeCl(id);
        homeCl.show();
        dispose();
    }//GEN-LAST:event_buttonHomeMouseClicked

    private void buttonClinicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClinicMouseClicked
        ClinicMenuCl clinic = new ClinicMenuCl(id);
        clinic.show();
        dispose();
    }//GEN-LAST:event_buttonClinicMouseClicked

    private void buttonForumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonForumMouseClicked
        ForumMenuCl forum = new ForumMenuCl(id);
        forum.show();
        dispose();
    }//GEN-LAST:event_buttonForumMouseClicked

    private void buttonDiaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiaryMouseClicked
        DiaryMenuCl diaryMenu = new DiaryMenuCl(id);
        diaryMenu.show();
        dispose();
    }//GEN-LAST:event_buttonDiaryMouseClicked

    

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
            java.util.logging.Logger.getLogger(DiaryCl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaryCl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaryCl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaryCl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiaryCl(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton buttonClinic;
    private javax.swing.JButton buttonDiary;
    private javax.swing.JButton buttonForum;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonSave;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JTextArea inputDiary;
    private javax.swing.JTextField inputTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
