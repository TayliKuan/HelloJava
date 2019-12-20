package Test.Fibonacci;
import java.util.Scanner;
public class FibonacciPlus {
    public static void main(String[] args) {
        System.out.print("請輸入欲列印的數列索引值>");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n0=0;
        int n1=1;
        int n2=0;//給初始值
        //費式
        //System.out.print("0,");//要印出費式的話
            for (int i = 1; i <= x; i++) {
                n0=n1;
                n1=n2;
                n2=n1+n0;
                //System.out.print(n2+",");////要印出費式的話
        }
            System.out.println("答案是:"+n2);
    }
}
