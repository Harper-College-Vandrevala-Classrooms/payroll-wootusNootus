package com.csc;

import java.util.Scanner;

public class Payroll 
{
  public static void main(String[] args)
  {
    // Getting input
    System.out.println("Welcome to the Payroll Calculator!");
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEnter the number of hours you've worked: ");
    double hoursWorked = scanner.nextDouble();

    System.out.println("\nEnter the number of dependents you have: ");
    int numDependents = scanner.nextInt();

    scanner.close();

    // Calculating output
    PayrollCalc calc = new PayrollCalc();

    double grossPay = calc.grossPay(hoursWorked);
    double deductions = calc.deductions(grossPay, numDependents);
    double netPay = grossPay - deductions;

    // Printing output
    PayrollPrint printer = new PayrollPrint();
    printer.printBasePay(hoursWorked, grossPay);
    printer.printNetPay(numDependents, grossPay, netPay);

    System.out.println("\nThank you for using the Payroll Program!");
  }
}
