/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High;

/**
 *
 * @author 小官
 */
public class DemoThread {

    public static void main(String[] args) {
        System.out.println("Store is running business....");
        System.out.println("====================");
        FoodPlate foodPlate = new FoodPlate();
        Waiter w = new Waiter(foodPlate);
        Chef c = new Chef(foodPlate);
        c.start();
        w.start();

    }
}

class FoodPlate {

    String content = null;
}

class Waiter extends Thread {

    private int count = 0;
    private FoodPlate foodPlate;

    public Waiter(FoodPlate s) {
        foodPlate = s;
        //start();
    }

    public void run() {
        while (true) {
            if (count < 10) {
                count++;
            } else {
                System.exit(0);
            }
            synchronized (foodPlate) {
                if (foodPlate.content != null) {
                    // consume food, and notify the chef
                    System.out.println("Waiter is consuming food: " + foodPlate.content);
                    foodPlate.content = null;
                    foodPlate.notify();
                } else {
                    // foodPlate is not ready yet ( Chef is still working...)
                    //System.out.println("Waiter is still consuming...");
                    try {
                        foodPlate.wait();
                    } catch (InterruptedException ie) {
                        System.out.println("Exception in waiter, when Chef should be working...");
                    }
                }
            }
        }
    }
}

class Chef extends Thread {

    private FoodPlate foodPlate;
    private String[] foods = {"Steak", "Bread", "Shrimp", "Rice"};

    public Chef(FoodPlate s) {
        foodPlate = s;
        //start();
    }
public void run() {
        while (true) {
            synchronized (foodPlate) {
                if (foodPlate.content == null) {
                    // make food, and notify the waiter
                    foodPlate.content = foods[(int) (Math.random() * 4)];
                    System.out.println("Chef is making food: " + foodPlate.content);
                    foodPlate.notify();
                } else {
                    // foodPlate is not empty, wait for the plate
                    try {
                        foodPlate.wait();
                    } catch (InterruptedException ie) {
                        System.out.println("Exception in Chef, when Waiting is still working...");
                    }
                }
            }
        }
    }
}
