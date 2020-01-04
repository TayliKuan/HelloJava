/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;
import java.util.Scanner;
/**
 *
 * @author 小官;
 */
public class Main {
public static void main(String[] args) {
    System.out.print("請輸入您的發票號碼 共8碼 由此兌獎>>");
    Scanner sc = new Scanner(System.in);
    String userinput=sc.nextLine();
    LuckyNum L1 = new CheckNum(userinput);
    //L1.print();
    L1.getUserinput();
    }
}
