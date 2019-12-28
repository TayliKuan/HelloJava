/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JF;

import SimilarAction.Flyable;
import javax.swing.JFrame;


public class Main  {
    public static void main(String[] args) {
        MyForm mf = new MyForm();
        //Flyable b=new Bird();
        //testFly(new Bird());
        //testFly(new AirPlane());
    }
    public static void testFly(Flyable ff){
    ff.fly();
    }
}
