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
    void slowdown(){speed-=10;}
    }

public class Class5 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "toyota";
        c1.price = 100000;
        c1.volume = 3000;
        
        System.out.println("c1.brand"+c1.brand);
        System.out.println("c1.speed"+c1.speed);//類別與陣列 會給預設值 為0
        c1.speedup();
        System.out.println("c1.speedup"+c1.speed);
        c1.slowdown();
        System.out.println("c1.slowdown"+c1.speed);
    }
}
