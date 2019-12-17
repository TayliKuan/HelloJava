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
public class Employee {
    String name;
    String sex;
    String firstday;
    String tel;
    String address;
    double salary;
    double overtimePay;
    double overtimeHour;

    public Employee(String name, String sex, String firstday, String tel, String address, double salary, double overtimeHour) {
        this.name = name;
        this.sex = sex;
        this.firstday = firstday;
        this.tel = tel;
        this.address = address;
        this.salary = salary;
        this.overtimeHour=overtimeHour;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSex() {return sex;}
    public void setSex(String sex) {this.sex = sex;}

    public String getFirstday() {return firstday;}
    public void setFirstday(String firstday) {this.firstday = firstday;}

    public String getTel() {return tel;}
    public void setTel(String tel) {this.tel = tel;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public double getOvertimePay() {return overtimePay;}
    public void setOvertimePay(double overtimePay) {this.overtimePay = overtimePay;}

    public double getOvertimeHour() {return overtimeHour;}
    public void setOvertimeHour(double overtimeHour) {
        this.overtimeHour = overtimeHour;
    }
    
    public double grtOvertimePay(){
         overtimePay=getSalary()/240*1.5*getOvertimeHour();
         return overtimePay;
    }
    public void data(){
        System.out.println("姓名:"+name);
        System.out.println("性別:"+sex);
        System.out.println("到職日:"+firstday);
        System.out.println("電話:"+tel);
        System.out.println("地址:"+address);
    }
    public void emSalary(){
    System.out.println("Employee Salary");
    System.out.println("當月薪資:"+(grtOvertimePay()+getSalary()));
    }
}
