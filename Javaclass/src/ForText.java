/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 小官
 */
public class ForText {
    public static void main(String[] args) {
        for (int  i=1;  i<11;  i++) {
            if(i % 2 == 1)
            System.out.print( i+" ");}
            System.out.print("\n");
        
        for (int  i=1;  i<11;  i++) {
            if(i % 2 == 0)
            System.out.print( i+" ");}
            System.out.print("\n");
        
        for (int  i=10; i>0 && i<11;  i--) {
            if(i % 2 == 0)
            System.out.print( i+" ");}
            System.out.print("\n");
        
        for (int  i=1;  i<11;  i++) {
            System.out.print( i*10-5+" ");}
            System.out.print("\n");
        
        for (int  i=10;  i>0 && i<11;  i--) {
            System.out.print( i*10-5+" ");}
            System.out.print("\n");
    }
}
