
/**
 * Write a description of class PayCheck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class PayCheck
{
    
   public static void details(double hours, double payRate, double taxRate, double deductions) {
       //takes in hours, payrate, taxrate , and deudctions do some calclulations and returns basic salary info
       System.out.println("Number of hours " + hours );
       System.out.println("pay rate is " + payRate);
       System.out.println("tax rate is " + taxRate);
       System.out.println("your deductions are " + deductions);
       
       double grossPay = hours * payRate;
       double federalTax = grossPay/taxRate;
       double otherDeductions = deductions;
       double netPay = grossPay - federalTax - otherDeductions;
       
        System.out.println("Gross pay $" + grossPay);
       System.out.println("FederalTax $" + federalTax);
       System.out.println("your deductions are $" + deductions);
       System.out.println("Net pay $" + netPay );
       
       
       
    }
   
    public static void main(String[]args){
        double userHours; //the amount of hours the user entered
        double userPayRate; 
        double userTaxRate;
        double userDeductions;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter amount of hours worked");
        userHours = Integer.parseInt(scan.nextLine()); //makes users hours into intgers
        System.out.println("Please enter pay rate");
        userPayRate = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter tax rate percentage");
        userTaxRate = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter other deductions");
        userDeductions = Double.parseDouble(scan.nextLine());
        details(userHours,userPayRate,userTaxRate,userDeductions);
        
    }
}
