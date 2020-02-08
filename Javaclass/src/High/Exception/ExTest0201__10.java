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


/**
 *
 * @author 小官
 */
class rException extends IOException implements AutoCloseable{//自訂自己的例外

    @Override
    public void close() throws IOException {
        System.out.println("hi here");//字串
    }

}
public class ExTest0201__10 {
    public static void main(String[] args) throws FileNotFoundException {
        
        try(//可以多行 但String不行 要有interface AutoClassable 要直接或間接實做過AutoClassable
                //只要一個class 有時做過 AutoClassable 就可 但因為字串本人沒有 在class裡面才可以
                rException r = new rException();//AutoClassable
                BufferedReader in = new BufferedReader(new FileReader("D:\\123test/456.txt"));) {
          //你產生的物件 之後要關閉的 放在()內 確保自動監控 在這用完就關閉 就不用in.close 一定會做到 jdk7之後的新功能
            String s;

            for (; (s = in.readLine()) != null;) {
                System.out.println(">>" + s);
            }

        } catch (IOException ex) {
            System.out.println("no");
            ex.printStackTrace();
        }
        finally{
            System.out.println("say hello");//可以加別的東西
        }
    }
}
