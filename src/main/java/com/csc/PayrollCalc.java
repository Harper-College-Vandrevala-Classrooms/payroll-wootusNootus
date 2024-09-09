package com.csc;

public class PayrollCalc 
{
    public double grossPay(double hoursWorked)
    {
        return hoursWorked > 40 ? hoursWorked * 16.78*(1.5) : hoursWorked * 16.78;
    }

    public double deductions(double grossPay, int numDependents)
    {
        return ((0.06)*grossPay // Social security tax rate
                          + (0.14)*grossPay // Federal income tax rate
                          + (0.05)*grossPay // State income tax rate
                          + 10              // Union dues
                          + (numDependents >= 3 ? 35 : 15)); // Group insurance program 
    }
}
