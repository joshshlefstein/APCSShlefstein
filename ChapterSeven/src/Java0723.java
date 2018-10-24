// Java0723.java
// Payroll Case Study #1
// The first stage of the Payroll program has correct syntax and logic.
// However, there is no concern about any type of proper program design, 
// even to the degree that there is no program indentation.  This program is totally unreadable.
import java.util.Scanner;import java.text.*; public class Java0723 { public static void main (String args[])
{ Scanner keyboard = new Scanner(System.in); String a; double b,c,e,f,g,h,i,j,k; int d; DecimalFormat output 
= new DecimalFormat("$0.00"); System.out.println("\nPAYROLL CASE STUDY #1\n"); System.out.print("Enter Name  ===>>  ");										
a = keyboard.nextLine(); System.out.print("Enter Hours Worked  ===>>  "); b = keyboard.nextDouble(); 
System.out.print("Enter Hourly Rate   ===>>  "); c = keyboard.nextDouble(); System.out.print
("Enter Dependents    ===>>  "); d = keyboard.nextInt(); if (b > 40) { e = b - 40; k = 40 * c; j = e * c * 1.5; } 
else { k = b * c; j = 0; } g = k + j; switch (d) { case 0 : f = 0.295; break; case 1 : f = 0.249; break; case 2 : 
f = 0.187; break; case 3 : f = 0.155; break; case 4 : f = 0.126; break; case 5 : f = 0.100; break; default: 
f = 0.075; } i = g * f; h = g - i; System.out.println("\n\n"); System.out.println("Name:	      " + a);
System.out.println("Hourly rate:  " + output.format(c)); System.out.println("Hours worked: " + b);
System.out.println("Dependants:   " + d); System.out.println("Tax rate:     " + output.format(f));
System.out.println("Regular pay:  " + output.format(k)); System.out.println("Overtime pay: " + output.format(j));
System.out.println("Gross pay:    " + output.format(g)); System.out.println("Deductions:   " + output.format(i));
System.out.println("Net pay:      " + output.format(h)); System.out.println("\n\n"); } }

