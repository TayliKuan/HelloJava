
package Intermediate;

public class A1B2{
    public static void main(String[] args) {
        
        //印出四位亂數 且數字不重複
        int[]Ans = new int[4];
        for (int i = 0; i < Ans.length; i++) {
        Ans[i] = (int)(Math.random()*10);
        for (int j = 0; j < i; j++) {
            if(Ans[j]==Ans[i]) {
                i--;
                break;
            }
        }   
            //System.out.println(Ans);
        }	
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("1A2B小遊戲 請輸入4位數字 數字不重複");  
        String guess = sc.next();
        String Answer=String.valueOf(Ans);
        System.out.println(Answer);
        
        if(guess.length()>4){
                System.out.println("長度不符合 請輸入四位數字");
        }
        if(Answer != guess){
        int A=0,B=0;
                //A 0~3或正確4
            for(int i=0;i<4;i++){
                if(Answer.charAt(i)==guess.charAt(i)){
                    A++;
                    break;
                }
            }
                //B 0~4
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if( Answer.charAt(j)==guess.charAt(i)){
                        B++;
                        break;
                    }
                }
            }
            System.out.println(A+"A"+B+"B");
        }   
        else if(Answer == guess){
            System.out.println("你答對了!");
        }        
    }
}
        
        
        
//        int ans = (int)(Math.random()*9999);
//         int n1= ans/1000;
//         int n2=(ans-n1*1000)/100;
//         int n3=(ans-n1*1000-n2*100)/10;
//         int n4=(ans-n1*1000-n2*100-n3*10);
//         System.out.println(ans);
//         
//         java.util.Scanner sc = new java.util.Scanner(System.in);
//         System.out.println("1A2B小遊戲 請輸入4位數字 數字不重複");
//         
//         for (int i = 0; i < 2; i++) {
//            int input = sc.nextInt();
//            int i1=input/1000;
//            int i2=(input-i1*1000)/100;
//            int i3=(input-i1*1000-i2*100)/10;
//            int i4=(input-i1*1000-i2*100-i3*10);
//         
//         if (ans==input){
//             System.out.println("4A0B 你答對了!");
//             break;
//         }
//         else if (input>=10000){
//             System.out.println("長度不符合 請輸入四位數字");
//             i--;
//         }
//         else if (){
//         
//         }
//        }
//         
//    }
//}


