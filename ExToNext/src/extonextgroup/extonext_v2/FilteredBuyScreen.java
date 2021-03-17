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
public class FilteredBuyScreen extends javax.swing.JFrame {

    static boolean issale;
    
    static ArrayList<String> itemlist;
    /**
     * Creates new form FilteredBuyScreen
     */
    public FilteredBuyScreen() {
        initComponents();
        
    }
    public void setSale(boolean x){
        issale = x;
        
    }

    public void paintPage() {
            if (issale) {
        if (itemlist.size() == 0) {
            item1panel.setVisible(false);
            item2panel.setVisible(false);
            item3panel.setVisible(false);
            item4panel.setVisible(false);
        }
        if (itemlist.size() == 4) {
            item2panel.setVisible(false);
            item3panel.setVisible(false);
            item4panel.setVisible(false);
            itempiclabel.setIcon(new ImageIcon(itemlist.get(3)));
            itempiclabel.setText("");
            itemname.setText(itemlist.get(2));
            price.setText(itemlist.get(1));
            itemdetail.setText(itemlist.get(0));
        }
        if  (itemlist.size() == 8) {            
            item3panel.setVisible(false);
            item4panel.setVisible(false);
            itempiclabel.setIcon(new ImageIcon(itemlist.get(3)));
            itempiclabel.setText("");
            itempiclabel1.setText("");
            itempiclabel1.setIcon(new ImageIcon(itemlist.get(7)));
            itemname.setText(itemlist.get(2));
            itemname1.setText(itemlist.get(6));
            price.setText(itemlist.get(1));
            price1.setText(itemlist.get(5));
            itemdetail.setText(itemlist.get(0));
            itemname1.setText(itemlist.get(4));
        }
        if  (itemlist.size() == 12) {            
            
            item4panel.setVisible(false);
            itempiclabel.setIcon(new ImageIcon(itemlist.get(3)));
            itempiclabel.setText("");
            itempiclabel1.setIcon(new ImageIcon(itemlist.get(7)));
            itempiclabel1.setText("");
            itempiclabel2.setIcon(new ImageIcon(itemlist.get(11)));
            itempiclabel2.setText("");
            itemname.setText(itemlist.get(2));
            itemname1.setText(itemlist.get(6));
            itemname2.setText(itemlist.get(10));
            price.setText(itemlist.get(1));
            price1.setText(itemlist.get(5));
            price2.setText(itemlist.get(9));
            itemdetail2.setText(itemlist.get(8));
            itemdetail.setText(itemlist.get(0));
            itemdetail1.setText(itemlist.get(4));
        }
        if  (itemlist.size() >= 16) {            
            
            itempiclabel.setIcon(new ImageIcon(itemlist.get(3)));
            itempiclabel.setText("");
            itempiclabel1.setIcon(new ImageIcon(itemlist.get(7)));
            itempiclabel1.setText("");

            itempiclabel2.setIcon(new ImageIcon(itemlist.get(11)));
            itempiclabel2.setText("");

            itempiclabel3.setIcon(new ImageIcon(itemlist.get(15)));
            itempiclabel3.setText("");

            itemname.setText(itemlist.get(2));
            itemname1.setText(itemlist.get(6));
            itemname2.setText(itemlist.get(10));
            itemname3.setText(itemlist.get(14));
            price.setText(itemlist.get(1));
            price1.setText(itemlist.get(5));
            price2.setText(itemlist.get(9));
            price3.setText(itemlist.get(13));
            itemdetail.setText(itemlist.get(0));
            itemdetail3.setText(itemlist.get(12));
            itemdetail1.setText(itemlist.get(4));
            itemdetail2.setText(itemlist.get(8));
        }
    }
    else {
                if (itemlist.size() == 0) {
            item1panel.setVisible(false);
            item2panel.setVisible(false);
            item3panel.setVisible(false);
            item4panel.setVisible(false);
        }
        if (itemlist.size() == 3) {
            item2panel.setVisible(false);
            item3panel.setVisible(false);
            item4panel.setVisible(false);
            itempiclabel.setIcon(new ImageIcon(itemlist.get(2)));
            itempiclabel.setText("");
            itemname.setText(itemlist.get(1));
            price.setText("");
            itemdetail.setText(itemlist.get(0));
        }
        if  (itemlist.size() == 6) {            
            item3panel.setVisible(false);
            item4panel.setVisible(false);
            itempiclabel.setIcon(new ImageIcon(itemlist.get(2)));
            itempiclabel.setText("");
            itempiclabel1.setText("");
            itempiclabel1.setIcon(new ImageIcon(itemlist.get(5)));
            itemname.setText(itemlist.get(1));
            itemname1.setText(itemlist.get(4));
            price.setText("");
            price1.setText("");
            itemdetail.setText(itemlist.get(0));
            itemdetail1.setText(itemlist.get(3));
        }
        if  (itemlist.size() >= 9) {            
            
            item4panel.setVisible(false);
            itempiclabel.setIcon(new ImageIcon(itemlist.get(2)));
            itempiclabel.setText("");
            itempiclabel1.setIcon(new ImageIcon(itemlist.get(5)));
            itempiclabel1.setText("");
            itempiclabel2.setIcon(new ImageIcon(itemlist.get(8)));
            itempiclabel2.setText("");
            itemname.setText(itemlist.get(1));
            itemname1.setText(itemlist.get(4));
            itemname2.setText(itemlist.get(7));
            price.setText("");
            price1.setText("");
            price2.setText("");
            itemdetail2.setText(itemlist.get(6));
            itemdetail.setText(itemlist.get(0));
            itemdetail1.setText(itemlist.get(3));
        }
        if  (itemlist.size() >= 16) {            
            
            itempiclabel.setIcon(new ImageIcon(itemlist.get(2)));
            itempiclabel.setText("");
            itempiclabel1.setIcon(new ImageIcon(itemlist.get(5)));
            itempiclabel1.setText("");

            itempiclabel2.setIcon(new ImageIcon(itemlist.get(8)));
            itempiclabel2.setText("");

            itempiclabel3.setIcon(new ImageIcon(itemlist.get(11)));
            itempiclabel3.setText("");

            itemname.setText(itemlist.get(1));
            itemname1.setText(itemlist.get(4));
            itemname2.setText(itemlist.get(7));
            itemname3.setText(itemlist.get(10));
            price.setText("");
            price1.setText("");
            price2.setText("");
            price3.setText("");
            itemdetail3.setText(itemlist.get(9));
            itemdetail2.setText(itemlist.get(6));
            itemdetail.setText(itemlist.get(0));
            itemdetail1.setText(itemlist.get(3));
        }
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
        background1 = new netbeanscomponents.background();
        item1panel = new javax.swing.JPanel();
        itempiclabel = new javax.swing.JLabel();
        itemname = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        itemdetail = new javax.swing.JLabel();
        itemdetailsbutton = new javax.swing.JButton();
        item2panel = new javax.swing.JPanel();
        itempiclabel1 = new javax.swing.JLabel();
        itemname1 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        itemdetail1 = new javax.swing.JLabel();
        itemdetailsbutton4 = new javax.swing.JButton();
        item3panel = new javax.swing.JPanel();
        itempiclabel2 = new javax.swing.JLabel();
        itemname2 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        itemdetail2 = new javax.swing.JLabel();
        itemdetailsbutton5 = new javax.swing.JButton();
        item4panel = new javax.swing.JPanel();
        itempiclabel3 = new javax.swing.JLabel();
        itemname3 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        itemdetail3 = new javax.swing.JLabel();
        itemdetailsbutton6 = new javax.swing.JButton();
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

        item1panel.setBorder(new javax.swing.border.MatteBorder(null));
        item1panel.setOpaque(false);

        itempiclabel.setText("dsadsa");
        itempiclabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        itemname.setBackground(new java.awt.Color(255, 255, 255));
        itemname.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        itemname.setForeground(new java.awt.Color(51, 51, 51));
        itemname.setText("blablabla");
        itemname.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        price.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        price.setText("£24");

        itemdetail.setBackground(new java.awt.Color(255, 255, 255));
        itemdetail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemdetail.setText("Item Details:");
        itemdetail.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        itemdetailsbutton.setBackground(new java.awt.Color(255, 255, 153));
        itemdetailsbutton.setForeground(new java.awt.Color(255, 255, 255));
        itemdetailsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/Godetailsbutton.png"))); // NOI18N
        itemdetailsbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        itemdetailsbutton.setOpaque(false);
        itemdetailsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdetailsbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout item1panelLayout = new javax.swing.GroupLayout(item1panel);
        item1panel.setLayout(item1panelLayout);
        item1panelLayout.setHorizontalGroup(
            item1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itempiclabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(itemdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(itemdetailsbutton)
                .addContainerGap())
        );
        item1panelLayout.setVerticalGroup(
            item1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itempiclabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(item1panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(item1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(item1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(itemdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(item1panelLayout.createSequentialGroup()
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(item1panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(itemdetailsbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        item2panel.setBorder(new javax.swing.border.MatteBorder(null));
        item2panel.setOpaque(false);

        itempiclabel1.setText("dsadsa");
        itempiclabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        itemname1.setBackground(new java.awt.Color(255, 255, 255));
        itemname1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        itemname1.setForeground(new java.awt.Color(51, 51, 51));
        itemname1.setText("blablabla");
        itemname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        price1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        price1.setText("£24");

        itemdetail1.setBackground(new java.awt.Color(255, 255, 255));
        itemdetail1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemdetail1.setText("Item Details:");
        itemdetail1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        itemdetailsbutton4.setBackground(new java.awt.Color(255, 255, 153));
        itemdetailsbutton4.setForeground(new java.awt.Color(255, 255, 255));
        itemdetailsbutton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/Godetailsbutton.png"))); // NOI18N
        itemdetailsbutton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        itemdetailsbutton4.setOpaque(false);
        itemdetailsbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdetailsbutton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout item2panelLayout = new javax.swing.GroupLayout(item2panel);
        item2panel.setLayout(item2panelLayout);
        item2panelLayout.setHorizontalGroup(
            item2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item2panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itempiclabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemname1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(itemdetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(itemdetailsbutton4)
                .addContainerGap())
        );
        item2panelLayout.setVerticalGroup(
            item2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item2panelLayout.createSequentialGroup()
                .addComponent(itempiclabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(item2panelLayout.createSequentialGroup()
                .addGroup(item2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item2panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(itemdetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(item2panelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(item2panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(itemdetailsbutton4))
                    .addComponent(itemname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        item3panel.setBorder(new javax.swing.border.MatteBorder(null));
        item3panel.setOpaque(false);

        itempiclabel2.setText("dsadsa");
        itempiclabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        itemname2.setBackground(new java.awt.Color(255, 255, 255));
        itemname2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        itemname2.setForeground(new java.awt.Color(51, 51, 51));
        itemname2.setText("blablabla");
        itemname2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        price2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        price2.setText("£24");

        itemdetail2.setBackground(new java.awt.Color(255, 255, 255));
        itemdetail2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemdetail2.setText("Item Details:");
        itemdetail2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        itemdetailsbutton5.setBackground(new java.awt.Color(255, 255, 153));
        itemdetailsbutton5.setForeground(new java.awt.Color(255, 255, 255));
        itemdetailsbutton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/Godetailsbutton.png"))); // NOI18N
        itemdetailsbutton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        itemdetailsbutton5.setOpaque(false);
        itemdetailsbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdetailsbutton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout item3panelLayout = new javax.swing.GroupLayout(item3panel);
        item3panel.setLayout(item3panelLayout);
        item3panelLayout.setHorizontalGroup(
            item3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item3panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itempiclabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemname2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(itemdetail2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(itemdetailsbutton5)
                .addContainerGap())
        );
        item3panelLayout.setVerticalGroup(
            item3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item3panelLayout.createSequentialGroup()
                .addComponent(itempiclabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(item3panelLayout.createSequentialGroup()
                .addGroup(item3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemdetail2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(item3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(item3panelLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(itemname2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(item3panelLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(item3panelLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(itemdetailsbutton5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        item4panel.setBorder(new javax.swing.border.MatteBorder(null));
        item4panel.setOpaque(false);

        itempiclabel3.setText("dsadsa");
        itempiclabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        itemname3.setBackground(new java.awt.Color(255, 255, 255));
        itemname3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        itemname3.setForeground(new java.awt.Color(51, 51, 51));
        itemname3.setText("blablabla");
        itemname3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        price3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        price3.setText("£24");

        itemdetail3.setBackground(new java.awt.Color(255, 255, 255));
        itemdetail3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemdetail3.setText("Item Details:");
        itemdetail3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        itemdetailsbutton6.setBackground(new java.awt.Color(255, 255, 153));
        itemdetailsbutton6.setForeground(new java.awt.Color(255, 255, 255));
        itemdetailsbutton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/Godetailsbutton.png"))); // NOI18N
        itemdetailsbutton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        itemdetailsbutton6.setOpaque(false);
        itemdetailsbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdetailsbutton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout item4panelLayout = new javax.swing.GroupLayout(item4panel);
        item4panel.setLayout(item4panelLayout);
        item4panelLayout.setHorizontalGroup(
            item4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item4panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itempiclabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(itemname3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(itemdetail3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(itemdetailsbutton6)
                .addContainerGap())
        );
        item4panelLayout.setVerticalGroup(
            item4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item4panelLayout.createSequentialGroup()
                .addGroup(item4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item4panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(item4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itempiclabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(item4panelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(item4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itemname3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemdetail3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(item4panelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(item4panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(itemdetailsbutton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item2panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item4panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(535, 535, 535)
                        .addComponent(additembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(messagebutton)
                        .addGap(0, 0, 0)
                        .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(backbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(additembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messagebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(item1panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(item2panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(item3panel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(item4panel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       PersonalProfilePage personal = new PersonalProfilePage();
       
       personal.setPage(page);
       personal.setUser(user);
       personal.paintPage();
       personal.setVisible(true);
    }//GEN-LAST:event_profilemenuActionPerformed

    private void logoutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutmenuActionPerformed
        // TODO add your handling code here:
        infoBox("Successfully logged out" , "logout" );
        this.hide();
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
    }//GEN-LAST:event_logoutmenuActionPerformed

    private void itemdetailsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdetailsbuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        ItemDetailsPage details = new ItemDetailsPage();
        details.setUser(user);
        details.setItemname(itemname.getText());
        details.setItemPic(itemlist.get(3));
        details.setDetails(itemdetail.getText());
        details.setItemPrice(price.getText());
        details.setCheck(issale);
        details.setPage(page);
        
        
        details.paintPage();
        details.setVisible(true);
    }//GEN-LAST:event_itemdetailsbuttonActionPerformed

    private void itemdetailsbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdetailsbutton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ItemDetailsPage details = new ItemDetailsPage();
        details.setUser(user);
        details.setItemname(itemname1.getText());
        details.setItemPic(itemlist.get(7));
        details.setDetails(itemdetail1.getText());
        details.setItemPrice(price1.getText());
        details.setCheck(issale);
        details.setPage(page);
        
        
        details.paintPage();
        details.setVisible(true);
    }//GEN-LAST:event_itemdetailsbutton4ActionPerformed

    private void itemdetailsbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdetailsbutton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ItemDetailsPage details = new ItemDetailsPage();
        details.setUser(user);
        details.setItemname(itemname2.getText());
        details.setItemPic(itemlist.get(11));
        details.setDetails(itemdetail2.getText());
        details.setItemPrice(price2.getText());
        details.setCheck(issale);
        details.setPage(page);
        
        
        details.paintPage();
        details.setVisible(true);
    }//GEN-LAST:event_itemdetailsbutton5ActionPerformed

    private void itemdetailsbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdetailsbutton6ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ItemDetailsPage details = new ItemDetailsPage();
        details.setUser(user);
        details.setItemname(itemname3.getText());
        details.setItemPic(itemlist.get(15));
        details.setDetails(itemdetail3.getText());
        details.setItemPrice(price3.getText());
        details.setCheck(issale);
        details.setPage(page);
        
        
        details.paintPage();
        details.setVisible(true);
    }//GEN-LAST:event_itemdetailsbutton6ActionPerformed

    private void additembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additembuttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        UploadScreen upload = new UploadScreen();
        upload.setVisible(true);
        upload.setPage(page);
        upload.setUser(user);
    }//GEN-LAST:event_additembuttonActionPerformed

    private void messagebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagebuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        MessagePage message = new MessagePage();
       
        message.setPage(page);
        message.setUser(user);
        message.paintPage();
         message.setVisible(true);
        
    }//GEN-LAST:event_messagebuttonActionPerformed

    private void logobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logobuttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        MainPagePersonal personal = new MainPagePersonal();
        personal.setVisible(true);
        personal.setPage(page);
        personal.setUser(user);
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
            java.util.logging.Logger.getLogger(FilteredBuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilteredBuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilteredBuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilteredBuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilteredBuyScreen().setVisible(true);
            }
        });
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static String user;
    public static int page = 8;
    public static int previous;
    public static int item1, item2, item3, item4;
    public static void setUser(String username){
        user = username;
    }
    public static void setPage(int pagenum){
        previous = pagenum;
    }
    public static void setList(ArrayList<String> a) {
        itemlist = a;
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
            donaScreenCorp.setUser(user);
            donaScreenCorp.paintPage();
            donaScreenCorp.setVisible(true);
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
            wishListList.setUser(user);
            wishListList.paintPage();
            wishListList.setVisible(true);
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
    private javax.swing.JButton additembutton;
    private javax.swing.JButton backbutton;
    private netbeanscomponents.background background1;
    private javax.swing.JPanel item1panel;
    private javax.swing.JPanel item2panel;
    private javax.swing.JPanel item3panel;
    private javax.swing.JPanel item4panel;
    private javax.swing.JLabel itemdetail;
    private javax.swing.JLabel itemdetail1;
    private javax.swing.JLabel itemdetail2;
    private javax.swing.JLabel itemdetail3;
    private javax.swing.JButton itemdetailsbutton;
    private javax.swing.JButton itemdetailsbutton4;
    private javax.swing.JButton itemdetailsbutton5;
    private javax.swing.JButton itemdetailsbutton6;
    private javax.swing.JLabel itemname;
    private javax.swing.JLabel itemname1;
    private javax.swing.JLabel itemname2;
    private javax.swing.JLabel itemname3;
    private javax.swing.JLabel itempiclabel;
    private javax.swing.JLabel itempiclabel1;
    private javax.swing.JLabel itempiclabel2;
    private javax.swing.JLabel itempiclabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton messagebutton;
    private javax.swing.JLabel price;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    // End of variables declaration//GEN-END:variables
}
