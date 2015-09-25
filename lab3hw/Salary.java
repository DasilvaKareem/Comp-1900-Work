
/**
 * Write a description of class Salary here.
 * 
 * @author Kareem Dasilva 
 * @version RASENSHIRUKEN
 */
import java.util.*;
public class Salary
{
 public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int step;
         int grade;
         int salary;
         System.out.println("Enter your grade");
         grade = scan.nextInt();
         System.out.println("Enter your step");
         step = scan.nextInt();
         switch (grade){
             case 1:
             switch (step){
                 case 1:
                 salary = 17981;
                 System.out.println(salary);
                 break;
                 case 2:
                 salary = 18582;
                     System.out.println(salary);
                 break;
                 case 3:
                 salary = 19180;
                     System.out.println(salary);
                 break;
                 case 4:
                 salary = 19776;
                     System.out.println(salary);
                 break;
                 case 5:
                  salary = 20373;
                     System.out.println(salary);
                  break;
                 default:
                
                       System.out.println("invalid step");
                 break;
                 
             }
             break;
             
             case 2:
             switch (step){
                 case 1:
                 salary = 20217;
                     System.out.println(salary);
                 break;
                 case 2:
                 salary = 20698;
                     System.out.println(salary);
                 break;
                 case 3:
                 salary = 21367;
                     System.out.println(salary);
                 break;
                 case 4:
                 salary = 21934;
                     System.out.println(salary);
                 break;
                 case 5:
                     salary = 22179;
                     System.out.println(salary);
                 break;
                 default:
             
                   System.out.println("invalid step");
                 break;
             }
             break;
             
             case 3:
             switch (step){
                 case 1:
                 salary = 22058;
                     System.out.println(salary);
                 break;
                 case 2:
                 salary = 22793;
                     System.out.println(salary);
                 break;
                 case 3:
                 salary = 23528;
                     System.out.println(salary);
                 break;
                 case 4:
                 salary = 24263;
                     System.out.println(salary);
                 break;
                 case 5:
                  salary = 24498;
                     System.out.println(salary);
                  break;
                 default:
                    System.out.println("invalid step");
                 break;
             }
             break;
             default:
             System.out.println("invalid grade pick a better one noob");
             break;
            }
        
     
     
     
    }
}
