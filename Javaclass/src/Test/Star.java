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
public class Star {
    public static void main(String[] args) {
//        for (int i = 10; i>0&&i < 11; i--) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//             System.out.println("*");
//        }
//        for (int i = 1; i< 11; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//             System.out.println("*");
//        }
    for (int k = 1; k>0 && k < 3;k++) {
        if(k%2==1){  
            for (int i = 10; i>0&&i < 11; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                 System.out.println("*");
            }
        }
        else if(k%2==0){
            for (int i = 1; i< 11; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                 System.out.println("*");
                }
            }
        }
    }
}
    

