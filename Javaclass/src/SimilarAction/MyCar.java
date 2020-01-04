/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimilarAction;

/**
 *
 * @author 小官
 */
public abstract class MyCar {
    public MyCar(){
    //建構子
    }
    public void print(){//可以放抽象類別+完整function
    update();
    speedup();
    save();
    }
    public void save(){//可以放完整function
    
    }
    public void update(){
    
    }
    public abstract void speedup();//抽象function
}
class YourCar extends MyCar{//抽象類別可以被繼承 
public void speedup(){//要不就完整他 要不就一樣讓他繼續抽象
    System.out.println("speed up in YourCar");
}
}