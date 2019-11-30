/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
//九九
/*public class Class3 {
    public static void main(String[] args) {
        //for (int  i=1 ; i<11;i++) {
           // System.out.print( i+" ");}
            //System.out.print("\n");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if(i*j<10){
                System.out.print(i + "*" + j +"= "+ i*j+" ");
                }else{
                System.out.print(i + "*" + j +"="+ i*j+" ");   
                    //System.out.printf(" %2d*%-2d=%-3d",i,j,i*j);//2d兩格 -就是靠左還是右
                }}
        System.out.println("");
        }//but三位數不行
    }
}*/
//99三角 j<=i
/*public class Class3 {
    public static void main(String[] args) {
        //for (int  i=1 ; i<11;i++) {
           // System.out.print( i+" ");}
            //System.out.print("\n");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                if(i*j<10){
                System.out.print(i + "*" + j +"= "+ i*j+" ");
                }else{
                System.out.print(i + "*" + j +"= "+ i*j+" ");   
                    //System.out.printf(" %2d*%-2d=%-3d",i,j,i*j);//2d兩格 -就是靠左還是右
                }}
        System.out.println("");
        }//but三位數不行
    }
}*/

//if簡寫
//列出你印的數字
/*public class Class3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入想要列印的次數");
        int num = sc.nextInt();//num是不變的 所以要在另一個變數 來用迴圈
        for (int i = 1; i<=num; i++) {
            System.out.println(i);
        }
        System.out.println(num+" is "+((num%2 == 0)?"even":"odd"));//?代表if true執行?後面字串 如果false執行:後面字串
        //簡寫以下if else 這用法只用在二擇一
        /*if(num%2==0 )
            System.out.println(num+"is even");
        else
            System.out.println(num+"is odd");
     }
}*/
        
//*while 練習 輸入 直到9離開
/*public class Class3 {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int number;
        do{
            System.out.println("Pls enter 1)A,2)B,9)Exit");
            number= sc.nextInt();
        }while(number !=9);
        System.out.println("Thanks for calling!");
        }
    }*/

/*function 呼叫
public class Class3 {
    static void sayHello(int x,char c){//要加static才可以呼叫 這動作要在main外面
        System.out.println("Hi,how are you ?");
        int i= 30; {
            System.out.println("In Test,i is "+i);
            System.out.println("In Test,i is "+x);//main 一定要給值
            for (int j = 1; j < 10; j++) {
                System.out.print(c);
        }
        }System.out.println("");
    }
    public static void main(String[] args) {
        int i =20;
        System.out.println("In main,i is "+i);
        sayHello(7,'@');
        System.out.println("In main,after is "+i);
        sayHello(5,'!');
        }
    
    }*/
/*public class Class3 {
    static int sayHello(){//要加static才可以呼叫 這動作要在main外面
            return 8;
        }
public static void main(String[] args) {
        int result =sayHello();
        System.out.println(result);
        }
    }
//回傳 東西 int*/
/*
public class Class3 {
public static void main(String[] args) {
      int x=11;
      int r=1;
      r+=x;
      if((x>4)&&(x<10)){
        r+=2*x;
      }else if(x<=4){
          r+=3*x;
      }else{
      r+=(4*x);
      }
      System.out.println("r= "+r);
    }
}*/