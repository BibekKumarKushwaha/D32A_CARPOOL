/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author LEGION
 */
public class ForgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgetPassword
     */
    public ForgetPassword() {
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

        buttonBack = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        labelCarpoolLogo = new javax.swing.JLabel();
        labelWhiteLineDivider = new javax.swing.JLabel();
        panelLoginFrame = new javax.swing.JPanel();
        labelLOGIN = new javax.swing.JLabel();
        textfieldEmail = new javax.swing.JTextField();
        labelLOGIN2 = new javax.swing.JLabel();
        textfieldEmail1 = new javax.swing.JTextField();
        textfieldPassword1 = new javax.swing.JTextField();
        textfieldPassword = new javax.swing.JTextField();
        buttonRegister1 = new javax.swing.JButton();
        panelContact = new javax.swing.JPanel();
        labelContact10 = new javax.swing.JLabel();
        labelContact11 = new javax.swing.JLabel();
        labelContact12 = new javax.swing.JLabel();
        labelContact13 = new javax.swing.JLabel();
        labelContact14 = new javax.swing.JLabel();
        buttonRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonBack.setBackground(new java.awt.Color(102, 142, 57));
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/backIcon.png"))); // NOI18N

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
        labelLOGIN.setText("PASSWORD");

        textfieldEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        textfieldEmail.setText("Email address");
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

        labelLOGIN2.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        labelLOGIN2.setForeground(new java.awt.Color(255, 255, 255));
        labelLOGIN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLOGIN2.setText("RESET");

        textfieldEmail1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        textfieldEmail1.setText("New Password");
        textfieldEmail1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldEmail1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldEmail1FocusLost(evt);
            }
        });
        textfieldEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldEmail1ActionPerformed(evt);
            }
        });

        textfieldPassword1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        textfieldPassword1.setText("Re-enter Password");
        textfieldPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldPassword1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldPassword1FocusLost(evt);
            }
        });
        textfieldPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldPassword1ActionPerformed(evt);
            }
        });

        textfieldPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        textfieldPassword.setText("Verification code");
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

        buttonRegister1.setBackground(new java.awt.Color(0, 255, 51));
        buttonRegister1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegister1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister1.setText("SEND VERIFICATION CODE");
        buttonRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginFrameLayout = new javax.swing.GroupLayout(panelLoginFrame);
        panelLoginFrame.setLayout(panelLoginFrameLayout);
        panelLoginFrameLayout.setHorizontalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLOGIN)
                .addGap(68, 68, 68))
            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginFrameLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(labelLOGIN2))
                    .addGroup(panelLoginFrameLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textfieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(textfieldEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(textfieldPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(textfieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(buttonRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginFrameLayout.setVerticalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                .addComponent(labelLOGIN2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(buttonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textfieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(textfieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textfieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(376, 376, 376))
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
                    .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelContact10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelContact13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        buttonRegister.setBackground(new java.awt.Color(0, 255, 51));
        buttonRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setText("RESET");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(470, 470, 470))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCarpoolLogo)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelWhiteLineDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(panelContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonBack)
                .addContainerGap(1220, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(buttonBack)
                .addContainerGap(659, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void textfieldEmail1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldEmail1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldEmail1FocusGained

    private void textfieldEmail1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldEmail1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldEmail1FocusLost

    private void textfieldEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldEmail1ActionPerformed

    private void textfieldPassword1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldPassword1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldPassword1FocusGained

    private void textfieldPassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldPassword1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldPassword1FocusLost

    private void textfieldPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldPassword1ActionPerformed

    private void buttonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegister1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegister1ActionPerformed

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JButton buttonRegister1;
    private javax.swing.JLabel labelCarpoolLogo;
    private javax.swing.JLabel labelContact10;
    private javax.swing.JLabel labelContact11;
    private javax.swing.JLabel labelContact12;
    private javax.swing.JLabel labelContact13;
    private javax.swing.JLabel labelContact14;
    private javax.swing.JLabel labelLOGIN;
    private javax.swing.JLabel labelLOGIN2;
    private javax.swing.JLabel labelWhiteLineDivider;
    private javax.swing.JPanel panelContact;
    private javax.swing.JPanel panelLoginFrame;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textfieldEmail;
    private javax.swing.JTextField textfieldEmail1;
    private javax.swing.JTextField textfieldPassword;
    private javax.swing.JTextField textfieldPassword1;
    // End of variables declaration//GEN-END:variables
}
