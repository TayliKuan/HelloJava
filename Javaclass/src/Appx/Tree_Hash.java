/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import Appx.shape.MyPoint;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 小官
 */
public class Tree_Hash {
    public static void main(String[] args) {
        
        System.out.println("Collections");
        
        HashSet set = new HashSet();
        System.out.println(">>"+set.size());
        set.add(123);
        set.add("Hello");
        set.add("java");
        set.add(new MyPoint(1, 2));
        set.add(new MyPoint(1, 2));//重複了
        set.add("Hello");//重複了
        set.add("Java");
        
        System.out.println(">>"+set.size());
        printoutAll(set);
       
        ArrayList ay = new ArrayList();
        printoutAll(ay);
        
        //"123".equals("123");//字串 先比對一樣 再比對內容
        
        Set set2 = new TreeSet();//照ASCII排 都要一樣型態才可以排
        System.out.println(">>"+set2.size());
        set2.add("123");
        set2.add("Hello");
        set2.add("java");
        set2.add("Hello2");//重複了
        set2.add("Java");
        set2.add("Sunday");
//        set2.add(123);
//        set2.add(456);
        System.out.println(">>"+set2.size());
        printoutAll(set2);
        }
    //print out all elements
    
        public static void printoutAll(Collection cc){//型態不用太具體 如果只用hashset就不給list 用collection或是set更高階 更好 程式碼可以重複使用
            Iterator itor = cc.iterator();
            while (itor.hasNext()){
                System.out.println("Hello.printoutAll()>"+itor.next());
            }
    }

}
