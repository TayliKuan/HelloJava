/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Net;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class MyClient {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 80);//客人立刻過去就有結果 不用再等待連線了 拿到Socket就代表建立成功了 
            //localhost 127.0.0.1 主機
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            //傳送到server端的文字
            //thread.sleep(5000); 讓他睡五秒看看 會不會等
            System.out.println("request > hello socket");
            pw.println("hello socket");
            pw.flush();//一次過去
            //從server端讀取一行文字
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            String data = in.readLine(); // client send string "abc"
            System.out.println("response > " + data);
            //new StringBuffer(data).reverse().toString()     //"cba"
            in.close();
         } catch (IOException ex) {
            Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
