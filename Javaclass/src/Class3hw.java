/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 小官
 */
//讓使用者輸入資料，如123，或是7766，判斷輸入的數字是幾位數?!(*限用 nextInt() 取得輸入的整數)
/*public class Class3hw {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入任一數字 判斷此數為幾位數");
        int enternum = sc.nextInt();
        
            if(enternum<10){
                System.out.println("1");
            }else if(enternum<100){
                System.out.println("2");
            }else if(enternum<1000){
                System.out.println("3");
            }else if(enternum<10000){
                System.out.println("4");
            }else if(enternum<100000){
                System.out.println("5");
            }else if(enternum<1000000){
                System.out.println("6");
            }else if(enternum<10000000){
                System.out.println("7");
            }else if(enternum<100000000){
                System.out.println("8");
            }else if(enternum<1000000000){
                System.out.println("9");
            }
        else 
                System.out.println("10");//int最多到10位數}   
    }
}
*/
//解2 判斷幾位數
public class Class3hw {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入任一數字 判斷此數為幾位數");
        int enternum = sc.nextInt();//固定
        int a=1;//變數 /10判斷 再加一位回來
            if(enternum/10!=0){//輸入值不等於0
                while(enternum/10!=0){
                enternum=enternum/10;//以除以10判斷有多少位數
                a=a+1;}//除以10會少一位 要加一位回來
                System.out.println("此數為"+a+"位數");
            }else if(enternum/10==0){//輸入值為個位數/10一定為0
            System.out.println("此數為個位數");
        }
        
    }
} 
        
        
/*
//讓使用者輸入一個三位數資料，如 123，或是776 ，判斷輸入的數字是否為水仙花數?!
//153 = 1的3次方 + 5的3次方 + 3的3次方
//370 = 3的3次方 + 7的3次方 + 0的3次方
//371 = 3的3次方+ 7的3次方+ 1的3次方
//407 = 4的3次方+ 0的3次方 + 7的3次方
public class Class3hw {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入三位數資料 判斷是否為水仙花數");
        int inputnum = sc.nextInt();
            int x,y,z;//輸入的三位數值 分別設為x,y,x
            x=inputnum/100;
            y=(inputnum-x*100)/10;
            z=inputnum-x*100-y*10;
            if(inputnum==(x*x*x)+(y*y*y)+(z*z*z))
                System.out.println("是水仙花數");
            else
                System.out.println("不為水仙花數");
            //int a;
            //a=x*x*x+y*y*y+z*z*z;
           // boolean b=true;
                //if (a==inputnum){
                   // b=true;
                //System.out.println("是水仙花數");
                //}else{
                    //b=false;
                    //System.out.println("不為水仙花數");}
    }
}
*/