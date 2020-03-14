/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day0314;

import java.io.BufferedReader;
import java.io.File;
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
public class TestBook {
    public static void main(String[] args) throws IOException  {

        String Final = null;
        try {//https://www.tohomh123.com/yinghuo/1.html //編號0001開始 會少最後一張
            URL url = new URL("https://www.tohomh123.com/duziyirendeyishijiegonglve/13.html");
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
        int aa = Final.indexOf("var pl");
        int bb = Final.indexOf("var bqimg");
       // System.out.println(Final.substring(aa, bb));
        String link = Final.substring(aa, bb);
        //精準拿到圖片位置
        int c = link.indexOf("h");
        int d = link.lastIndexOf("/");
        //System.out.println(link.substring(c, d));
        String PicLink = link.substring(c, d);
        
        int e = Final.indexOf("var pcount = ");
        int f = Final.indexOf("var finished");
       // System.out.println(Final.substring(e, f));
        String countNum = Final.substring(e, f);
        //得到頁數
        int g = countNum.lastIndexOf("= ");//為了可以統一取得位置
        int h = countNum.indexOf(";");
        //System.out.println(countNum.substring(g+2, h));
        int count = Integer.parseInt(countNum.substring(g+2, h));
        //System.out.println(count);
        
        int t = Final.indexOf("<title>");
        int w = Final.indexOf("</title>");
        //System.out.println(Final.substring(t, w)); 
        String book = (Final.substring(t, w));
        
        int x = book.indexOf(">");
        int y = book.indexOf("在");
        //System.out.println(book.substring(x+1, y-1));
        String bookName =  book.substring(x+1, y-1);
        
        File dir = new File("D:\\"+bookName);
        if (!dir.exists()) {
            dir.mkdir();
        }
        
        int i;
        for (i = 1; i < count; i++) {
	   
          String getLink = PicLink+"/"+String.format("%04d", i)+".jpg";
          //System.out.println(getLink);
        //建一個資料夾 放圖片
        
        File file = new File(dir, i+".jpg");

        URL myURL;
        
        try {
            myURL = new URL(getLink);
            HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
            InputStream is = conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(file);

            int length=0;
            byte[] b = new byte[4096*5];
            while ((length = is.read(b)) != -1) {
                fos.write(b, 0, length);
                fos.flush();
            }
            fos.close();
            is.close();
            System.out.println("第"+i+"張"+"圖片已下載");
        } catch (MalformedURLException ex) {
            Logger.getLogger(GetPic.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
        
        
}

}
