
package Intermediate;

public class A1B2{
    public static void main(String[] args) {
        
        //印出四位亂數 且數字不重複
        //String numStr="";
        String Ans = "";
        for (int i = 0; i < 4; i++) {
            Ans = Ans + String.valueOf((int)(Math.random()*10));
            for (int j = 0; j < i; j++) {
                if(Ans.charAt(j)==Ans.charAt(i)) {
                 i--;
                    break;
                }
            }
        }
        System.out.println(Ans);

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("1A2B小遊戲 請輸入4位數字 數字不重複");  
        String guess = sc.next();
        
        
        if(guess.length()>4){
                System.out.println("長度不符合 請輸入四位數字");
        }
        if(Ans != guess){
        int A=0,B=0;
                //A 0~3或正確4
            for(int i=0;i<4;i++){
                if(Ans.charAt(i)==guess.charAt(i)){
                    A++;
                    break;
                }
            }
                //B 0~4
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if( Ans.charAt(j)==guess.charAt(i)){
                        B++;
                        break;
                    }
                }
            }
            System.out.println(A+"A"+B+"B");
        }   
        else if(Ans == guess){
            System.out.println("你答對了!");
        }        
    }
}