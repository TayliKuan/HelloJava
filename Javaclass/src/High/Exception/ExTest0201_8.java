/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 小官
 */
class MyException extends Exception{//自訂自己的例外

}
        
public class ExTest0201_8 {
    
    public static void myTest()throws MyException{
    throw new MyException();
    }
    
    
    public static void main(String[] args) {
        try {
            myTest();
        } catch (MyException ex) {//只要是這個例外MyException 就這樣回答 這樣的概念
            System.out.println("您卡號輸入錯誤 再輸入一次");
        }
    }
}
