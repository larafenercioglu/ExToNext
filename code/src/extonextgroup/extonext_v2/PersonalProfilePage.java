/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extonextgroup.extonext_v2;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class PersonalProfilePage extends javax.swing.JFrame {
    DBConnector db = new DBConnector();
    static ArrayList<String> personinfo;
    static ArrayList<String> donations;
    static ArrayList<String> uploads;
    static ArrayList<String> properties;
    static ArrayList<String> favs;
    
    
    /**
     * Creates new form PersonalProfilePage
     */
    public PersonalProfilePage() {
        initComponents();
    }
    
    public void paintPage() {
        try {
            personinfo = db.seePersonInfo(user);
            name.setText(personinfo.get(1));
            email.setText(personinfo.get(2));
            address.setText(personinfo.get(3));
            phonenumber.setText(personinfo.get(4));
            profilepic.setIcon(new ImageIcon(personinfo.get(5)));
        
        
        properties = db.myProperties(user);
        if (properties.size() == 0){
            myproperty1.setVisible(false);
            myproperty2.setVisible(false);
        }
        if (properties.size() == 4 ) {
        myproperty1.setText(properties.get(0) + "\n"+ properties.get(1)+ "\n" + properties.get(2)+ "\n" );
        myproperty2.setVisible(false);
        }
        if (properties.size() == 8 ) {
        myproperty1.setText(properties.get(0) + "\n"+ properties.get(1)+ "\n" + properties.get(2) + "\n"  );
        myproperty2.setText(properties.get(4) + "\n"+ properties.get(5)+ "\n" + properties.get(6)+ "\n" );
        }
        
        uploads = db.myUploads1(user);
        if (uploads.size() == 0){
            myupload1.setVisible(false);
            myupload2.setVisible(false);
        }
        if (uploads.size() == 4 ) {
        myupload1.setText(uploads.get(0) + "\n"+ uploads.get(1)+ "\n" + uploads.get(2) + "\n" + uploads.get(3) );
        myupload2.setVisible(false);
        }
        if (uploads.size() == 8 ) {
        myupload1.setText(uploads.get(0) + "\n"+ uploads.get(1)+ "\n" + uploads.get(2) + "\n" + uploads.get(3) );
        myupload2.setText(uploads.get(4) + "\n"+ uploads.get(5)+ "\n" + uploads.get(6)+ "\n" + uploads.get(7) );
        }
        
        
        favs = db.myDonations(user);
        if (favs.size() == 0){
            myfav1.setVisible(false);
            myfav2.setVisible(false);
        }
        if (favs.size() == 4 ) {
        myfav1.setText(favs.get(0) + "\n"+ favs.get(1)+ "\n" + favs.get(2) + "\n" + favs.get(3) );
        myfav2.setVisible(false);
        }
        if (favs.size() == 8 ) {
        myfav1.setText(favs.get(0) + "\n"+ favs.get(1)+ "\n" + favs.get(2) + "\n" + favs.get(3) );
        myfav2.setText(favs.get(4) + "\n"+ favs.get(5)+ "\n" + favs.get(6)+ "\n" + favs.get(7) );
        }
        
        donations = db.myDonations(user);
        if (donations.size() == 0){
            mydonations1.setVisible(false);
            mydonations2.setVisible(false);
        }
        if (donations.size() == 4 ) {
        mydonations1.setText(donations.get(0) + "\n"+ donations.get(1)+ "\n" + donations.get(2) + donations.get(3) );
        mydonations2.setVisible(false);
        }
        if (donations.size() == 8 ) {
        mydonations1.setText(donations.get(0) + "\n"+ donations.get(1)+ "\n" + donations.get(2) + "\n" + donations.get(3) );
        mydonations2.setText(donations.get(4) + "\n"+ donations.get(5)+ "\n" + donations.get(6)+ "\n" + donations.get(7) );
        }
        
        
     } catch (Exception e){
            e.getMessage();
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        profilemenu = new javax.swing.JMenuItem();
        logoutmenu = new javax.swing.JMenuItem();
        personalprofilebackground1 = new netbeanscomponents.personalprofilebackground();
        profilepic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        PersonalDetailsLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PersonalDetailsLabel2 = new javax.swing.JLabel();
        PersonalDetailsLabel3 = new javax.swing.JLabel();
        PersonalDetailsLabel4 = new javax.swing.JLabel();
        PersonalDetailsLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        myupload1 = new javax.swing.JTextArea();
        myupload2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        myproperty1 = new javax.swing.JTextArea();
        myproperty2 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        mydonations1 = new javax.swing.JTextArea();
        mydonations2 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        myfav1 = new javax.swing.JTextArea();
        myfav2 = new javax.swing.JTextArea();
        backbutton = new javax.swing.JButton();
        logobutton = new javax.swing.JButton();
        additembutton = new javax.swing.JButton();
        messagebutton = new javax.swing.JButton();
        profilebutton = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Name: ");
        jPanel1.add(name);

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email:");
        jPanel1.add(email);

        phonenumber.setBackground(new java.awt.Color(255, 255, 255));
        phonenumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phonenumber.setForeground(new java.awt.Color(0, 0, 0));
        phonenumber.setText("Phone Num:");
        jPanel1.add(phonenumber);

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setText("Address:");
        jPanel1.add(address);

        PersonalDetailsLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PersonalDetailsLabel.setForeground(new java.awt.Color(0, 0, 0));
        PersonalDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalDetailsLabel.setText("Personal Details");

        jPanel4.setOpaque(false);

        PersonalDetailsLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PersonalDetailsLabel2.setForeground(new java.awt.Color(0, 0, 0));
        PersonalDetailsLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalDetailsLabel2.setText("My Uploads");

        PersonalDetailsLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PersonalDetailsLabel3.setForeground(new java.awt.Color(0, 0, 0));
        PersonalDetailsLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalDetailsLabel3.setText("My Properties");

        PersonalDetailsLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PersonalDetailsLabel4.setForeground(new java.awt.Color(0, 0, 0));
        PersonalDetailsLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalDetailsLabel4.setText("My Donations");

        PersonalDetailsLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PersonalDetailsLabel5.setForeground(new java.awt.Color(0, 0, 0));
        PersonalDetailsLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalDetailsLabel5.setText("My Favourites");

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        myupload1.setColumns(20);
        myupload1.setRows(5);
        jPanel5.add(myupload1);

        myupload2.setColumns(20);
        myupload2.setRows(5);
        jPanel5.add(myupload2);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        myproperty1.setColumns(20);
        myproperty1.setRows(5);
        jPanel6.add(myproperty1);

        myproperty2.setColumns(20);
        myproperty2.setRows(5);
        jPanel6.add(myproperty2);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        mydonations1.setColumns(20);
        mydonations1.setRows(5);
        jPanel7.add(mydonations1);

        mydonations2.setColumns(20);
        mydonations2.setRows(5);
        jPanel7.add(mydonations2);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        myfav1.setColumns(20);
        myfav1.setRows(5);
        jPanel8.add(myfav1);

        myfav2.setColumns(20);
        myfav2.setRows(5);
        jPanel8.add(myfav2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PersonalDetailsLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonalDetailsLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PersonalDetailsLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PersonalDetailsLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PersonalDetailsLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PersonalDetailsLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PersonalDetailsLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PersonalDetailsLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        additembutton.setBackground(new java.awt.Color(255, 255, 255));
        additembutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/37x37uploadbutton.png"))); // NOI18N
        additembutton.setBorder(null);
        additembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additembuttonActionPerformed(evt);
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

        javax.swing.GroupLayout personalprofilebackground1Layout = new javax.swing.GroupLayout(personalprofilebackground1);
        personalprofilebackground1.setLayout(personalprofilebackground1Layout);
        personalprofilebackground1Layout.setHorizontalGroup(
            personalprofilebackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalprofilebackground1Layout.createSequentialGroup()
                .addGroup(personalprofilebackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalprofilebackground1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(personalprofilebackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PersonalDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)
                        .addComponent(profilepic, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalprofilebackground1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(535, 535, 535)
                        .addComponent(additembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(messagebutton)
                        .addGap(0, 0, 0)
                        .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        personalprofilebackground1Layout.setVerticalGroup(
            personalprofilebackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalprofilebackground1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(personalprofilebackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(backbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(additembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messagebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(personalprofilebackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalprofilebackground1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(PersonalDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalprofilebackground1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(personalprofilebackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(personalprofilebackground1Layout.createSequentialGroup()
                                .addComponent(profilepic, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personalprofilebackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personalprofilebackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilemenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profilemenuMouseClicked

    private void profilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilemenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilemenuActionPerformed

    private void logoutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutmenuActionPerformed
        // TODO add your handling code here:
        infoBox("Successfully logged out" , "logout" );
        this.hide();
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
    }//GEN-LAST:event_logoutmenuActionPerformed

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.show(this,989,117);
    }//GEN-LAST:event_profilebuttonActionPerformed

    private void messagebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagebuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        MessagePage message = new MessagePage();
        message.setVisible(true);
        message.setPage(page);
        message.setUser(user);
    }//GEN-LAST:event_messagebuttonActionPerformed

    private void additembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additembuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        UploadScreen upload = new UploadScreen();
        upload.setVisible(true);
        upload.setPage(page);
        upload.setUser(user);
    }//GEN-LAST:event_additembuttonActionPerformed

    private void logobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logobuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        MainPagePersonal personal = new MainPagePersonal();
        personal.setVisible(true);
        personal.setPage(page);
        personal.setUser(user);
    }//GEN-LAST:event_logobuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        openPage(previous);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalProfilePage().setVisible(true);
            }
        });
    }
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String user;
    public static int page = 14;
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
    private javax.swing.JLabel PersonalDetailsLabel;
    private javax.swing.JLabel PersonalDetailsLabel2;
    private javax.swing.JLabel PersonalDetailsLabel3;
    private javax.swing.JLabel PersonalDetailsLabel4;
    private javax.swing.JLabel PersonalDetailsLabel5;
    private javax.swing.JButton additembutton;
    private javax.swing.JLabel address;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton messagebutton;
    private javax.swing.JTextArea mydonations1;
    private javax.swing.JTextArea mydonations2;
    private javax.swing.JTextArea myfav1;
    private javax.swing.JTextArea myfav2;
    private javax.swing.JTextArea myproperty1;
    private javax.swing.JTextArea myproperty2;
    private javax.swing.JTextArea myupload1;
    private javax.swing.JTextArea myupload2;
    private javax.swing.JLabel name;
    private netbeanscomponents.personalprofilebackground personalprofilebackground1;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    private javax.swing.JLabel profilepic;
    // End of variables declaration//GEN-END:variables
}
