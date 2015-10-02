
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
        System.out.println("amount of pins: " + pinCurrent);
        System.out.println("Amount of rows " + pinRows);
        
        double number1;
        double number2;
        Scanner scan = new Scanner(System.in);
        final int Flag = 999;
        
        int count = 0;
        double sum = 0.0;
        double average;
        int finalNumber;
        System.out.println("Enter the numbers to be averaged");
        number1 = scan.nextDouble();
        
       
           
            
        
       
        while(number1 != Flag){
                double min = number1;
              
             count++;
            
           
           number1 = scan.nextDouble();
           if (number1 < min){
               number1 = min;
            } else {
                 sum  += number1;
            }
            
        }
         if (count > 1){
            sum -= 999;
            average = sum/count;
            System.out.println("average " + average);
            System.out.println("play again enter 1");
            number1 = scan.nextDouble();
            if (number1 == 1){
                 while(number1 != Flag){
              double min = number1;
              
             count++;
            
           
           number1 = scan.nextDouble();
           if (number1 < min){
               number1 = min;
            } else {
                 sum  += number1;
            }
            
                 }
                 if (count > 1 ){
                       average = sum/count;
            System.out.println("average " + average);
                    } else {
                         System.out.println("Nothing was entered or you entered only one number");
                    }
            }
        } else {
            System.out.println("Nothing was entered or you entered only one number");
        }
        
        
          
            
        
        
        
      
    }
    
    
}
