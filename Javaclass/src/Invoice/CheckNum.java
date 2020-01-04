/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

public class CheckNum extends LuckyNum{
 
    public CheckNum(String userinput) {
        super(userinput);
    }
    
    public void getUserNumLong(){
    int numLong=userinput.length();//長度
    for (int i = numLong-1; i >= 0; i--) {//-1因為從0開始算 比如AMY 是012 從0開始 A是0
    System.out.print(userinput.charAt(i));} 
            
    //switch(userinput){
        //case }
                }
}
