/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High;

import High.Exception.ExTest0201_6;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.chrono.MinguoDate;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JTree;

/**
 *
 * @author 小官
 */
public class FileTest {

//static SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
    static SimpleDateFormat sdf = new SimpleDateFormat("y");//設定格式 只要西元年
    static String date = sdf.format(new Date()); //new出 年
    static int TaiwanYear = Integer.valueOf(date) - 1911;//-1911得到 民國年
    static SimpleDateFormat monthDay = new SimpleDateFormat("MM-dd,h:mm:ss,EEE a");//月份格式
    static int fileCount = 0; // 累計檔案數

    public static void main(String[] args) {
    File f = new File("C:\\java");
       
//        System.out.println(f.getName());//String
//        System.out.println(f.getParent());//String
//        System.out.println(f.getParentFile());//file
//        System.out.println(f.getAbsoluteFile());//file
//        System.out.println(f.getAbsolutePath());//String
//        System.out.println(f.getPath());//String
//        System.out.println(f.lastModified());
//        System.out.println(f.listFiles());
        printAllPathTest(f);
        System.out.println("fileCount = " + fileCount);
    }

    public static void printAllPathTest(File f) {
        if (f.listFiles().length != 0) {
            System.out.println(f.getPath());
            for (File A : f.listFiles()) {
                System.out.println(A.getName() + " 最後修改時間: " + TaiwanYear + "-" + monthDay.format(A.lastModified()));//用民國年+月份格式
                fileCount++;
            }
            System.out.println("--------");
            for (File A : f.listFiles()) {// 每一個檔案及資料夾
                if (A.isDirectory()) {// 檢查是否為目錄 是的話印出
                    printAllPathTest(A);// 若為目錄再去列出所有檔案 摳自己
                }
            }
        }

    }
}
