
 // Kareem Dasilva
 
import java.util.*;
public class QuaduradticProblem {

    public static void main(String[] args)
    {
        double aInput;
        double bInput;
        double cInput;
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is A");
         aInput = input.nextDouble();
        System.out.println("What is B ");
         bInput = input.nextDouble();
        System.out.println("What is C");
         cInput = input.nextDouble();
        printRealRoots(aInput, bInput, cInput);

      

        
    }
    
    public static void printRealRoots(double a, double b, double c){
        double a1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double a2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        if (Double.isNaN(a1) || Double.isNaN(a2)){
            System.out.println("Answer contains imaginary numbers");
        } else {
            System.out.println("The values are: " + a1 + ", " + a2);
        }
    }
}
