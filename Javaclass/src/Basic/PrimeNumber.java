package Basic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 小官
 */

public class PrimeNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入數字判斷是否為質數");
        int a = sc.nextInt();//固定的
        int isDivided=1;//先假設大家是質數 一定要先給預設值
            for (int x=2; x<a/2; x++){//可以a在/2 因為不太可能會
                if (a%x ==0 ) {//條件完成 可以被整除 非質數
                isDivided=0;
                //break;用在swicth跟最近的迴圈for//break可以用因為有整除就跳出去
                }
            }
            if (isDivided==0)
                    System.out.println("否");
            else
                    System.out.println("是");
            }
        }
    


