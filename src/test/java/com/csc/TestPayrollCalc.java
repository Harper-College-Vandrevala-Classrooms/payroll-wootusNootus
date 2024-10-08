package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Tests not applicable with new user input for pay rate 
public class TestPayrollCalc 
{
  PayrollCalc calc;
  DecimalFormat df = new DecimalFormat("#.##");

  @BeforeEach
  void setUp() {
    calc = new PayrollCalc();
  }

  @Test
  public void testOne() {
    assertEquals(503.4, df.format(calc.grossPay(30)));
  }

  @Test
  public void testTwo() {
    assertEquals(1132.65, df.format(calc.grossPay(45)));
  }

  @Test
  public void testThree() {
    assertEquals(0, df.format(calc.grossPay(0)));
  }

  @Test
  public void testFour() {
    assertEquals(150.85, df.format(calc.deductions(503.4, 2)));
  }

  @Test
  public void testFive() {
    assertEquals(170.85, df.format(calc.deductions(503.4, 3)));
  }
  
}
