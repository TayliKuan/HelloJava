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
/*[for 迴圈 練習]
#1  寫一程式，執行時印出  1  3  5  7  9
#2  寫一程式，執行時印出  2  4  6  8  10
#3  寫一程式，執行時印出  10  8  6  4  2
#4  寫一程式，執行時印出  5  15  25  35  45  55  65  75  85  95
#5  寫一程式，執行時印出  95  85  75  65  55  45  35  25  15  5
(* 以這一行  for (int  i=1;  i<11;  i++)   {  //TODO ....  }  
*/
public class ForText {
    public static void main(String[] args) {
        for (int  i=1;  i<11;  i++) {
            if(i % 2 == 1)
            System.out.print( i+" ");}
            System.out.print("\n");
        
        for (int  i=1;  i<11;  i++) {
            if(i % 2 == 0)
            System.out.print( i+" ");}
            System.out.print("\n");
        
        for (int  i=10; i>0 && i<11;  i--) {
            if(i % 2 == 0)
            System.out.print( i+" ");}
            System.out.print("\n");
        
        for (int  i=1;  i<11;  i++) {
            System.out.print( i*10-5+" ");}
            System.out.print("\n");
            //i=5 ;i<96 ;i=10
        
        for (int  i=10;  i>0 && i<11;  i--) {
            System.out.print( i*10-5+" ");}
            System.out.print("\n");
    }
}
