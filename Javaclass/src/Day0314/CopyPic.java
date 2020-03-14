/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day0314;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class CopyPic {

    public static void main(String[] args) {
        try {
            //File 是byte
            FileInputStream fis = new FileInputStream("D:/plane.png");//讀檔案進去
            //如果我有socket了
            FileOutputStream fos = new FileOutputStream("D:/plane2.png");//s.getOutputStream
            int i;
            try {
                while ((i = fis.read()) != -1) {
                    fos.write(i);
                }
                System.out.println("圖片複製成功!");
            } catch (IOException ex) {
                Logger.getLogger(CopyPic.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                fos.flush();
                fos.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(CopyPic.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopyPic.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
