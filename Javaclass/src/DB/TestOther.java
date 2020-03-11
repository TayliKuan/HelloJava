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
public class TestOther {
     public static void main(String[] args) {
        System.out.println("你好");
        try (Connection conn = DriverManager.getConnection("jdbc:derby://192.168.1.214:1527/sample;user=app;password=app");){
        //離開try catch就會關掉conn了
            System.out.println("connect ok");
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM APP.CUSTOMER");
            System.out.println("----");
            while (rs.next()) {
                System.out.println("ID:= " + rs.getString("CUSTOMER_ID") + " ,CODE=" + rs.getString(2) + " ,Name=" + rs.getString("NAME"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
