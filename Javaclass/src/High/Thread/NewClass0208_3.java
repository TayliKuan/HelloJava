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
 * SLEEP  setPriority 優先順序
 * @author 小官
 */
public class NewClass0208_3 {
    public static void main(String[] args) {
        tHThread t = new tHThread();
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);//先做 10分最高 但不一定
        MRunable mr = new MRunable();
        Thread t2 = new Thread(mr);
        t2.start();
        t2.setPriority(5);//1-10給五 中間

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

class MRunable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Runnable>" + i );
        }
    }
}

class tHThread extends Thread {

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Thread>" + i);
        }
    }
}
