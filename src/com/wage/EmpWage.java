package com.wage;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program !! ");
        int is_fullTime_present = 1;
        int is_partTime_present = 2;
        int daily_wage;
        int wage_per_hr = 20;
        int working_hr;
        int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;
        switch (emp_check) {
            case 1:
                System.out.println("Employee is full time present");
                working_hr = 8;
                break;
            case 2:
                System.out.println("Employee is part time present");
                working_hr = 4;
                break;
            default:
                System.out.println("Employee is absent");
                working_hr = 0;
        }
        daily_wage = working_hr * wage_per_hr;
        System.out.println("Employee daily wage is " + daily_wage);
    }


    }

