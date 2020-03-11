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

class Mythread extends Thread {

    Socket myScoket;

    public Mythread(Socket s) {
        myScoket = s;
    }
    //在server弄一個list 放socket 在廣發訊息 socket可以input/ output
    //丟檔案 雙向 先試看看
    @Override
    public void run() {
        super.run();

        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(myScoket.getInputStream()));
            PrintWriter pw = new PrintWriter(myScoket.getOutputStream());
            while (true) {
                String data = in.readLine();
                if (data == null || data.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println("request >" + data);
                System.out.println(" response > " + new StringBuffer(data).reverse().toString());
                pw.println(new StringBuffer(data).reverse().toString());

                pw.flush();
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

public class TestThreadSV {

    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(80);) {
            System.out.println(" 80 incoming...");
            while (true) {
                Socket s = ss.accept();//連線成功 拿到Socket 
                new Mythread(s).start();//轉給thread
                System.out.println("incoming client");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
