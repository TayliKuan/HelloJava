/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class TestP {
    
    public static void main(String[] args) {
        System.out.println("你好");
        
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "kaun1203")) {
            
            System.out.println("connect ok");
            Statement st = conn.createStatement();
            int rs = st.executeUpdate("INSERT INTO public.\"user\"\n"
                    + "(\"name\", char, age, creatdate, phone)\n"
                    + "VALUES('', '', 0, now(), '');");
        

        } catch (SQLException ex) {
            Logger.getLogger(TestP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
