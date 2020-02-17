/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High;

import java.io.File;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author 小官
 */
public class FileSlow {

    public static void main(String[] args) {
        print();

    }

    public static void print() {
        File folder = new File("C:\\java");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());

            }
            
        }
    }
}
