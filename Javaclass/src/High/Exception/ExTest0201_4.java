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
public class ExTest0201_4 {

    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() throws IOException{
        try {
            System.in.read();
        } catch (IOException ex) {
            System.out.println("test IOException");
           throw ex;//把這顆球 繼續往外通報 往外面丟出去 錯誤的通報機制!
           //也可以自己手動產生 你要的型態的球
           
        }

    }
}
