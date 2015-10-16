import java.util.*;
 //Kareem Dasilva

public class Parking{
    
	public static void main(String [] arg)
	{
		   Scanner input = new Scanner(System.in);
	       int minutes;
		   System.out.println("Enter the minutes parked:");
		   minutes = input.nextInt();
		   System.out.println("Hey nerd, pay $" + charge(minutes));
		
    } 
	
	public static int charge(int minutes){
	int amount;
     if ((minutes>0)&&(minutes<31)){
         amount = 0;
         return amount;
        }
        else if( ( minutes > 30 ) && (minutes < 61 ) ){
            amount = 2;
            return amount;
        }
        else if( ( minutes > 60 ) && ( minutes < 1440 ) ){
            amount = 3 + ((minutes-60)/30);
            return amount;
        }
        else {
            amount = 21;
            return amount;
        }
	}
	 
}
