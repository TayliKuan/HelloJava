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
public class BasicClassPortfolio {
    public static void main(String[] args) {
    System.out.println("Q1:九九乘法表-----------------------------");
        for (int i = 1; i < 10; i++) { 
            for (int j = 1; j < 10; j++) {
                if(i*j<10){//對齊
                    System.out.print(i + "*" + j +"= "+ i*j+" ");
                }else{
                    System.out.print(i + "*" + j +"="+ i*j+" ");
                }
            }
        System.out.println("");
        }
        System.out.println();
        
        
        System.out.println("Q2:上三角形的九九乘法表---------------------");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {//Key: j<=i
                if(i*j<10){
                    System.out.print(i + "*" + j +"= "+ i*j+" ");
                }else{
                    System.out.print(i + "*" + j +"= "+ i*j+" ");
                }   
            }
        System.out.println(""); 
        }
        System.out.println();
        
        
        System.out.println("Q3:請輸入數字判斷是否為質數-------------------");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入數字判斷是否為質數");
        int a = sc.nextInt();
        int isDivided=1;//先假設都質數1 一定要先給預設值
            for (int x=2; x<a/2; x++){//可以a在/2 因為不太可能會
                if (a%x ==0 ) {//條件完成 可以被整除 非質數
                isDivided=0;//0表示 非質數
                }
            }
            if (isDivided==0)
                    System.out.println("你輸入的不是質數");
            else
                    System.out.println("你輸入的是質數");
        System.out.println("");
            
            
        System.out.println("Q4:請輸入三位數資料 判斷是否為水仙花數--------------");
        int inputnum = sc.nextInt();
        int x,y,z;//輸入的三位數值 分別設為x,y,x
        x=inputnum/100;
        y=(inputnum-x*100)/10;
        z=inputnum-x*100-y*10;
            if(inputnum==(x*x*x)+(y*y*y)+(z*z*z))
                System.out.println("是水仙花數");
            else
                System.out.println("不是水仙花數");
        System.out.println("");

    
        System.out.println("Q5 Q6:樂透，產生六個介1~42的數字,不重覆,從小到大依序印出------");
        //使用陣列 把六個隨機數放進去不重複 逐數比對 如果重複 就退回迴圈再亂數一次
        int[]luckyNum = new int[6];
        for (int i = 0; i < luckyNum.length; i++) {
            luckyNum[i] = (int)(Math.random()*42+1);
            for (int j = 0; j < i; j++) {
                if(luckyNum[j]==luckyNum[i]) {
                    i--;
                    break;
                }
            }   
        }
        //由小到大排列 如果左邊比右邊大 數字交換
        for (int i = 0; i < luckyNum.length; i++) {//用九九乘法三角型概念
            for (int j = i+1; j < luckyNum.length; j++) {//以i為定點 自己不用比對+1
                if (luckyNum[i] > luckyNum[j]){
                      int box;
                      box = luckyNum[j];
                      luckyNum[j] = luckyNum[i];
                      luckyNum[i] = box;
                  }
              }
           }
        //印出陣列
        System.out.print("樂透號碼 = ");
        for (int  lottery: luckyNum) {//印出陣列裡面的數字
            System.out.print(lottery + ",");
        }
        System.out.println("");

        System.out.println("Q7:猜大小，執行後先產生一個答案，讓使用者輸入數字，再依大小回覆給使用者，方便參考--------------");
            int bingoNum=(int)(Math.random()*99+1);
            System.out.println("猜猜賓果遊戲→請輸入1-100的數字>");
            int bingoGuess = sc.nextInt();
            for (int i = 1;i<2; i++) {//只要執行一次
                if(bingoNum==bingoGuess){
                    System.out.println("YOU R BINGO!!!");
                }else if(bingoNum>bingoGuess){
                        System.out.println("你猜得太小了 再猜一次>");
                        bingoGuess = sc.nextInt();
                        i--;//回去再做一次
                }else if(bingoNum<bingoGuess){
                        System.out.println("你猜的太大了 再猜一次>");
                        bingoGuess = sc.nextInt();
                        i--;//回去再做一次
            }  
        }
    }
 }



