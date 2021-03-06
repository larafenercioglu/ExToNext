/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extonextgroup.extonext_v2;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddDonationListPage extends javax.swing.JFrame {
    DBConnector db = new DBConnector();
    /**
     * Creates new form AddDonationListPage
     */
    public AddDonationListPage() {
        initComponents();
    }

    public static String user;
    public static int page = 1;
    public static int previous;
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
        adddonationbackground1 = new netbeanscomponents.adddonationbackground();
        messagebutton = new javax.swing.JButton();
        profilebutton = new javax.swing.JButton();
        logobutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        donatewish = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        count = new javax.swing.JTextField();
        SendButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        logobutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/logo.png"))); // NOI18N
        logobutton.setBorder(null);
        logobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logobuttonActionPerformed(evt);
            }
        });

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        donatewish.setText("Info of your need");
        donatewish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donatewishMouseClicked(evt);
            }
        });

        category.setBackground(new java.awt.Color(255, 255, 153));
        category.setForeground(new java.awt.Color(153, 0, 255));
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clothes", "Furniture", "Book" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        count.setText("Count:");
        count.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countMouseClicked(evt);
            }
        });

        SendButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/sendbutton.png"))); // NOI18N
        SendButton.setBorder(null);
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("3) Count");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout adddonationbackground1Layout = new javax.swing.GroupLayout(adddonationbackground1);
        adddonationbackground1.setLayout(adddonationbackground1Layout);
        adddonationbackground1Layout.setHorizontalGroup(
            adddonationbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adddonationbackground1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 589, Short.MAX_VALUE)
                .addComponent(messagebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adddonationbackground1Layout.createSequentialGroup()
                .addContainerGap(768, Short.MAX_VALUE)
                .addGroup(adddonationbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adddonationbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adddonationbackground1Layout.createSequentialGroup()
                            .addComponent(SendButton)
                            .addGap(167, 167, 167))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adddonationbackground1Layout.createSequentialGroup()
                            .addComponent(donatewish, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(124, 124, 124)))))
        );
        adddonationbackground1Layout.setVerticalGroup(
            adddonationbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adddonationbackground1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(adddonationbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logobutton)
                    .addGroup(adddonationbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messagebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profilebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(171, 171, 171)
                .addComponent(donatewish, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(SendButton)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adddonationbackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adddonationbackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
      //  MainPageCorporation mainCor = new MainPageCorporation();
        //mainCor.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void profilemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilemenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profilemenuMouseClicked

    private void profilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilemenuActionPerformed
        // TODO add your handling code here:
        this.hide();
        CorpProfilePage corpProfile = new CorpProfilePage();
        corpProfile.setPage(page);
        corpProfile.setUser(user);
        corpProfile.paintPage();
        corpProfile.setVisible(true);
        
    }//GEN-LAST:event_profilemenuActionPerformed

    private void logoutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutmenuActionPerformed
        // TODO add your handling code here:
        infoBox("Successfully logged out" , "logout" );
        this.hide();
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
    }//GEN-LAST:event_logoutmenuActionPerformed

    private void logobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logobuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        MainPageCorporation mainCor = new MainPageCorporation();
        mainCor.setVisible(true);
        mainCor.setPage(page);
        mainCor.setUser(user);
    }//GEN-LAST:event_logobuttonActionPerformed

    private void messagebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagebuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        MessagePage message = new MessagePage();
        message.setVisible(true);
        message.setPage(page);
        message.setUser(user);
    }//GEN-LAST:event_messagebuttonActionPerformed

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        // TODO add your handling code here:
        if ( count.getText().equals("") || donatewish.getText().equals(""))
        {
            infoBox("Both info and count should be entered", "Error");
        }
        else
        {
            try {
             
        db.addWishList1(user,donatewish.getText(),(String)category.getSelectedItem() ,parseInt(count.getText()));
            } catch (Exception e) {
                e.getMessage();
            }
        infoBox("Wish list created", "");
        this.hide();
        MainPageCorporation mainPage = new MainPageCorporation();
        mainPage.setUser(user);
        mainPage.setPage(page);
        mainPage.setVisible(true);
        }
    }//GEN-LAST:event_SendButtonActionPerformed
   
    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void donatewishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donatewishMouseClicked
        // TODO add your handling code here:
        donatewish.setText("");
        donatewish.setEnabled(true);
        
    }//GEN-LAST:event_donatewishMouseClicked

    private void countMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countMouseClicked
        // TODO add your handling code here:
        count.setText("");
        count.setEnabled(true);
    }//GEN-LAST:event_countMouseClicked

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
            java.util.logging.Logger.getLogger(AddDonationListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDonationListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDonationListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDonationListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDonationListPage().setVisible(true);
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
    private javax.swing.JButton SendButton;
    private netbeanscomponents.adddonationbackground adddonationbackground1;
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField count;
    private javax.swing.JTextField donatewish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton messagebutton;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    // End of variables declaration//GEN-END:variables
}
