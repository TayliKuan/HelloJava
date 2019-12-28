/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Fibonacci;
import java.util.Scanner;
/**
 *
 * @author 小官
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("請輸入欲列印的數列索引值>");
        Scanner sc = new Scanner(System.in);
        int userinput=sc.nextInt();
        Fibonacci F=new Fibonacci(userinput);
        System.out.println(F.f(userinput));
    }
}
