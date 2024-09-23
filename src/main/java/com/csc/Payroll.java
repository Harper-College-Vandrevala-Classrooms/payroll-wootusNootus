package com.csc;

import java.util.Scanner;

public class Payroll 
{
  public static void main(String[] args)
  {
    // Getting input
    System.out.println("Welcome to the Payroll Calculator!");
    Scanner scanner = new Scanner(System.in);

    double payRate = -1;
    while (payRate < 0) 
    {
        System.out.println("\nEnter your pay rate (must be non-negative): ");
        payRate = scanner.nextDouble();

        if (payRate < 0) 
        {
            System.out.println("Error: Pay rate cannot be negative. Please enter a valid rate.");
        }
    }

    System.out.println("\nEnter the number of hours you've worked: ");
    double hoursWorked = scanner.nextDouble();

    System.out.println("\nEnter the number of dependents you have: ");
    int numDependents = scanner.nextInt();
    if (numDependents < 0) 
    {
      numDependents = 0; 
    }

    scanner.close();

    // Calculating output
    PayrollCalc calc = new PayrollCalc();

    double grossPay = calc.grossPay(hoursWorked, payRate);
    double deductions = calc.deductions(grossPay, numDependents);
    double netPay = grossPay - deductions;

    // Printing output
    PayrollPrint printer = new PayrollPrint();
    printer.printBasePay(hoursWorked, grossPay, payRate);
    printer.printNetPay(numDependents, grossPay, netPay);

    System.out.println("\nThank you for using the Payroll Program!");
  }
}
