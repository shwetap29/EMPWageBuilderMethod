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

        interface IComputeEmpWage {
        public void addCompanyEmpWage(String company, int empRatePerHour, int NumOfWorkingDays, int maxHoursPerMonth);
        public void computeEmpWage();
        public int getTotalWage(String company);
    }


    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth, String company1) {
        this.company = company1;
    }

    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
    }


    public void setTotalEmpWage(int computeEmpWage) {
    }

        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }
        @Override
        public String toString() {
            return "Total Emp Wage for company: "+company+" is: "+totalEmpWage;
        }
        public void main(String[] args) {
            IComputeEmpWage empWageBuilder = new EmpWageBuilder() {
                @Overridepublic void computeEmpWage() {

                }
            };
            empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
            empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
            empWageBuilder.computeEmpWage();
        }
}
