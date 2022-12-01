package com.example.Inheritance;

public class Main {
    public static void main(String[] args){
        Analyst employeeOne = new Analyst("Sally Roberts", 80000, 34);

        Salesperson employeeTwo = new Salesperson("Matt Johnson", 65000, 32, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}