/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day0314;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class ThreadBook implements Runnable {

    private File file;
    private String getLink;

    public ThreadBook(File file, String getLink) {
        this.file = file;
        this.getLink = getLink;
    }

    @Override
    public void run() {
        
        URL myURL;
        try {
            myURL = new URL(getLink);
            HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
            InputStream is = conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(file);

            int length=0;//總資料大小
            byte[] b = new byte[4096*5];
            while ((length = is.read(b)) != -1) {
                fos.write(b, 0, length);
                fos.flush();
            }
            fos.close();
            is.close();
            //拿到Thread名字
            String threadNum = Thread.currentThread().getName();
            System.out.println("第"+threadNum+"張"+"圖片已下載");
        } catch (Exception ex) {
            Logger.getLogger(TestBookMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
