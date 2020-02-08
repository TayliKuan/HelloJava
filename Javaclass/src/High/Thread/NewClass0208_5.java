/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Thread;

/**
 * 領錢實戰 兩個人同時領一個帳戶的錢
 *
 * @author 小官
 */
class Account {//帳戶金額

    public int Account = 100;
}

class Person extends Thread {

    Account acct;

    public Person(Account a) {
        acct = a;
    }

    public void withDrow(int i) {
        // public synchronized void withDrow(int i) { 
        //整個function都同步了 整個效能都會卡住 失去多執行緒效果
        synchronized (acct) {//代表裡面只能有一個人 在這區塊同步監控 精準 定義區塊
            // synchronized (this)
            //this 就是這個Person類型 看誰進來就是誰 p1 就是p1
            if (acct.Account >= i) {
                System.out.println("帳戶金額=" + acct.Account + " > " + "領" + i + "元" + "領錢中..." + Thread.currentThread().getName());

                acct.Account -= i;
                if (acct.Account != 0) {
                    System.out.println("餘額=" + acct.Account + " >>> " + "可以繼續領錢");
                } else {
                    System.out.println("餘額=" + acct.Account + " >>> " + "沒錢拉");
                }
            }
        }

    }

    public void run() {
        while (acct.Account > 0) {

            //withDrow((int)(Math.random()*10)+1);
            if (Thread.currentThread().getName().equals("Fred")) {
                withDrow(10);
            }

            if (Thread.currentThread().getName().equals("Betty")) {
                withDrow(20);
            }

        }

    }

}

public class NewClass0208_5 {

    public static void main(String[] args) {
        Account At = new Account();
        Person P1 = new Person(At);
        Person P2 = new Person(At);

        P1.start();//執行run
        P1.setName("Fred");
        P2.start();
        P2.setName("Betty");
    }
}
