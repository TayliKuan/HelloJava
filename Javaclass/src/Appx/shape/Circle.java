/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appx.shape;

/**
 *
 * @author 小官
 */
public class Circle extends MyPoint{
    int r;
    double pi=3.14;
    public Circle() {//javac會先去掃語法跟建構值 如果沒有 就會給預設建構子 塞進去 在產出class 這行
        super(88);//第一行一定要先呼叫父類別-就像是new MyPoint概念 沒有寫就預設 幫妳寫這行
        //呼叫父類別 MyPoint (int i)這個版本
    }
    public Circle(int a,int b,int c) {//javac會先去掃語法跟建構值 如果沒有 就會給預設建構子 塞進去 在產出class 這行
        super(a,b);
        setR(c);
    }
    public int getR(){
        return this.r;
    }
    public void setR(int i){
       r = i;  
    }   
    public void print(){
        System.out.println(toString());

    }
    public String toString(){
    return super.toString()+"r="+getR();
    }
    public void printArea(){
    System.out.println("Circle Area="+getArea());
    }
    
    public double getArea(){
    return pi*getR()*getR();//包裝起公式 retuen 不回傳void
    }
    
}
