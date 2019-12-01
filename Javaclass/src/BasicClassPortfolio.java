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
    /*  System.out.println("Q1:九九乘法表-----------------------------");
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

*/
        System.out.println("Q5:樂透產生器，產生六個 介於 1~42的數字 而且不重覆------");
        int[]data = new int[6];
        for (int i = 1; i < data.length; i++) {
             int luckyNum = (int)(Math.random()*42+1);
             if (luckyNum==luckyNum) {//如果兩數相等 再亂數一次
                     int a=(int)(Math.random()*42+1); 
                     //break;
                }
            data[i]=luckyNum;
            System.out.println(data[i]);
            //使用陣列 把六個隨機數放進去
        }
//        for (int i = 1; i < 7; i++) {
//            int luckyNum=(int)(Math.random()*42+1);//KEY *42就是0-41
//            //前面取出六個數 接下來逐數比對
//            for (int j = 1; j < i; j++) {//j<i 因為已經重複比過一次了 自己不用比對 用九九乘法三角型概念
//                if (luckyNum==luckyNum) {//如果兩數相等 再亂數一次
//                   int a=(int)(Math.random()*42+1); 
//                   break;
//                }
//                
//            }
//        System.out.println("樂透號碼=" + luckyNum);}
//        System.out.println("");
       
        
//        System.out.println("Q6:將樂透號碼的陣列 依從小到大的排列方式 依序印出-------");
//        int[]data = new int[6];
//        for (int i = 1; i < data.length; i++) {
//            int luckyNum = (int)(Math.random()*42+1);
//        data[i]=luckyNum;//使用陣列 把六個隨機數放進去
//        }
//        for (int i = 0; i < 6; i++) {//用九九乘法三角型概念
//            for (int j = i+1; j < 6; j++) {//以i為定點 自己不用比對+1
//                if (data[i] > data[j]){
//                    int box;
//                    box = data[j];
//                    data[j] = data[i];
//                    data[i] = box;
//                }
//            }
//        }
//        for (int luckyNum : data) {//印出陣列裡面的數字
//            System.out.println(luckyNum);
//        }
    }
}

