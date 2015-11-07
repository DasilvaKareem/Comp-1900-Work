
/**
 * Write a description of class HomeWork here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class HomeWork
{
  public static void main(String[]args){
      //partioning an array
        Scanner input = new Scanner(System.in);
        double[] inputDoubles;
        
        System.out.println("enter double cap");
        int size = input.nextInt();
        inputDoubles = new double[size];
        for (int i = 0; i < inputDoubles.length; i++){
            //adds values to the array
           System.out.println("Enter double value for " + i + ":");
           
            inputDoubles[i] = input.nextDouble();
            
        }
        double[] result = partition(inputDoubles);
           for (int i = 0; i < result.length; i++){
            //adds values to the array
           System.out.println("the value is " + result[i]);
        }
        
        //pt 2
        double totalTime = 0.0;
        for(int p = 0; p < 1000 ; p++){
               double[] random100 = new double[100000];
         double time = System.currentTimeMillis();
        for (int i = 0 ; i < random100.length ; i++){
             
            int rand = (int)(100000*Math.random())+1;
            random100[i] = rand;
        }
       
        timelasped(random100);
        double endTime = System.currentTimeMillis();
        totalTime += (endTime - time);
          //System.out.println("the time to run this alogrthim is: " + (endTime - time));
        }
        
        System.out.println("the average is " + totalTime/1000);
     
      
  }
  public static double[] partition(double[] inputDouble){
      //
      double pivot = inputDouble[0];
      double[] lesser;
      int lessers = 0;
      double[] greater;
      int greaters = 0;
      for(int i = 0; i < inputDouble.length ; i++){
          //goes through
          if (inputDouble[i] < pivot){
              // do something to lesser
              lessers++;
          } else if(inputDouble[i] > pivot){
              greaters++;
            }
        }
    
        lesser = new double[lessers];
        greater = new double[greaters];
         int d = 0;
          int l = 0;
       for(int i = 0; i < inputDouble.length ; i++){
          //goes through
         
          if (inputDouble[i] < pivot){
              // do something to lesser
              
              lesser[d] = inputDouble[i];
              d++;
          } else if(inputDouble[i] > pivot){
                 greater[l] = inputDouble[i];
              l++;
            }
        }
        
        double[] returnArray =  new double[inputDouble.length];
        int p = 0;
        for (int i = 0 ; i < lesser.length; i++){
                
                returnArray[p] = lesser[i];
                p++;
        }
      
       returnArray[p] = pivot;
       p++;
       for (int i = 0 ; i < greater.length; i++){
                returnArray[p] = greater[i];
                p++;
        }
        return returnArray;
    }
    public static double[] timelasped(double[] a){
        //
        
            //
            double pivotValue = a[0];
            int j = 0;
            a[0] = a[a.length - 1];
            a[a.length-1] = pivotValue;
            
            for (int i = 0; i < a.length-1; i++){
                //
                if(a[i] < pivotValue){
                    double temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    
                    j++;
                }
            }
            double temp = a[j];
            a[j] = a[a.length-1];
            a[a.length-1] = temp;
            return a;
        
    }
}
