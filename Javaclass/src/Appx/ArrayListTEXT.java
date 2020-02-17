/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appx;

import java.util.ArrayList;
import java.util.List;
//import java.util.List;

/**
 *
 * @author 小官
 */
public class ArrayListTEXT {
    public static void main(String[] args) {
        System.out.println("Collections");
        
        ArrayList ay=new ArrayList();//資料未定長度 可以用
        System.out.println(">>"+ay.size());
        //如果用object收資料 那要改成字串要轉型
        ay.add("Hello");
        ay.add("java");
        ay.add("java");
        ay.add(1);
        ay.add('a');
        ay.add(3.14);
        
        for (int i = 0; i < ay.size(); i++) {
            Object obj = ay.get(i);//位置0
        System.out.println("obj "+i+"="+obj);
        String str = (String)obj;
        System.out.println("str.length>>"+str.length());
        }
        System.out.println(">>"+ay.indexOf("Hello"));
        System.out.println(">>"+ay.indexOf("Hello2"));
        System.out.println(">>"+ay.indexOf("java"));
        System.out.println(">>"+ay.lastIndexOf("java"));

        
        //        Object obj0 = ay.get(0);//位置0
//        System.out.println("obj 0>>"+obj0);
//        String str = (String)obj0;
//        System.out.println("str.length>>"+str.length());
//        Object obj1 = ay.get(1);
//        System.out.println("obj 1>>"+obj1);
//        System.out.println(">>"+ay.size());

        ArrayList<String> ay2 = new ArrayList<String>();//<>泛型 寫甚麼型態就要完全一樣 就算是寫<Mypoint>也只能丟Mypoint 他的子類別也不行
        ay2.add("aaa");
        String sss = ay2.get(0);
        ArrayList<String> ay3 = new ArrayList();//右邊不寫沒關西 因為一定要跟左邊一樣
        List<String> ay4 = new ArrayList<>(); //父類別List的參考點 指向子類別的物件ArrayList      

}
}