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
public class TestMySOL {
    public static void main(String[] args) {
        System.out.println("你好");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://45.56.120.21:3306/orangeV2","tofranklu","1qaz@WSX");){
//            try {
//                //離開try catch就會關掉conn了
//                Class.forName("com.mysql.jdbc.Driver"); //如果找不到driver 上網找進入點 確認你自己jar是有的這檔案的 明確指定 因為版本可能比較舊
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(TestMySOL.class.getName()).log(Level.SEVERE, null, ex);
//            }
            System.out.println("connect ok");
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT ID FROM campaign_config");
            System.out.println("----");
            while (rs.next()) {
                System.out.println("ID:= " + rs.getString(1) );
            }//+ " ,CODE=" + rs.getString(2) + " ,Name=" + rs.getString(3) 沒這欄位
        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
