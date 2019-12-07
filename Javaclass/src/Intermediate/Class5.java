
package Intermediate;
import java.awt.Point;
import javax.swing.JFrame;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 小官
 */
 

class Car{//類別 類別名稱
    //以下 非功能 (變數) 屬性
    double price;
    int volume;
    String brand;
    int speed;
    //以下功能性 會影響狀態
    void speedup(){speed=speed+10;}
    void slowdown(){
        //String color = "pink";
        if(speed>=10)
            speed-=10;}
    }//irent 股票

public class Class5 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(6,8);//在這裡MyPoint就被呼叫了 建構子 只有new可以
//        p1.setX(5);
//        p1.setY(6);
//        System.out.println("p1.getX()="+p1.getX());
//        System.out.println("p1.getY()="+p1.getY());
        p1.print();
        p1 = new MyPoint(6);
        p1.print();
        p1 = new MyPoint();
        p1.print();
//        Car c1 = new Car();
//        c1.brand = "toyota";
//        c1.price = 100000;
//        c1.volume = 3000;
//        
//        System.out.println("c1.brand"+c1.brand);
//        System.out.println("c1.speed"+c1.speed);//類別與陣列 會給預設值 為0
//        c1.speedup();
//        System.out.println("c1.speedup"+c1.speed);
//        c1.slowdown();
//        c1.slowdown();
//        System.out.println("c1.slowdown"+c1.speed);
//        
//        Car c2 = new Car();
//        System.out.println("c2.brand"+c2.brand);
//        System.out.println("c2.speed"+c2.speed);
    Point test=new Point(6,8);
        System.out.println(test);
    test.move(3,4);
        System.out.println(test);
        
    JFrame jf = new JFrame("Hello World");
    jf.setVisible(true);
    //一個網頁視窗
    jf.setSize(300, 300);//像素
    jf.setAlwaysOnTop(true);//在最上面
    jf.setEnabled(true);//不能拖 不能移動
    jf.setOpacity(0.5f);//透明度 不能用
    jf.setResizable(true);//調整視窗大小
    }
}
