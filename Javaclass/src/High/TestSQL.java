/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;

/**
 *
 * @author 小官
 */
public class TestSQL {

    public static void main(String[] args) {
        System.out.println("你好");
        try {
            //建立連接
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;user=app;password=app");

            //這邊打帳號密碼 可以連線別人的 jdbc  1527是服務窗口
            System.out.println("connect ok");
            //產生Statement
            Statement st = conn.createStatement();//inpot java.sql
            //要查詢資料的指令
            ResultSet rs = st.executeQuery("SELECT * FROM APP.CUSTOMER");//inport java.sql
            System.out.println("----");
            //一筆一筆走 跟之前iterator一樣
            while (rs.next()) {//一筆一筆讀出來 next會幫你下一個 //資料庫從1開始 所以2就是2
                System.out.println("ID:= " + rs.getString("CUSTOMER_ID") + " ,CODE=" + rs.getString(2) + " ,Name=" + rs.getString("NAME"));
      //conn.close();放這可能執行不到 finally 又try catch 所以改用新的 看SQL2 往上層提
      //conn 關掉 st就會關掉 rs就會關掉
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
