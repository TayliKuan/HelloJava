/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Thread;

/**
 *用implements Runnable 實作出來
 * @author 小官
 */
public class NewClass0208_2 {

    public static void main(String[] args) {
        tThread t = new tThread();
        t.start();

        MyRunable mr = new MyRunable();
        Thread t2 = new Thread(mr);//要多一個
        t2.start();

        for (int i = 1; i < 11; i++) {
            System.out.println("main>" + i+ " @ "+Thread.currentThread().getName());//看執行緒的名字
        }

    }
}
//定義任務

class MyRunable implements Runnable {

    @Override
    public void run() {//一定要實作 RUN 不管是直接在Thread 或是runnable
        for (int i = 1; i < 11; i++) {
            System.out.println("myrunable>" + i + " by "+Thread.currentThread().getName() );
        }
    }
}

class tThread extends Thread {

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("mythread>" + i+" at "+getName());//在Thread 直接可以用 getname()
        }
    }
}
