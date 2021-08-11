package com.bridgelabz;
//importing
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//creating a class

public class EmployeePayrollService{
    List<EmployeePayroll> employeeData = new ArrayList();

    public static void main(String args[]) {
        /*
        creating object of service
         */
        EmployeePayrollService service = new EmployeePayrollService();
        Scanner consoleReader = new Scanner(System.in);

        service.readEmployeeData(consoleReader);
        service.writeEmployeeData();
    }
              /*
                creating a method for read Employee data
             */
    public void readEmployeeData(Scanner consoleReader){
        System.out.print("Enter Employee ID: ");
        String empID = consoleReader.next();
        System.out.print("Enter Employee name: ");
        String empName = consoleReader.next();
        System.out.print("Enter Employee salary: ");
        double empSalary = consoleReader.nextDouble();

        employeeData.add(new EmployeePayroll(empID, empName, empSalary));
    }

    public void writeEmployeeData() {
        System.out.println(employeeData);
    }
}