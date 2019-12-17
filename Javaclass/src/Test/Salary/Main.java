/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Salary;
/**
 *
 * @author 小官
 */
public class Main {
    public static void main(String[] args) {
        Employee em = new Employee("馬林","女","20191210","358002358","芬蘭",20000,20);
            em.data();
            em.emSalary();
            System.out.println("");
        
        Manager ma = new Manager("馬克宏", "男", "20170514", "0667322212", "法國", 50000, 10);
            ma.managerSalary();
            System.out.println("");  
        TopManager top = new TopManager("川普", "男", "20170120", "6265551212", "美國", 80000, 5);
            top.TopSalary();
            System.out.println("");
    }        
    
}

