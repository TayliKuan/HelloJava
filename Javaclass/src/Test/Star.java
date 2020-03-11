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
//          String[] star = new String[10];
//    for (int i = 1; i <= star.length; i++) {
//      for (int j = star.length; j > i; j--) {
//        System.out.print("*");
//      }
//      for (int k = 1; k < i * 2; k++) {
//        System.out.print(" ");
//      }
//      System.out.println();
//    }
//    for (int i = star.length; i > 0; i--) {
//      for (int j = star.length; j > i; j--) {
//        System.out.print("*");
//      }
//      for (int k = 1; k < i * 2; k++) {
//        System.out.print(" ");
//      }
//      System.out.println();
//    }
//  }
//}
        String[] star = new String[20];
        for (int k = 0; k < star.length; k++) {//行
            for (int a = 0; a < star.length/2; a++) {
                star[a]="  ";
                 System.out.print(star[a]);
            }
 
            for (int i = star.length-1; i>0; i--) {//列
                star[i] = "* ";
                System.out.print(star[i]);
            }
           
            System.out.println();
        }
        }
    }

//    for (int k = 1; k>0 && k < 3;k++) {
//        if(k%2==1){  
//            for (int i = 10; i>0&&i < 11; i--) {
//                for (int j = 1; j < i; j++) {
//                    System.out.print("* ");
//                }
//                 System.out.println("* ");
//            }
//        }
//        else if(k%2==0){
//            for (int i = 1; i< 11; i++) {
//                for (int j = 1; j < i; j++) {
//                    System.out.print("* ");
//                }
//                 System.out.println("* ");
//                }
//            }
//        }
    

