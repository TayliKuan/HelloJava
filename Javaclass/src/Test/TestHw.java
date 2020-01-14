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
public class TestHw {

    public static void main(String[] args) {
        int a = 3; int b = 2; int c = 4; int d = 0;
        boolean D = false;

        d = a / b;
        System.out.println("A.3/2=" + d);

        D = a<b; //布林 無法用int比較
        System.out.println("B. 3<2="+D);
        
        d = a * c;
        System.out.println("C.3*4=" + d);

        d = a << b;               //(10進位的)2=(2進位)0010;(10進位的)3=(2進位)0011 
        System.out.println("D.3<<2=" + d);  //以a(3)為基準  0011往左兩位(b) = 1100 = 十進位的12

        d = a * b ^ b;            //6^2   0110跟0010比   同位置同數為0=0 不同為1  答案0100=十進位4
        System.out.println("E.3*2^2=" + d);

        d = a>>>b;//沒有a<<<b  固定前面補0
        System.out.println("F. 3<<<2="+d);//以a(3)為基準  0011往右兩位(b)=0000 = 十進位的0
    }
}
