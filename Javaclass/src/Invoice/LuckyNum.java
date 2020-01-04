/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

public class LuckyNum {
    String userinput;
    String [] LuckyNum={"20379435","47430762","36193504","693","043","425"};
    
    public LuckyNum(String userinput){
        this.userinput=userinput;
    }
    public String getUserinput() {
        return userinput;
    }
    public void setUserinput(String userinput) {
        this.userinput = userinput;
    }
    public void print(){
        System.out.println("本期發票號碼");
        System.out.println(LuckyNum[0]);
        System.out.println(LuckyNum[1]);
        System.out.println(LuckyNum[2]);
        System.out.println("增開六獎");
        System.out.println(LuckyNum[3]);
        System.out.println(LuckyNum[4]);
        System.out.println(LuckyNum[5]);
        System.out.println("-----------------------");
        System.out.println("您的發票號碼:"+userinput);
    }
}
