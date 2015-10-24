
/**
 * Write a description of class Lab6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Lab6
{
    public static double[] getArrayStats(double[] inputDouble){
        //fetch array stats for the array inserted
        double[] returnArray = new double[3];
        double min = 0.0;
        double max = 0.0;
        double avg = 0.0;
        //finds minium value of arrayu
        for(int i = 0; i<inputDouble.length; i++){
            //loops
           
            if(inputDouble[i] < min){
                //does condtionial gets minium
                min = inputDouble[i];
            }
            if (inputDouble[i] > max){
                //gets maxium
                max = inputDouble[i];
            }
            //adds all the numbers
            avg += inputDouble[i];
            
        }
        //sets the min max avg into a new array
        returnArray[0] = min;
        returnArray[1] = avg/inputDouble.length;
        returnArray[2] = max;
        System.out.println(min);
        System.out.println(avg/inputDouble.length);
        System.out.println(max);
        return returnArray; //something
    }
    public static int[] readFriendIds(){
        //creats a list of friends ids
        Scanner input = new Scanner(System.in);
        int[] friendIDs;
        
        System.out.println("How many friends do you wants");
        int size = input.nextInt();
        friendIDs = new int[size];
        for (int i = 0; i < friendIDs.length; i++){
            //adds values to the array
           System.out.println("Enter friend Id " + i + ":"); 
           
            friendIDs[i] = input.nextInt();
            
        }
        
        return friendIDs;
        
    }
    public static void displayCommonFriendIds(int[] friendA, int[] friendB){
        //this is guy
        int commonFriends = 0;
         for (int i = 0; i < friendA.length; i++){
            //adds values to the array
           int commonFriend = friendA[i];
             for (int j = 0; j < friendB.length; j++){
            //adds values to the array
            if (commonFriend == friendB[j] ){
                commonFriends++;
            }
            
        }
            
        }
        System.out.println(commonFriends);
        
       
    }
    public static void main(String[]args){
        //main method 
         Scanner input = new Scanner(System.in);
        double[] inputDoubles;
        
        System.out.println("enter double cap");
        int size = input.nextInt();
        inputDoubles = new double[size];
        for (int i = 0; i < inputDoubles.length; i++){
            //adds values to the array
           System.out.println("Enter double " + i + ":"); 
           
            inputDoubles[i] = input.nextDouble();
            
        }
        getArrayStats(inputDoubles);
        int[] friendA = readFriendIds();
        int[] friendB = readFriendIds();
        displayCommonFriendIds(friendA, friendB);
        
    }
}
