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
public class ExTest0201_1 {

    public static void ExceptionTest(){
    int i =1;
        System.out.println(1/i);
        i--;
        //System.out.println(1/i);//變數會變!!! Exception in thread "main" java.lang.ArithmeticException: / by zero
        try {
            System.out.println("Hello");//有一定要被執行 不要放在可能會錯的後面 不然可能就會跳開沒執行到
            System.out.println(1/i);//有出錯才會進到catch 會丟給jre 一包回傳錯誤
        } catch (ArithmeticException ee) {//java.lang.ArithmeticException 可略java.lang. 可以有多個catch
            System.out.println("ArithmeticException yes,");
            ee.printStackTrace();//把每個錯都寫出來 但程式可以繼續執行AA 一樣有軌跡
//            System.out.println("Msg>>"+ee.getMessage());
//            for(StackTraceElement element: ee.getStackTrace()){//用for迴圈跑出 檔名 跟哪一行
//                System.out.println("element name>>"+element.getClassName()+"\telement line>>"+element.getLineNumber());
//            }
        } finally{//不管怎樣都會執行 就算try沒錯
            System.out.println("finally yes, ");
        }
        try {
            int input = System.in.read();
            System.out.println(input);//讀出你輸入的值
        } catch (IOException e) {
            e.printStackTrace();       
        }
            //23行的出錯來自59行的呼叫
            //sout 出現 element name>>Appx.ExTest0201	element line>>23  真正出錯的那行
            //element name>>Appx.ExTest0201	element line>>59
    }
    public static void main(String[] args) {
        int [] data = {1,2,3,4,5};
        System.out.println(data[0]);
        System.out.println(data[1]);
       // System.out.println(data[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        System.out.println(1f/2);
        System.out.println(1.0/2);
        System.out.println(1/2);
        //System.out.println(1/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero

        String str = "Hello";
        System.out.println(str.length());
        str = "";
        System.out.println(str.length());//會是0 因為空字串!
        str = null;//沒有指向任何內容
        //System.out.println(str.length());//Exception in thread "main" java.lang.NullPointerException //很常見
        
        ExceptionTest();
    }
}
