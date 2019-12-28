
package Appx;

import Appx.shape.Cylinder;
import java.awt.Point;
import javax.swing.JFrame;
import Appx.YourPoint;
import Appx.shape.Circle;
import Appx.shape.MyPoint;


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

public class Demo {
    
    static void test(MyPoint p){
    //後面test(new MyPoint());等於p=new Mypoint();
    //後面test(new Circle());等於p=new Cricle();
    p.print();
    if(p instanceof Circle){
        System.out.println("yes,is a circle");
    }else{
        System.out.println("not a circle");
    }
    }
    
    
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        //MyPoint p2 = new Circle();
        //System.out.println(p2);
        
        //Circle cc=(Circle)p1;//強制轉換 編譯器會過 編譯器相信你P1有三個空間XYR
        //cc.print();//但答案會噴掉 因為P1其實只是MYPOINT 只有兩個空間
        
       //MyPoint p1=new Circle();
       //p1.print();
       
        test(new MyPoint());//呼叫函式給值
        test(new Circle());//
        test(new Cylinder());
        
//        System.out.println("before>"+MyPoint.getCount());//static count 一 開始就存在了 所以沒有new也可以拿來用
//        //MyPoint.getCount()=1; 
//        System.err.println("after>"+MyPoint.getCount());
//        
//       //new YourPoint();//不能存到YourPoint(int i)因為是defalult等級
//        
//       MyPoint p1 = new MyPoint();
//       
//       System.out.println(p1.getCount());
//       MyPoint p2 = new MyPoint();
//       System.out.println(p2.getCount());
//       Cylinder cy1 = new Cylinder(1,2,3,4);
//       cy1.print();
//       MyPoint.getCount();//會提示 因為資料是mypoint的 但是如果new的話 會過但是不建議 因為是不是NEW出來的資料 一樣會去同一個靜態的地方
//////
//       cy1.setH(10);
//
//       cy1.print();//印出圓的資訊 x,y,r,h
//       cy1.printArea();//印出面積
//       cy1.printVolume();//印出體積
//           
//        Circle c0 = new Circle();
//        c0.print();//初始
//        c0.setX(5);
//        c0.setY(6);
//        c0.setR(3);
//        c0.print();//結果後
//        c0.printArea();
//        MyPoint p1 = new MyPoint();//在這裡MyPoint就被呼叫了 建構子 只有new可以
//        p1.print();//會先去跑完MyPoint(int x,int y)再回去MyPoint()
//        p1.setX(5);
//        p1.setY(6);
//        System.out.println("p1.getX()="+p1.getX());
//        System.out.println("p1.getY()="+p1.getY());
        
//        p1 = new MyPoint(6);
//        p1.print();
//        p1 = new MyPoint();
//        p1.print();
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
//    Point test=new Point(6,8);
//        System.out.println(test);
//    test.move(3,4);
//        System.out.println(test);
//        
//    

//    jf.setAlwaysOnTop(true);//在最上面
//    jf.setEnabled(true);//不能拖 不能移動
//    jf.setOpacity(0.5f);//透明度 不能用
//    jf.setResizable(true);//調整視窗大小
    }
}
