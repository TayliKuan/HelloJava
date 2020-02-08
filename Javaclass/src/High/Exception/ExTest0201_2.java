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
public class ExTest0201_2 {

    public static void main(String[] args) {
        ExceptionTest2();
    }

    public static void ExceptionTest2() {//try catch正面處理
        int i = 1;
        System.out.println(1 / i);
        i--;
        try {
            int input = System.in.read();
            System.out.println(input);//讀出你輸入的值
            System.out.println(1 / i);
        } catch (IOException e) {//catch 可以前後對換
            System.out.println("IOException yes, ");
        } catch (ArithmeticException ee) {//java.lang.ArithmeticException 可略java.lang. 可以有多個catch
            System.out.println("ArithmeticException yes,");
            //有兩個catch的話如果要偷懶用 Exception(父類別)就好 那要擺在下面 嚴格得先篩選 這裡的ArithmeticException 可改Exception可 但IO就會噴錯 因為Exception包含到ArithmeticException了
        } finally {
            System.out.println("finally yes, ");
        }
    }
}
