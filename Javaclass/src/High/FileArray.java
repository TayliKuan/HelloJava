/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author 小官
 */
public class FileArray {
    private static void sortAll(String dirName) {
        File directory = new File(dirName);
        File[] filesArray = directory.listFiles();
        //sort all files
        Arrays.sort(filesArray);
        //print the sorted values
        for (File file : filesArray) {
            if (file.isFile()) {
                System.out.println("File : " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("Directory : " + file.getName());
            } else {
                System.out.println("Unknown : " + file.getName());
            }
        }
    }
    public static void main(String[] args) {
        sortAll("C:\\java");
    }



}
