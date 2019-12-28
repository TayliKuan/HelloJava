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
public class Manager extends Employee{

    public Manager(String name, String sex, String firstday, String tel, String address, double salary, double overtimeHour) {
        super(name, sex, firstday, tel, address, salary, overtimeHour);
    } 
    double lunchAllowance=1800;
    double majobAllowance=3000;

    @Override
    public double overPay(){
         overtimePay=getSalary()/240*1.8*getOvertimeHour();
         return overtimePay;
    }
    
    @Override
    public void Salary(){
        super.BasicData();
        System.out.print("當月薪資:");
        System.out.println((int)overPay()+(int)getSalary()+(int)lunchAllowance+(int)majobAllowance);
    } 
}
