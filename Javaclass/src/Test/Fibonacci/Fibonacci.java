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
    int n0=0;
    int n1=1;
    int n2=0;//給初始值
    int userImput;
    
    public Fibonacci(int userImput){
     this.userImput=userImput;
    }

    public int getUserImput() {
        return userImput;
    }

    public void setUserImput(int userImput) {
        this.userImput = userImput;
    }
    
    public void getAns(){
        if (userImput==0) {
            System.out.println("f("+userImput+")="+0);    
        }
        else if (userImput==1) {
            System.out.println("f("+userImput+")="+1);
        }
        else {
            for (int i = 1; i <= userImput; i++) {
                n0=n1;
                n1=n2;
                n2=n1+n0;
            }
            System.out.println("f("+userImput+")="+n2);
        }
    }
}    