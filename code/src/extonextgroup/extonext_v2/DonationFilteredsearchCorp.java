/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extonextgroup.extonext_v2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DonationFilteredsearchCorp extends javax.swing.JFrame {

    static ArrayList<String> itemlist;
 
    /**
     * Creates new form DonationFilteredsearchCorp
     */
    public DonationFilteredsearchCorp() {
        initComponents();        
    }

    public  void paintPage() {
    
        if (itemlist.size() == 0)
        {   item1.setVisible(false);
            item2.setVisible(false);
            item3.setVisible(false);
            item4.setVisible(false);
        infoBox("There is no donation list!","");
        }
        if (itemlist.size() == 4) {
            item2.setVisible(false);
            item3.setVisible(false);
            item4.setVisible(false);
            Recieversmessage.setText(itemlist.get(0));
            itemcategory.setText(itemlist.get(1));
            recieveraddress.setText(itemlist.get(2));
        }
        if  (itemlist.size() == 8) {            
            item3.setVisible(false);
            item4.setVisible(false);
            Recieversmessage.setText(itemlist.get(0));
            itemcategory.setText(itemlist.get(1));
            recieveraddress.setText(itemlist.get(2));
            Recieversmessage1.setText(itemlist.get(4));
            itemcategory1.setText(itemlist.get(5));
            recieveraddress1.setText(itemlist.get(6));
        }
        if  (itemlist.size() == 12) {            
            
            item4.setVisible(false);
            Recieversmessage.setText(itemlist.get(0));
            itemcategory.setText(itemlist.get(1));
            recieveraddress.setText(itemlist.get(2));
            Recieversmessage1.setText(itemlist.get(4));
            itemcategory1.setText(itemlist.get(5));
            recieveraddress1.setText(itemlist.get(6));
            Recieversmessage2.setText(itemlist.get(8));
            itemcategory2.setText(itemlist.get(9));
            recieveraddress2.setText(itemlist.get(10));
           
        }
        if  (itemlist.size() == 16) {            
            
            Recieversmessage.setText(itemlist.get(0));
            itemcategory.setText(itemlist.get(1));
            recieveraddress.setText(itemlist.get(2));
            Recieversmessage1.setText(itemlist.get(4));
            itemcategory1.setText(itemlist.get(5));
            recieveraddress1.setText(itemlist.get(6));
            Recieversmessage2.setText(itemlist.get(8));
            itemcategory2.setText(itemlist.get(9));
            recieveraddress2.setText(itemlist.get(10));
            Recieversmessage3.setText(itemlist.get(12));
            itemcategory3.setText(itemlist.get(13));
            recieveraddress3.setText(itemlist.get(14));
        }
    }
    public static void setList(ArrayList<String> a) {
        itemlist = a;
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
        donationlistlistcorpbackground1 = new netbeanscomponents.Donationlistlistcorpbackground();
        logobutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        messagebutton = new javax.swing.JButton();
        profilebutton = new javax.swing.JButton();
        wishlistlist = new javax.swing.JPanel();
        item1 = new javax.swing.JPanel();
        itemcategory = new javax.swing.JLabel();
        Recieversmessage = new javax.swing.JLabel();
        recieveraddress = new javax.swing.JLabel();
        item2 = new javax.swing.JPanel();
        itemcategory1 = new javax.swing.JLabel();
        Recieversmessage1 = new javax.swing.JLabel();
        recieveraddress1 = new javax.swing.JLabel();
        item3 = new javax.swing.JPanel();
        itemcategory2 = new javax.swing.JLabel();
        Recieversmessage2 = new javax.swing.JLabel();
        recieveraddress2 = new javax.swing.JLabel();
        item4 = new javax.swing.JPanel();
        itemcategory3 = new javax.swing.JLabel();
        Recieversmessage3 = new javax.swing.JLabel();
        recieveraddress3 = new javax.swing.JLabel();

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

        wishlistlist.setOpaque(false);
        wishlistlist.setLayout(new java.awt.GridLayout(4, 1));

        item1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        item1.setOpaque(false);

        itemcategory.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        itemcategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemcategory.setText("Need x");
        itemcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemcategoryMouseClicked(evt);
            }
        });

        Recieversmessage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Recieversmessage.setText("jLabel2");
        Recieversmessage.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        recieveraddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        recieveraddress.setText("jLabel3");
        recieveraddress.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout item1Layout = new javax.swing.GroupLayout(item1);
        item1.setLayout(item1Layout);
        item1Layout.setHorizontalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1Layout.createSequentialGroup()
                .addComponent(itemcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Recieversmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(recieveraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        item1Layout.setVerticalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(item1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recieveraddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Recieversmessage, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
        );

        wishlistlist.add(item1);

        item2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        item2.setOpaque(false);

        itemcategory1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        itemcategory1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemcategory1.setText("Need x");
        itemcategory1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemcategory1MouseClicked(evt);
            }
        });

        Recieversmessage1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Recieversmessage1.setText("jLabel2");
        Recieversmessage1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        recieveraddress1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        recieveraddress1.setText("jLabel3");
        recieveraddress1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout item2Layout = new javax.swing.GroupLayout(item2);
        item2.setLayout(item2Layout);
        item2Layout.setHorizontalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item2Layout.createSequentialGroup()
                .addComponent(itemcategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Recieversmessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(recieveraddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        item2Layout.setVerticalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemcategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(item2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recieveraddress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Recieversmessage1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
        );

        wishlistlist.add(item2);

        item3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        item3.setOpaque(false);

        itemcategory2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        itemcategory2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemcategory2.setText("Need x");
        itemcategory2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemcategory2MouseClicked(evt);
            }
        });

        Recieversmessage2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Recieversmessage2.setText("jLabel2");
        Recieversmessage2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        recieveraddress2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        recieveraddress2.setText("jLabel3");
        recieveraddress2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout item3Layout = new javax.swing.GroupLayout(item3);
        item3.setLayout(item3Layout);
        item3Layout.setHorizontalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item3Layout.createSequentialGroup()
                .addComponent(itemcategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Recieversmessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(recieveraddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        item3Layout.setVerticalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemcategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(item3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recieveraddress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Recieversmessage2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
        );

        wishlistlist.add(item3);

        item4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        item4.setOpaque(false);

        itemcategory3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        itemcategory3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemcategory3.setText("Need x");
        itemcategory3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemcategory3MouseClicked(evt);
            }
        });

        Recieversmessage3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Recieversmessage3.setText("jLabel2");
        Recieversmessage3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        recieveraddress3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        recieveraddress3.setText("jLabel3");
        recieveraddress3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout item4Layout = new javax.swing.GroupLayout(item4);
        item4.setLayout(item4Layout);
        item4Layout.setHorizontalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item4Layout.createSequentialGroup()
                .addComponent(itemcategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Recieversmessage3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(recieveraddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        item4Layout.setVerticalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemcategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(item4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recieveraddress3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Recieversmessage3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
        );

        wishlistlist.add(item4);

        javax.swing.GroupLayout donationlistlistcorpbackground1Layout = new javax.swing.GroupLayout(donationlistlistcorpbackground1);
        donationlistlistcorpbackground1.setLayout(donationlistlistcorpbackground1Layout);
        donationlistlistcorpbackground1Layout.setHorizontalGroup(
            donationlistlistcorpbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donationlistlistcorpbackground1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 594, Short.MAX_VALUE)
                .addComponent(messagebutton)
                .addGap(0, 0, 0)
                .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donationlistlistcorpbackground1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wishlistlist, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        donationlistlistcorpbackground1Layout.setVerticalGroup(
            donationlistlistcorpbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donationlistlistcorpbackground1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(donationlistlistcorpbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(donationlistlistcorpbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messagebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logobutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(wishlistlist, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(donationlistlistcorpbackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(donationlistlistcorpbackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        openPage(previous);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.show(this,989,117);
    }//GEN-LAST:event_profilebuttonActionPerformed

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
    }//GEN-LAST:event_messagebuttonActionPerformed

    private void itemcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemcategoryMouseClicked
      this.hide();
      WishListPageCorp donatepg = new WishListPageCorp();
      donatepg.setPage(page);
      donatepg.setUser(user);
      donatepg.setList(itemlist,1);
      donatepg.paintPage();
      donatepg.setVisible(true);
      
    }//GEN-LAST:event_itemcategoryMouseClicked

    private void itemcategory1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemcategory1MouseClicked
        // TODO add your handling code here:
         this.hide();
      WishListPageCorp donatepg = new WishListPageCorp();
      donatepg.setPage(page);
      donatepg.setUser(user);
      donatepg.setList(itemlist,2);
      donatepg.paintPage();
      donatepg.setVisible(true);
    }//GEN-LAST:event_itemcategory1MouseClicked

    private void itemcategory2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemcategory2MouseClicked
        // TODO add your handling code here:
         this.hide();
      WishListPageCorp donatepg = new WishListPageCorp();
      donatepg.setPage(page);
      donatepg.setUser(user);
      donatepg.setList(itemlist,3);
      donatepg.paintPage();
      donatepg.setVisible(true);
    }//GEN-LAST:event_itemcategory2MouseClicked

    private void itemcategory3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemcategory3MouseClicked
        // TODO add your handling code here:
         this.hide();
      WishListPageCorp donatepg = new WishListPageCorp();
      donatepg.setPage(page);
      donatepg.setUser(user);
      donatepg.setList(itemlist,4);
      donatepg.paintPage();
      donatepg.setVisible(true);
    }//GEN-LAST:event_itemcategory3MouseClicked

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
            java.util.logging.Logger.getLogger(DonationFilteredsearchCorp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonationFilteredsearchCorp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonationFilteredsearchCorp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonationFilteredsearchCorp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonationFilteredsearchCorp().setVisible(true);
            }
        });
    }
    
     public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
     public static String user;
    public static int page = 7;
    public static int previous;
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
    private javax.swing.JLabel Recieversmessage;
    private javax.swing.JLabel Recieversmessage1;
    private javax.swing.JLabel Recieversmessage2;
    private javax.swing.JLabel Recieversmessage3;
    private javax.swing.JButton backbutton;
    private netbeanscomponents.Donationlistlistcorpbackground donationlistlistcorpbackground1;
    private javax.swing.JPanel item1;
    private javax.swing.JPanel item2;
    private javax.swing.JPanel item3;
    private javax.swing.JPanel item4;
    private javax.swing.JLabel itemcategory;
    private javax.swing.JLabel itemcategory1;
    private javax.swing.JLabel itemcategory2;
    private javax.swing.JLabel itemcategory3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton messagebutton;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    private javax.swing.JLabel recieveraddress;
    private javax.swing.JLabel recieveraddress1;
    private javax.swing.JLabel recieveraddress2;
    private javax.swing.JLabel recieveraddress3;
    private javax.swing.JPanel wishlistlist;
    // End of variables declaration//GEN-END:variables
}
