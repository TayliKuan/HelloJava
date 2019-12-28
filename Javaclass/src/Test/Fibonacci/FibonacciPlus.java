package Test.Fibonacci;
import java.util.Scanner;
public class FibonacciPlus {
    public static void main(String[] args) {
        System.out.print("請輸入欲列印的數列索引值>");
        Scanner sc = new Scanner(System.in);
        int userinput=sc.nextInt();
        System.out.println(f(userinput));
    }
    static int f(int userinput){
    int r=0;
        if (userinput==0) {
            r=0;
        }
        else if (userinput==1) {
           r=1;
        }
        else{
        r=f(userinput-1)+f(userinput-2);
        }
    return r;
    }    
}
