/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Thread;

/**
 * java Programming 0208 class 執行緒 thread
 *
 * @author 小官
 */
public class NewClass0208 {

    public static void main(String[] args) { //*main thread
        MyThread t = new MyThread();         //new thread(t)
        //去NEW 你的任務 讓他可以同時跑
        t.start();//找這個小幫手thread 進入點是用start 固定跑run() 同時執行 才有thread效果
        //在這時候剛好有兩個任務誕生的感覺
        //t.run();//會先跑run 再來main 當成一般function
        for (int i = 1; i < 11; i++) {
            System.out.println("main>" + i);
            
        }
    }
}
//定義任務

class MyThread extends Thread {

    public void run() {//實作 runnable 裡面的run
        for (int i = 1; i < 11; i++) {
            System.out.println("mythread>" + i);
        }
    }
}
