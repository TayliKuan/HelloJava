/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author 小官
 */
public class ReplaceTest {
//
 public static void replaceJ(String text) {
text=text.replace ('j', 'l');
     System.out.println(text);
 }

 public static void main(String args[]) {
 String text2 = new String ("java");
    //System.out.println(text2);
     replaceJ(text2);
   }
}
