/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 小官
 */
public class ExTest0201_7 {

    //讀檔寫法 用完要記得關閉
    public static void main(String[] args) throws FileNotFoundException {

        try {
            BufferedReader in = new BufferedReader(new FileReader("D:\\123test/456.txt"));
            String s;
//            while ((s=in.readLine())!=null) {
//                System.out.println(">>"+s);
//            }
            for (; (s = in.readLine()) != null;) {
                System.out.println(">>" + s);
            }
            in.close();//寫在finally 才是對的 但又有變數問題 又要往上拉 以前的7 現在改了
            
            //寫檔 但會覆蓋掉 原本的 //或是直接再開一個檔寫新的!
            PrintWriter pw = new PrintWriter("D:\\123test/4568.txt");
            pw.println("hi hello java");
            pw.println("hi hello java2");
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("fnf");
            e.printStackTrace();
        } catch (IOException ex) {
            System.out.println("no");
            ex.printStackTrace();
        }
        
    }
}
