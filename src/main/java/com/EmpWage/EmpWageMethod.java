package com.EmpWage;

public class EmpWageMethod {
    public static void main(String[] args) {
        int IS_FULL_TIME=1;
        System.out.println("Welcome to the Employee Wage Computation");
        int checkEmp = (int) (Math.random()*2);

        if (checkEmp==IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }


    }

}


