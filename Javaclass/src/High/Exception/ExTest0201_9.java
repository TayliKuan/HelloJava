/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
public class ExTest0201_9 {
//古早的寫法
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("D:\\123test/456.txt"));
            String s;

            for (; (s = in.readLine()) != null;) {
                System.out.println(">>" + s);
            }

        } catch (IOException ex) {
            System.out.println("no");
            ex.printStackTrace();
        } finally {
            try {
                in.close();//寫在finally 才是對的  因為寫在上面如果錯 close執行不到 但又有變數問題 又要往上拉一層 7.0之前
            } catch (IOException ex) {
                Logger.getLogger(ExTest0201_9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
