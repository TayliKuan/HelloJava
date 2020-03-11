/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class MyServer {
    public static void main(String[] args) {
        /*
        ServerSocket ss;
        try {
            ss = new ServerSocket(80); //打開一個窗口 開張 0~65535,1000+較好
            System.out.println("Server listening at port 777...");
            Socket s = ss.accept(); //等待client 連線中 開門了 等待
            System.out.println("777 incoming");
            
           // 接下來會執行的話代表 連線已建立
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //從clinet端讀取一行文字
            String data = in.readLine();//client send string "abc"
            System.out.println("request>"+data);
            //new StringBuffer(data).reverse().toString() //"cba"
            //s.getOutputStream()
            PrintWriter pw = new PrintWriter(s.getOutputStream());//輸出用這個多 因為建構子選擇多
            //將輸入的文字 反轉回傳
            System.out.println("respnse>"+new StringBuffer(data).reverse().toString());//反轉
            pw.println(new StringBuffer(data).reverse().toString());//吐回去 我們要寫自己的小遊戲 如果要給瀏覽器 要照瀏覽去的格式
            //System.out.println(">>"+in.readLine());
           // System.out.println(">>"+in.readLine());

               
           
        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        //-----------
        ServerSocket ss;
        try {
            ss = new ServerSocket(80); // 0~65535, 1000+
            System.out.println("Server listening at port 80...");
            Socket s = ss.accept();     //等待client 連線中
            System.out.println(" 80 incoming...");
            //接下來會執行的話，代表連線已建立
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            //從client端讀取一行文字
            String data = in.readLine(); // client send string "abc"
//            System.out.println("request > " + data);
//            data = in.readLine(); // client send string "abc"
//            System.out.println("request > " + data);
//            data = in.readLine(); // client send string "abc"
//            System.out.println("request > " + data);
//            data = in.readLine(); // client send string "abc"
//            System.out.println("request > " + data);
//            data = in.readLine(); // client send string "abc"
//            System.out.println("request > " + data);
//            data = in.readLine(); // client send string "abc"
//            System.out.println("request > " + data);
//            data = in.readLine(); // client send string "abc"
//            System.out.println("request > " + data);
            //new StringBuffer(data).reverse().toString()     //"cba"
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            //將輸入的文字 反轉後回傳
            System.out.println(" response > " + new StringBuffer(data).reverse().toString());
            pw.println(new StringBuffer(data).reverse().toString());
//                pw.println("HTTP/1.1 200 OK");
//                pw.println("Date: Sun, 18 Oct 2009 08:56:53 GMT");
//                pw.println("Server: Apache/2.2.14 (Win32)");
//                pw.println("Last-Modified: Sat, 20 Nov 2004 07:16:26 GMT");
//                pw.println("ETag: 10000000565a5-2c-3e94b66c2e680");
//                pw.println("Accept-Ranges: bytes");
//                pw.println("Content-Length: 44");
//                pw.println("Connection: close");
//                pw.println("Content-Type: text/html");
//                pw.println("X-Pad: avoid browser bug");
//                pw.println();
//                pw.println("<html><body><h1>It works!</h1></body></html>");
                pw.flush();
                pw.close();
        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
