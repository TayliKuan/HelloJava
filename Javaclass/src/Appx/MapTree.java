/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appx;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 小官
 */
public class MapTree {
    public static void main(String[] args) {
        System.out.println("Collections");
        
        Map <String , String> map = new TreeMap();
        map.put("Hello", "Hello");//前面是KEY 後面是VALUE  通常都用這個值本身的HASCODE當作KEY 不一樣也可
        map.put("Hello2", "Hello3");
        map.put("123", "123");
        map.put("321", "321");
        map.put("abc", "abc");
        
        System.out.println(">>" + map.size());
        System.out.println(map);
        //拿資料出來GET
        Object obj = map.get("Hello");
        System.out.println("obj = " + obj);

        String str = (String) obj;
        System.out.println("str.length = " + str.length());
        //key也是剛好不能重複 所以用這特性 可以SET他的值
        Iterator it = map.keySet().iterator();//一個一個走過
        while (it.hasNext()) {
            Object key = it.next();//拿到資料丟回去 並把游標往下一個指
            Object value = map.get(key);
            System.out.println(">key:" + key + ",value:" + value);
        }
    }

}
