/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Exception;

import java.io.File;

/**
 *
 * @author 小官
 */
public class ExTest0201_6 {
    public static void main(String[] args) {
        File f = new File("D:\\123test");
        printAllPath(f);
    }
    public static void printAllPath(File f){
        
        for (File f1 :f.listFiles() ) {
            System.out.println(f1.getName());
        }
    }
}
