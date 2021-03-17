/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetest;

import java.sql.SQLException;

/**
 *
 * @author CI
 */
public class DatabaseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        DBConnector d = new DBConnector();
        d.createCorporationUser("slp_bilkent", "İstanbul", "Bayrampaşa","SLP","12f4","selepe@",
                "Bilkent Üni G Bina","4485939","image_s","Thank you for your donations! Children will be happy");
    }
    
}
