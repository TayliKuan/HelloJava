/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Thread;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * JOIN 要想優先順序 T2做完後才做 MAIN 但t跟t2 是同時做
 * @author 小官
 */
public class NewClass0208_4 {
    public static void main(String[] args) {
        aHThread t = new aHThread();
        t.start();

        
        qRunable mr = new qRunable();
        Thread t2 = new Thread(mr);
        t2.start();
        try {
            t2.join(); // 等t2 做好 main 才會繼續往下執行
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        

        for (int i = 1; i < 11; i++) {
            System.out.println("main>" + i+ new Date());//要做的事情比較多 放後面
            
            try {
                Thread.sleep(1000);//隔一秒再印
            } catch (InterruptedException ex) {
                System.out.println("sleep Exception");
            }
        }

    }
}
//定義任務

class qRunable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Runnable T2>" + i );
        }
    }
}

class aHThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Thread T>" + i);
        }
    }
}
