
/**
 * Kareem Dasilva
 */
import java.util.*;
 public class FactorialLab {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the n: ");
       int numberInput = input.nextInt();
       int factorN = factorial(numberInput);
       System.out.println("factorial is " + numberInput + " is " + factorN);
   }

   public static int factorial(int number) {
       int problem = 1;
       for (int i = 1; i <= number; i++) {
           problem = problem * i;
       }
       return problem;
   }
}
