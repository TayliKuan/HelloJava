/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

/**
 *
 * @author 小官
 */
/*SWITCH TEXT
public class Class3 {
    public static void main(String[] args) {
        //switch 用在會員等級 或是艙等 或是星座 等等固定的 可以一目瞭然 簡單判斷==的對應
        char grade ='a';
        //final char target='a'; 後面改case'target'才可以
        switch (grade){
            default://會先比對所有CASE 最後才看這個
                System.out.println("None of Above");
                break;
            case'A':
                System.out.println("Great");
                break;//看到break才會跳開 所以如果沒有這個break 會印出 Great跟Not Bad
            case'B':
                System.out.println("Not Bad");
                break;
            case'C':
                System.out.println("Study Hard");
                break;
            case'D':
                System.out.println("Too Bad");
                break;
        }
    }
}
*/
public class Class3 {
    public static void main(String[] args) {
        for (int  i=1 ; i<11;i++) {
            System.out.print( i+" ");}
            System.out.print("\n");
    }
}
