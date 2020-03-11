/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Net.test;

import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 小官
 */
public class ServerReceivePic {

    public static void main(String[] args) {
        try {
            //開放通道
            ServerSocket ss = new ServerSocket(80);
            //等待連接
            Socket s = ss.accept();
            System.out.println("80 incoming 這裡是Server端");
            //跟連上的Client打招呼
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeUTF("Server端說:- Hi~ Client");//UTF傳文字
            //讀Client端文字
            DataInputStream in = new DataInputStream(s.getInputStream());
            System.out.println(in.readUTF());
            BufferedImage img = ImageIO.read(ImageIO.createImageInputStream(s.getInputStream()));
            System.out.println("收到圖片!!!");

            //把圖片顯示在JFrame視窗
            JFrame jf = new JFrame("Show pic from client");
            jf.setBounds(100, 100, 800, 800);
            jf.setVisible(true);
            JLabel photo = new JLabel("Earth");
            photo.setIcon(new ImageIcon(img));
            jf.add(photo);
            s.close();
            ss.close();
            in.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
