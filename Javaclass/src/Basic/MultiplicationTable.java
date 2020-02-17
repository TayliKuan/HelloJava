package Basic;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 小官
 */
public class MultiplicationTable {
    public static void main(String[] args) {
//        for(int a=1;a<10;a++)
//        for(int b=1;b<10;b++)
//            if(a*b<10){
//                System.out.print(a+"x"+b+" ="+a*b+" ");}
//            else{
//                System.out.print(a+"x"+b+"="+a*b+" ");}
//        System.out.print("\n");
//    }
for (int i = 1; i < 10; i++) { 
            for (int j = 1; j < 10; j++) {
                if(i*j<10){//對齊
                    System.out.print(i + "*" + j +"= "+ i*j+" ");
                }else{
                    System.out.print(i + "*" + j +"="+ i*j+" ");
                }
            }
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        ex.printStackTrace();
    }
        System.out.println("");
        }
        
}}

//public class MultiplicationTable {
//    public static void main(String[] args) {
//        int c=1,d=1;
//while(c<10) 
//  c++;
//  d++;
//    System.out.println(c+"*"+d+"="+c*d);
//      
//    }
//}