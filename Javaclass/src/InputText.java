/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 小官
 */
public class InputText {
    public static void main (String[]args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入姓名");
        System.out.print("name=");
        String name = sc.next();
        
        System.out.println("請輸入年齡"); 
        System.out.print("age=");
        int age = sc.nextInt();
        
        System.out.println("請輸入身高,最多至小數點後兩位");
        System.out.print("high=");
        float high = sc.nextFloat();
        
        System.out.println("請輸入體重,最多至小數點後兩位");
        System.out.print("weight=");
        double weight = sc.nextDouble();
        
        System.out.println("小實驗-年齡為奇數可以領1顆糖,為偶數歲可以領2顆糖");
        System.out.print("來領糖喔~~~");
        if (age%2==1)
            System.out.println("可以領1顆糖");
        else
            System.out.println("可以領2顆糖");
    }
}
