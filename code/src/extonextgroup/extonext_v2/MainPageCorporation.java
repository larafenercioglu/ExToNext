/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extonextgroup.extonext_v2;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MainPageCorporation extends javax.swing.JFrame {

    //public String[] classContainer = {"AddDonationListPage", "AfterDonationPage", "AfterDonation"
    public static String user;
    public static int page = 11;
    public static int previous;
    
    /**
     * Creates new form MainPageCorporation
     */
    public MainPageCorporation() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        profilemenu = new javax.swing.JMenuItem();
        logoutmenu = new javax.swing.JMenuItem();
        backgroundcorp1 = new netbeanscomponents.Backgroundcorp();
        jLabel1 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        logobutton = new javax.swing.JButton();
        messagebutton = new javax.swing.JButton();
        profilebutton = new javax.swing.JButton();
        makedonationbutton = new javax.swing.JButton();
        adddonationlistbutton = new javax.swing.JButton();

        jPopupMenu1.setBackground(new java.awt.Color(204, 0, 255));
        jPopupMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jPopupMenu1.setAlignmentX(10.0F);

        profilemenu.setBackground(new java.awt.Color(204, 0, 255));
        profilemenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        profilemenu.setForeground(new java.awt.Color(255, 255, 255));
        profilemenu.setText("Go Profile");
        profilemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilemenuMouseClicked(evt);
            }
        });
        profilemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilemenuActionPerformed(evt);
            }
        });
        jPopupMenu1.add(profilemenu);

        logoutmenu.setBackground(new java.awt.Color(204, 0, 255));
        logoutmenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        logoutmenu.setForeground(new java.awt.Color(255, 255, 255));
        logoutmenu.setText("Logout");
        logoutmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutmenuActionPerformed(evt);
            }
        });
        jPopupMenu1.add(logoutmenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/mainImage.png"))); // NOI18N

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        logobutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/logo.png"))); // NOI18N
        logobutton.setBorder(null);
        logobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logobuttonActionPerformed(evt);
            }
        });

        messagebutton.setBackground(new java.awt.Color(255, 255, 255));
        messagebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/55x37messagebutton.png"))); // NOI18N
        messagebutton.setBorder(null);
        messagebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagebuttonActionPerformed(evt);
            }
        });

        profilebutton.setBackground(new java.awt.Color(255, 255, 255));
        profilebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/37x37profilebutton.png"))); // NOI18N
        profilebutton.setBorder(null);
        profilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebuttonActionPerformed(evt);
            }
        });

        makedonationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/makeadonationbutton.png"))); // NOI18N
        makedonationbutton.setToolTipText("");
        makedonationbutton.setBorder(null);
        makedonationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makedonationbuttonActionPerformed(evt);
            }
        });

        adddonationlistbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/donationlistbutton.png"))); // NOI18N
        adddonationlistbutton.setBorder(null);
        adddonationlistbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddonationlistbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundcorp1Layout = new javax.swing.GroupLayout(backgroundcorp1);
        backgroundcorp1.setLayout(backgroundcorp1Layout);
        backgroundcorp1Layout.setHorizontalGroup(
            backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundcorp1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messagebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(backgroundcorp1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundcorp1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(makedonationbutton)
                        .addGap(191, 191, 191)
                        .addComponent(adddonationlistbutton))
                    .addComponent(jLabel1))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        backgroundcorp1Layout.setVerticalGroup(
            backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundcorp1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messagebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logobutton))
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adddonationlistbutton)
                    .addComponent(makedonationbutton))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundcorp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundcorp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.show(this,989,117);
    }//GEN-LAST:event_profilebuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        openPage(previous);
            
        
    }//GEN-LAST:event_backbuttonActionPerformed

    private void profilemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilemenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profilemenuMouseClicked

    private void profilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilemenuActionPerformed
        // TODO add your handling code here:
        this.hide();
        CorpProfilePage corppage = new CorpProfilePage();
        corppage.setPage(page);
        corppage.setUser(user);
        corppage.paintPage();       
        corppage.setVisible(true);
    }//GEN-LAST:event_profilemenuActionPerformed

    private void logoutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutmenuActionPerformed
        // TODO add your handling code here:
        infoBox("Successfully logged out" , "logout" );
        this.hide();
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
        

    }//GEN-LAST:event_logoutmenuActionPerformed

    private void messagebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagebuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        MessagePage message = new MessagePage();
        message.setVisible(true);
        message.setPage(page);
        message.setUser(user);
    }//GEN-LAST:event_messagebuttonActionPerformed

    private void makedonationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makedonationbuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        CorpDonateScreen corpDonate = new CorpDonateScreen();
        corpDonate.setVisible(true);
        corpDonate.setPage(page);
        corpDonate.setUser(user);
    }//GEN-LAST:event_makedonationbuttonActionPerformed

    private void adddonationlistbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddonationlistbuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        AddDonationListPage donationList = new AddDonationListPage();
        AddDonationListPage.setPage(page);
    //    AddDonationListPage.setUser(this.user);
      //  AddDonationListPage.setPage(this.page);
        donationList.setVisible(true);
        donationList.setUser(user);
    }//GEN-LAST:event_adddonationlistbuttonActionPerformed

    private void logobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logobuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logobuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainPageCorporation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageCorporation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageCorporation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageCorporation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageCorporation().setVisible(true);
            }
        });
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void setUser(String username){
        user = username;
    }
    public static void setPage(int pagenum){
        previous = pagenum;
    }
    
    public void openPage(int pagenum){
        if (previous == 1) {
            AddDonationListPage donaListPage = new AddDonationListPage();
            donaListPage.setVisible(true);
            donaListPage.setUser(user);
            
        }
        if (previous == 2) {
            AfterDonationPage donaPage = new AfterDonationPage();
            
            donaPage.setUser(user);
            donaPage.paintPage();
            donaPage.setVisible(true);
        }
        if (previous == 3) {
            AfterDonationScreenCorp donaScreenCorp = new AfterDonationScreenCorp();
            donaScreenCorp.setVisible(true);
            donaScreenCorp.paintPage();
            donaScreenCorp.setUser(user);
        }
        if (previous == 4) {
            BuyScreen buyScreen = new BuyScreen();
           
            buyScreen.setUser(user);
             buyScreen.setVisible(true);
        }
        if (previous == 5) {
            CorpDonateScreen corpScreen = new CorpDonateScreen();
            
            corpScreen.setUser(user);
            corpScreen.setVisible(true);
        }
        if (previous == 6) {
            CorpProfilePage corpProfile = new CorpProfilePage();
            
            corpProfile.setUser(user);
            corpProfile.paintPage();
            corpProfile.setVisible(true);
        }
        if (previous == 7) {
            DonationFilteredsearchCorp fiteredCorp = new DonationFilteredsearchCorp();
            
            fiteredCorp.setUser(user);
            fiteredCorp.paintPage();
            fiteredCorp.setVisible(true);
        }
        if (previous == 8) {
            FilteredBuyScreen filteredBuy = new FilteredBuyScreen();
            
            filteredBuy.setUser(user);
            filteredBuy.paintPage();
            filteredBuy.setVisible(true);
        }
        if (previous == 9) {
            ItemDetailsPage itemDetails = new ItemDetailsPage();
            
            itemDetails.setUser(user);
            itemDetails.paintPage();
            itemDetails.setVisible(true);
        }
        if (previous == 10) {
            
        }
        if (previous == 11) {
            MainPageCorporation mainCorporation = new MainPageCorporation();
            mainCorporation.setVisible(true);
            mainCorporation.setUser(user);
        }
        if (previous == 12) {
            MainPagePersonal mainPersonal = new MainPagePersonal();
            mainPersonal.setVisible(true);
            mainPersonal.setUser(user);
        }
        if (previous == 13) {
            MessagePage messagePage = new MessagePage();
            
            messagePage.setUser(user);
            messagePage.paintPage();
            messagePage.setVisible(true);
        }
        if (previous == 14) {
            PersonalProfilePage personProfile = new PersonalProfilePage();
            
            personProfile.setUser(user);
            personProfile.paintPage();
            personProfile.setVisible(true);
        }
        if (previous == 15) {
        }

        if (previous == 16) {
            UploadScreen upload = new UploadScreen();
            upload.setVisible(true);
            upload.setUser(user);
        }
        if (previous == 17) {
            WishListListPage wishListList = new WishListListPage();
            wishListList.setVisible(true);
            wishListList.setUser(user);
        }
        if (previous == 18) {
            WishListPageCorp wishList = new WishListPageCorp();
            
            wishList.setUser(user);
            wishList.paintPage();
            wishList.setVisible(true);
        }
        if (previous == 19) {
            WishListPagePersonal wishListPersonal = new WishListPagePersonal();
           
            wishListPersonal.setUser(user);
            wishListPersonal.paintPage();
             wishListPersonal.setVisible(true);
        }
        if (previous == 20) {
            DonationPersonalPage donationPersonal = new DonationPersonalPage();
            donationPersonal.setVisible(true);
            donationPersonal.setUser(user);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddonationlistbutton;
    private javax.swing.JButton backbutton;
    private netbeanscomponents.Backgroundcorp backgroundcorp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton makedonationbutton;
    private javax.swing.JButton messagebutton;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    // End of variables declaration//GEN-END:variables
}
