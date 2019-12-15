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
public class Class4Hw {
    public static void main(String[] args) {

//>請輸入您的英文名  :  FRank
//反轉後 knaRF
//>請輸入您的英文信箱  :  Kenny@appx.com.tw
//反轉後 ynneK
//
java.util.Scanner sc = new java.util.Scanner(System.in);
//        System.out.println("請輸入英文姓名");
//        System.out.print("name=");
//        String name = sc.nextLine();
//        System.out.print("name反轉測試>");
//        int numLong=name.length();//長度
//            for (int i = numLong-1; i >= 0; i--) {//-1因為從0開始算 比如AMY 是012 所以從0開始 A是0
//            System.out.print(name.charAt(i));}
//            
//        System.out.println(" ");    
//        
//        System.out.println("請輸入英文信箱");
//        System.out.print("mail=");
//        String mail = sc.nextLine();
//        System.out.print("信箱@前的英文字反轉測試>");
//        String result = mail.substring(0, mail.indexOf("@")); //先取出@前的字串
//            for (int i = result.length()-1; i >= 0; i--) {//反轉
//            char output=result.charAt(i);
//            System.out.print(output);
//            }
        //發票對獎題
        int data[]=new int[6];
        data[0]=20379435;
        data[1]=47430762;
        data[2]=36193504;
        data[3]=693;
        data[4]=043;
        data[5]=425;
        System.out.println("發票自動對獎 請輸入8碼 發票號碼");
        int invoiceNum = sc.nextInt();
        
       // System.out.println(data[0].substring(5));
//        if (invoiceNum==data[0]||invoiceNum==data[1]||invoiceNum==data[2]){
//            System.out.println("恭喜中頭獎");
//        }else{
//            
//        }
    }
}


