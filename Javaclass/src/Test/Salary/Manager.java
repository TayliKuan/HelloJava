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

    public void managerSalary(){
        super.data();
        System.out.println("Manager Salary");
        System.out.println("當月薪資:"+(grtOvertimePay()+getSalary()+lunchAllowance+majobAllowance));
    } 
}
