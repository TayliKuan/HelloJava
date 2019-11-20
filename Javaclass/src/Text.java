/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 小官
 */
public class Text {
public static void main(String[]text){
//溫度計寫法ˇ
//F=9/5C+32
double F, C;
    System.out.println("選擇你要轉換的溫度");
    System.out.println("攝氏C 轉華氏F 請輸入1");
    System.out.println("華氏F 轉攝氏C 請輸入2 ");

java.util.Scanner sc = new java.util.Scanner(System.in);//allow user to input
double input = sc.nextDouble();

    if(input==1){
    System.out.print("請輸入攝氏溫度C");
    double inputC = sc.nextDouble();
    F = inputC*9/5+32;//因為C是DOUBLE 9會是DOUBLE
//(9/5*C)+32 是不能的 因為9/5是1 整數
//F=((double)9/5*C+32);

//System.out.printf("F = %.2f \n",F);//要兩位數小數點 printf %.3f會是.三位 f是浮點數
//System.out.printf("F = %.2f %.3f \n",F,F);
    System.out.printf("F = %.2f  - 華氏F \n",F,F);
}
    else{
    System.out.print("請輸入華氏溫度F");
//java.util.Scanner sc = new java.util.Scanner(System.in);//allow user to input
    double inputF = sc.nextDouble();
    C=(inputF-32)*((double)5/9);
    System.out.printf("C = %.2f  - 攝氏C \n",C);
}
}
}