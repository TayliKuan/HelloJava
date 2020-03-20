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




public class TestBookMain {
    
    public static void main(String[] args) throws IOException  {

        String Final = null;
        try {//https://www.tohomh123.com/yinghuo/1.html //編號0000開始 會少第一張 
            //此網站有些 0000開始 有些0001開始
            URL url = new URL("https://www.tohomh123.com/paiqiushaonian/374.html");
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
        //拿到圖片網址
        int aa = Final.indexOf("var pl");
        int bb = Final.indexOf("var bqimg");
        System.out.println(Final.substring(aa+10, bb-16));
        String PicLink = Final.substring(aa+10, bb-16);
        
        //拿到頁數
        int e = Final.indexOf("var pcount = ");
        int f = Final.indexOf("var finished");
        int count = Integer.parseInt(Final.substring(e+13, e+15));

        //拿到書名
        int t = Final.indexOf("<title>");
        int w = Final.indexOf("</title>");
        String bookName = (Final.substring(t+7, w-12));
       
        
        File dir = new File("D:\\"+bookName);
        if (!dir.exists()) {
            dir.mkdir();
        }
        
        int i;
        for (i = 1; i < count; i++) {
	   
        String getLink = PicLink+"/"+String.format("%04d", i)+".jpg";
        //建一個資料夾 放圖片
        File file = new File(dir, i+".jpg");
        //Thread
        Thread thread = new Thread(new ThreadBook(file, getLink));
        thread.start();
        //設定名字
        thread.setName(String.valueOf(i));
   }    
}
}
