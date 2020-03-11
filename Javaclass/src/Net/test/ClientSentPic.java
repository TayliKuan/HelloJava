/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Net.test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 小官
 */
public class ClientSentPic {

    public static void main(String[] args) {
        try {
            //連接Server
            Socket s = new Socket("localhost", 80);
            System.out.println("這裡是Client 已連接Server");
            //讀Server端文字
            DataInputStream in = new DataInputStream(s.getInputStream());
            System.out.println(in.readUTF());
            //跟Server打招呼
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeUTF("Client端說: HI~ Server");
            //先把照片讀進來
            BufferedImage img = ImageIO.read(new File("D:\\earth.png"));
            //Client傳圖片給Server端
            ImageIO.write(img, "JPG", s.getOutputStream());
            System.out.println("圖片寄送成功");

            s.close();
            in.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientSentPic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
