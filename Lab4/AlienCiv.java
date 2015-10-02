
/**
 * Write a description of class AlienCiv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class AlienCiv
{
   
   public static void main(String[]args){
       int pinAmount = 1;
       int pinRows = 0;
       int pinCurrent = 0;
       while(pinRows != 8359){
           pinCurrent += pinAmount;
           pinAmount += 2;
           
           //System.out.println(pinAmount);
           pinRows++;
           
        }
        System.out.println(pinCurrent);
        System.out.println(pinRows);
        
        double number1;
        double number2;
        Scanner scan = new Scanner(System.in);
        final int Flag = -999;
        
        int count = 0;
        double sum = 0.0;
        double average;
        int finalNumber;
        System.out.println("Enter the numbers to be averaged");
        do{
            count++;
            sum += number1;
            number1 = scan.nextDouble();
        }while(number1 != Flag)
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();
        
          
            
        
        if (count > 0){
            average = sum/count;
            System.out.println("average");
        } else {
            
        }
        
      
    }
    
    
}
