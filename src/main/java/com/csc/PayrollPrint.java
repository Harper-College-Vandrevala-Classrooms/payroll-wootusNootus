package com.csc;

import java.text.DecimalFormat;

public class PayrollPrint 
{
    DecimalFormat df = new DecimalFormat("$#.##");
    DecimalFormat dollarf = new DecimalFormat("$#.##");
    
    public void printBasePay(double hoursWorked, double grossPay)
    {
        System.out.println("\nPayroll:");

        System.out.println("\n Hours: " + df.format(hoursWorked));
        System.out.println("  Rate: 16.78 $/hr");
        System.out.println(" Gross: " + dollarf.format(grossPay));
    }

    public void printNetPay(int numDependents, double grossPay, double netPay)
    {
        System.out.println("\nSocSec: " + dollarf.format(grossPay * 0.06));
        System.out.println("FedTax: " + dollarf.format(grossPay * 0.14));
        System.out.println(" StTax: " + dollarf.format(grossPay * 0.05));
        System.out.println(" Union: $10.00");
        System.out.println("   Ins: " + (numDependents >= 3 ? "$35.00" : "$15.00"));

        System.out.println("\n   Net: " + dollarf.format(netPay));
    }
}