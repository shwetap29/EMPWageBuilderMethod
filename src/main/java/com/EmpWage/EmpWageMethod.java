package com.EmpWage;

public class EmpWageMethod {

    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int WAGE_PER_HR=20;

    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HR = 20;

        int empHr = 0;
        int dailyWage = 0;
        int checkEmp = (int) (Math.random() * 3);

        if (checkEmp == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empHr = 8;
        } else {
            System.out.println("Employee is Absent");
            empHr = 0;

            empHr=8;
        }  else if (checkEmp==IS_PART_TIME); {
            empHr=4;
        }
        dailyWage = empHr * WAGE_PER_HR;
           else {
            empHr=0;
        }
        dailyWage=empHr*WAGE_PER_HR;
        System.out.println("Daily wage = " + dailyWage);

    }

}

