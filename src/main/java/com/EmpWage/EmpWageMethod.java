package com.EmpWage;

public class EmpWageMethod {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int WAGE_PER_HR = 20;
        int EmpHr = 0;
        int dailyWage = 0;

        System.out.println("Welcome to the Employee Wage Computation");

        int checkEmp = 0;
        if (checkEmp == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            EmpHr = 8;
        } else {
            System.out.println("Employee is Absent");
            EmpHr = 0;
        }
        dailyWage = EmpHr * WAGE_PER_HR;
        System.out.println("Daily wage = " + dailyWage);

    }

}

