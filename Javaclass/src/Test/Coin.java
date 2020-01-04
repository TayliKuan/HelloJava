/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author 小官
 */
public class  Coin{
public void override(Head side){System.out.println("Coin override(H)"+side.getSide());}
public void override(Tail side){System.out.println("Coin override(T)"+side.getSide());}
public void override(Side side){System.out.println("Coin override(S)"+side.getSide());}

    public static void main(String[] args) {
        Coin aCoin=new Coin();
        Side firstAttempt = new Head();
        Tail secondAttempt= new Tail();
        //aCoin.override(firstAttempt); 
        //aCoin.override((Object)firstAttempt);
        aCoin.override(secondAttempt);
        //aCoin.override((Side)secondAttempt);
    }
}
