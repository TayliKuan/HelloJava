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
public class Employee extends Data{

    public Employee(String name, String sex, String firstday, String tel, String address, double salary, double overtimeHour) {
        super(name, sex, firstday, tel, address, salary, overtimeHour);
    }

    public double overPay(){
         overtimePay=getSalary()/240*1.5*getOvertimeHour();
         return overtimePay;
}

    public void Salary(){
        super.BasicData();
        System.out.print("當月薪資:");
        System.out.println((int)getSalary()+(int)overPay());
    }
}
