package com.brideglabz;

interface IComputeEmpWage {
    public void addCompanyEmpWage(String company, int empRatePerHour, int NumOfWorkingDays, int maxHoursPerMOnth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
public class EmpWage {
    public final String company ;
    public int maxHoursPerMonth;
    public int numOfWorkingDays;
    public int empRatePerHour;

    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth, String company1) {
        this.company = company1;
    }

    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
    }

    public void setTotalEmpWage(int computeEmpWage) {
    }
}
