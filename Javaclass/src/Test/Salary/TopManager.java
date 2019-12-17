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
public class TopManager extends Manager{
    
    public TopManager(String name, String sex, String firstday, String tel, String address, double salary, double overtimeHour) {
        super(name, sex, firstday, tel, address, salary, overtimeHour);
    }
    double topjobAllowance = 5000;
    double transportation = 2000;

    public TopManager() {
        super(null, null, null, null, null, 0, 0);
    }
    public void TopSalary(){
    super.data();
        System.out.println("Top Manager Salary");
    System.out.println("當月薪資:"+(grtOvertimePay()+getSalary()+lunchAllowance+topjobAllowance+transportation));
    }
}
