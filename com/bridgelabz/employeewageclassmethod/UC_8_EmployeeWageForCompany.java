package com.bridgelabz.employeewageclassmethod;

public class UC_8_EmployeeWageForCompany {
    public static int employeeMonthlyWageWhileloop(int employeeWagePerHour, int workingDaysPerMonth) {

        int employeeHrs = 0;
        int employeeWage = 0;
        int totalEmployeeHours = 0;
        int maximumHoursInMonth = 100;
        int totalWorkingDays = 0;
        while (totalEmployeeHours <= maximumHoursInMonth &&
                totalWorkingDays < workingDaysPerMonth) {
            totalWorkingDays++;
            {
                int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (employeeCheck) {
                    case 1:
                        employeeHrs = 16;
                        break;
                    case 2:
                        employeeHrs = 8;
                        break;
                    default:
                        employeeHrs = 0;

                }
                employeeWage = employeeHrs * employeeWagePerHour;

                totalEmployeeHours += employeeHrs;
                System.out.println("Day#: " + totalWorkingDays + " EmpHour: " + employeeHrs);
            }
        }
        int totalEmployeeWage = totalEmployeeHours * employeeWagePerHour;
        return totalEmployeeWage;
    }
}