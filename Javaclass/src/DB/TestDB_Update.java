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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官 設定改時間 // JAVA 不用這麼麻煩 JDBC要針對每一個資料庫語法 不同而不同
 */
public class TestDB_Update {
    public static void main(String[] args) {
        System.out.println("你好");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://45.56.120.21:3306/orangeV2", "tofranklu", "1qaz@WSX");) {

            //System.out.println("connect ok");
            Statement st = conn.createStatement();
            
            int result = st.executeUpdate("update campaign_config set end_time = '"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"'where id =110");
            //2020-02-29 15:43:48
            //HH 是24小時製的
            //new Date().toLocaleString()
            System.out.println("connect ok " + result);
        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
