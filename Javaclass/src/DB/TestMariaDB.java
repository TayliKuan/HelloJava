/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class TestMariaDB {
    public static void main(String[] args) {
         System.out.println("你好");
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://211.23.25.5:3306/appx","appx","Java@@2020");){

            System.out.println("connect ok");

        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

    

