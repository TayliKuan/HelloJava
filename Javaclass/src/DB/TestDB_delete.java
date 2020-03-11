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
public class TestDB_delete {

    public static void main(String[] args) {
        System.out.println("你好");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://45.56.120.21:3306/orangeV2", "tofranklu", "1qaz@WSX");) {

            //System.out.println("connect ok");
            Statement st = conn.createStatement();

            int result = st.executeUpdate("delete from campaign_config where id <=100");
            System.out.println("connect ok " + result);
        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
