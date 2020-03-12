/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Net.test.TwoWay;

import Net.test.thread.*;
import Net.test.*;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ThreadPic extends Thread {

    Socket myScoket;
    public ThreadPic(Socket s) {//建構子傳入 Socket
        myScoket = s;
    }

    @Override
    public void run() {
        super.run();
       
        try {
            DataOutputStream out = new DataOutputStream(myScoket.getOutputStream());
            out.writeUTF("Server端說:- Hi~ Client");//UTF傳文字
            //讀Client端文字
            DataInputStream in = new DataInputStream(myScoket.getInputStream());
            System.out.println(in.readUTF());
            BufferedImage img = ImageIO.read(ImageIO.createImageInputStream(myScoket.getInputStream()));
            System.out.println("收到圖片!!!");

            //把圖片顯示在JFrame視窗
            JFrame jf = new JFrame("Show pic from client");
            jf.setBounds(0, 0, 300, 300);
            jf.setVisible(true);
            JLabel photo = new JLabel("receive");
            photo.setIcon(new ImageIcon(img));
            jf.add(photo);
            jf.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            in.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreadPic.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

class TestWord extends Thread {

    Socket myScoket;
    public TestWord(Socket s) {//建構子傳入 Socket
        myScoket = s;
    }

    @Override
    public void run() {
        super.run();

        try {//文字
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
            Logger.getLogger(TestWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

public class ServerReceivePic2 {

    public static void main(String[] args) {

        
        try {
            //開放通道
            ServerSocket ss = new ServerSocket(80);
            while (true) {
                Socket s = ss.accept();//等待連接

                System.out.println("80 incoming 這裡是Server端");
                DataInputStream test = new DataInputStream(s.getInputStream());
                String sentLine = test.readUTF();//讀文字
                // 在這裡加一個判斷 如果是看送甚麼 就到對應的Thread
                if (sentLine.equals("sentWord")) {
                    new TestWord(s).start();//轉手給Thread
                    System.out.println("get scoket in thread(word)");
                } else if (sentLine.equals("sentPic")) {
                    new ThreadPic(s).start();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerReceivePic2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
