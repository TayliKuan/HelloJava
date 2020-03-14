/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day0314;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class GetPic {

    public static void main(String[] args) throws IOException  {
//http://desk.zol.com.cn/bizhi/8661_106819_2.html
        String Final = null;
        try {
            URL url = new URL("http://desk.zol.com.cn/bizhi/8661_106820_2.html");;//http決定了你是誰 再轉回來
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            StringBuilder sb = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));) {
                String nextLine = "";
                while ((nextLine = reader.readLine()) != null) {
                    sb.append(nextLine + "\n");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(sb.toString());
            Final = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //大範圍擷取 網址段落
        int aa = Final.indexOf("nowPicSrc");
        int bb = Final.indexOf("recDownUr");
        System.out.println(Final.substring(aa, bb));
        String link = Final.substring(aa, bb);
        //精準拿到圖片位置
        int c = link.indexOf("h");
        int d = link.lastIndexOf("\"");
        System.out.println(link.substring(c, d));
        String PicLink = link.substring(c, d);
        //建一個資料夾 放圖片
        File dir = new File("D:\\PicTest");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, "Paris.jpg");

        URL myURL;
        
        try {
            myURL = new URL(PicLink);
            HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
            InputStream is = conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(file);

            int length=0;
            byte[] b = new byte[4096];
            while ((length = is.read(b)) != -1) {
                fos.write(b, 0, length);
                fos.flush();
            }
            fos.close();
            is.close();
            System.out.println("圖片已下載");
        } catch (MalformedURLException ex) {
            Logger.getLogger(GetPic.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
