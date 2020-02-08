/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Thread;

/**
 * 領錢+存錢
 *
 * @author 小官
 */
class Account2 {

    public int Account = 100;
}

class Person2 extends Thread {

    Account acct;

    public Person2(Account a) {
        acct = a;
    }

    public void withDrow2(int i) {
        while (true) {       //迴圈     
            synchronized (acct) {
                if (acct.Account >= i) {
                    System.out.println("帳戶金額=" + acct.Account + " > " + "領" + i + "元" + "領錢中..." + Thread.currentThread().getName());
                    acct.Account -= i;
                    if (acct.Account != 0) {
                        System.out.println("餘額=" + acct.Account + " >>> " + "可以繼續領錢");
                    } else {
                        System.out.println("餘額=" + acct.Account + " >>> " + "沒錢拉");
                    }

                } else {
                    acct.notify();
                    try {
                        acct.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

    }

    public void run() {

        while (acct.Account > 0) {

            if (Thread.currentThread().getName().equals("Fred")) {
                withDrow2(10);
            }

            if (Thread.currentThread().getName().equals("Betty")) {
                withDrow2(20);
            }

        }

    }

}

class Depositer extends Thread {

    Account acct;

    public Depositer(Account a) {
        acct = a;
    }

    public void depositer(int i) {
        while (true) {            //迴圈
            synchronized (acct) {
                if (acct.Account < 10) {
                    acct.Account = 100;
                    System.out.println("存錢>>" + acct.Account + "....." + Thread.currentThread().getName());

                } else {
                    acct.notify();
                    try {
                        acct.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

    }

    public void run() {

        while (acct.Account > 0) {
            depositer(100);
        }

    }
}

public class NewClass0208_6 {

    public static void main(String[] args) {
        Account At = new Account();
        Person2 P1 = new Person2(At);
        Person2 P2 = new Person2(At);
        Depositer D1 = new Depositer(At);

        P1.start();
        P1.setName("Fred");
        P2.start();
        P2.setName("Betty");
        D1.start();
        D1.setName("Tayli");
    }
}
