/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Exception;

import java.io.IOException;

/**
 *
 * @author 小官
 */
public class ExTest0201_3 {
    //可以用try處理好
    public static void main(String[] args) {
        try {
             myText();
        } catch (Exception e) {
        }

    }
    // 或是再一起往外丟
//    public static void main(String[] args)throws IOException {
//        myText();
//    }
    public static void myText()throws IOException{//不正面處裡 在一起往外丟
    System.in.read();
    }
}
