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
public class Cylinder extends Circle{
    int h;
    public void setH(int i){h=i;}
    public int getH(){return h;}
//    int getH(){
//        return this.h;
//    }
//    void setH(int i){
//       h = i;  
//    }
    public Cylinder(int x,int y,int r,int h){
    super(x,y,r);
        setH(h);
}
        public Cylinder(){
        setH(h);
}
 
    public void print(){
    super.print();
        System.out.println(" h="+getH());
    }
    public void printVolume(){
        System.out.print("Volume=");
        System.out.print(getArea()*getH());   
    }
}