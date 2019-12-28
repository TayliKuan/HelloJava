/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Fibonacci;

/**
 *
 * @author 小官
 */
public class Fibonacci {
    int userinput;
    public Fibonacci(int userinput){
        this.userinput=userinput;
    }

    public int getUserinput() {
        return userinput;
    }

    public void setUserinput(int userinput) {
        this.userinput = userinput;
    }
    
    public  int f(int userinput){
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
