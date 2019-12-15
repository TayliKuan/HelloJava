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
public class AfterClass {
    public static void main(String[] args) {
       // System.out.println('c'+1+2+4.0);//ASCII 字元 c是99 99+1
       // System.out.println(true+"1"+2+3+4.0);//true 當字串
        //System.out.println(true);//可以當字串直接印
        int i =10;
        //System.out.println(++i+i);
       // System.out.println(++i+ ++i);//JDK版本有可能有困擾 不會這樣寫 但可以用刮號避免
        //System.out.println(i++ );//i會先拿出來 複製一份
        //System.out.println(i++ +i);//i 會是 10+11
        //System.out.println(++i);//i不會再複製一份了 
       // System.out.println(++i+i);//因為已經變了 11+11
       /*
int i=1, j=0;
switch(8) {
case 2: j+=6;
case 4: j+=1;
default: j +=2;
case 0: j +=4;
}
        System.out.println(j);*/
        //System.out.println(i++*i);
        //System.out.println(i=i + 1 + i);
        System.out.println(i=i + 1 * i);
    }
}
