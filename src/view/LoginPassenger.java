/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LEGION
 */
public class LoginPassenger extends javax.swing.JFrame {

    /**
     * Creates new form LoginPassenger
     */
    public LoginPassenger() {
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

        panelMain = new javax.swing.JPanel();
        labelCarpoolLogo = new javax.swing.JLabel();
        labelWhiteLineDivider = new javax.swing.JLabel();
        panelLoginFrame = new javax.swing.JPanel();
        labelLOGIN = new javax.swing.JLabel();
        textfieldEmail = new javax.swing.JTextField();
        textfieldPassword = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        buttonRegister = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        labelLOGIN1 = new javax.swing.JLabel();
        panelContact = new javax.swing.JPanel();
        labelContact10 = new javax.swing.JLabel();
        labelContact11 = new javax.swing.JLabel();
        labelContact12 = new javax.swing.JLabel();
        labelContact13 = new javax.swing.JLabel();
        labelContact14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(102, 142, 57));
        panelMain.setToolTipText("");
        panelMain.setPreferredSize(new java.awt.Dimension(1270, 720));

        labelCarpoolLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/carpool.png"))); // NOI18N

        labelWhiteLineDivider.setBackground(new java.awt.Color(255, 255, 255));
        labelWhiteLineDivider.setOpaque(true);

        panelLoginFrame.setBackground(new java.awt.Color(102, 142, 57));

        labelLOGIN.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        labelLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        labelLOGIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLOGIN.setText("PASSENGER");

        textfieldEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        textfieldEmail.setText("Email");
        textfieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldEmailFocusLost(evt);
            }
        });
        textfieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldEmailActionPerformed(evt);
            }
        });

        textfieldPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        textfieldPassword.setText("Password");
        textfieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldPasswordFocusLost(evt);
            }
        });
        textfieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldPasswordActionPerformed(evt);
            }
        });

        buttonLogin.setBackground(new java.awt.Color(0, 0, 255));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("LOGIN");
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonRegister.setBackground(new java.awt.Color(0, 255, 51));
        buttonRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setText("REGISTER");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(102, 142, 57));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 0, 0));
        jToggleButton1.setText("* forgot password");
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelLOGIN1.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        labelLOGIN1.setForeground(new java.awt.Color(255, 255, 255));
        labelLOGIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLOGIN1.setText("LOGIN");

        javax.swing.GroupLayout panelLoginFrameLayout = new javax.swing.GroupLayout(panelLoginFrame);
        panelLoginFrame.setLayout(panelLoginFrameLayout);
        panelLoginFrameLayout.setHorizontalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLOGIN1)
                    .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                            .addComponent(jToggleButton1)
                            .addGap(84, 84, 84))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                            .addComponent(labelLOGIN)
                            .addGap(30, 30, 30)))))
            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textfieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textfieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLoginFrameLayout.setVerticalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLOGIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(textfieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(textfieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelContact.setBackground(new java.awt.Color(102, 142, 57));

        labelContact10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact10.setForeground(new java.awt.Color(255, 255, 255));
        labelContact10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fbIcon.png"))); // NOI18N
        labelContact10.setText("www.facebook/sahayatri_carpool.com");

        labelContact11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/contactIcon.png"))); // NOI18N

        labelContact12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact12.setForeground(new java.awt.Color(255, 255, 255));
        labelContact12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/phoneIcon.PNG"))); // NOI18N
        labelContact12.setText("+977-(01)-4797486, +977-9841446531");

        labelContact13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact13.setForeground(new java.awt.Color(255, 255, 255));
        labelContact13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/locationIcon.png"))); // NOI18N
        labelContact13.setText("Pipolbot, Dillibazar, Kathmandu");

        labelContact14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact14.setForeground(new java.awt.Color(255, 255, 255));
        labelContact14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/emailIcon.png"))); // NOI18N
        labelContact14.setText("sahayatri.carpool@gmail.com");

        javax.swing.GroupLayout panelContactLayout = new javax.swing.GroupLayout(panelContact);
        panelContact.setLayout(panelContactLayout);
        panelContactLayout.setHorizontalGroup(
            panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactLayout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(labelContact14, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelContact10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelContact13, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContactLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelContact11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1154, Short.MAX_VALUE)))
            .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContactLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(labelContact12, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(851, Short.MAX_VALUE)))
        );
        panelContactLayout.setVerticalGroup(
            panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContact14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContact13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContact10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContactLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelContact11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
            .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(labelContact12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelCarpoolLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWhiteLineDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(panelLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCarpoolLogo)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelWhiteLineDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(panelContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldEmailFocusGained
        // TODO add your handling code here:
        if (textfieldEmail.getText().equals("Email")) {
            textfieldEmail.setText("");
        }
    }//GEN-LAST:event_textfieldEmailFocusGained

    private void textfieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldEmailFocusLost
        // TODO add your handling code here:
        if (textfieldEmail.getText().equals("")) {
            textfieldEmail.setText("Email");
        }
    }//GEN-LAST:event_textfieldEmailFocusLost

    private void textfieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldEmailActionPerformed

    private void textfieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldPasswordFocusGained
        // TODO add your handling code here:
        if (textfieldPassword.getText().equals("Password")) {
            textfieldPassword.setText("");
        }
    }//GEN-LAST:event_textfieldPasswordFocusGained

    private void textfieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldPasswordFocusLost
        // TODO add your handling code here:
        if (textfieldPassword.getText().equals("")) {
            textfieldPassword.setText("Password");
        }
    }//GEN-LAST:event_textfieldPasswordFocusLost

    private void textfieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldPasswordActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // if(textfieldUsername1.)
        try {
            User u1 = new User(null, textfieldPassword.getText(), null, null, null, null, null, null, null, null, textfieldEmail.getText(), null, null, null, null, null, null) ;
            UserController sc = new UserController();
            ResultSet result = sc.selectQuery(u1);
            if(result.next()){
                JOptionPane.showMessageDialog(null, "Login Success");
                sc.changeStatus(u1);
                sc.updatestatus(u1);

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPassenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelCarpoolLogo;
    private javax.swing.JLabel labelContact10;
    private javax.swing.JLabel labelContact11;
    private javax.swing.JLabel labelContact12;
    private javax.swing.JLabel labelContact13;
    private javax.swing.JLabel labelContact14;
    private javax.swing.JLabel labelLOGIN;
    private javax.swing.JLabel labelLOGIN1;
    private javax.swing.JLabel labelWhiteLineDivider;
    private javax.swing.JPanel panelContact;
    private javax.swing.JPanel panelLoginFrame;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textfieldEmail;
    private javax.swing.JTextField textfieldPassword;
    // End of variables declaration//GEN-END:variables
}
