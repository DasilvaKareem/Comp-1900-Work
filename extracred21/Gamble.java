
/**
 * Write a description of class Gamble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Gamble
{
    public static void main(String[]args){
        //lol
        Scanner input = new Scanner(System.in);
        int bet;
        int wager = 1;
        int die1;
        int die2;
        int i = 0;
        int sim1Result = 0;
        int sim2Result = 0;
        int sim3Result = 0;
        
        while(i != 10000){
            //
            i++;
            
            die1 =  (int)(6*Math.random() + 1);
            die2 =  (int)(6*Math.random() + 1);
            sim1Result += sim1(die1 + die2, i);
            sim2Result += sim2(die1 + die2);
            sim3Result += sim3(die1 + die2);
        }
        System.out.println("the result of simulation3 is: " + sim1Result);
        
        System.out.println("The result of simulation2 is: " + sim2Result);
        System.out.println("The result of simulation1 is: " + sim3Result);
        if(sim1Result < 0){
            System.out.println("sim3 lost ");
        }
        if(sim2Result < 0){
            System.out.println("sim2 lost ");
        }
        if(sim3Result < 0){
            System.out.println("sim1lost ");
        }
        int sum;
  
    }
    public static int sim1(int betNumber, int amt){
        //
        int money = 0;
        if(betNumber > 7 && amt < 4000){
            //its going to be cool
            money = 1;
        }
        else if(betNumber < 7 && amt > 4000 && amt < 8000){
            //its going to be cool
            money = 1;
        }
         else if(betNumber == 7 && amt > 8000){
            //its going to be cool
            money = 4;
        } else {
            money = -1;
        }
        return money;
    }
    public static int sim2(int betNumber){
        //
        int money = 0;
         if(betNumber > 7){
            //its going to be cool
            money = 1;
        } else {
            money = -1;
        }
        return money;
        
    }
    public static int sim3(int betNumber){
        int bet = (int)(3*Math.random() + 1);
        int money = 0;
         if(betNumber < 7 && bet == 1 || betNumber > 7 && bet == 2){
            //its going to be cool
            money = 1;
            
        } else if(betNumber == 7 && bet ==3){
            money = 4;
        }  else {
            money  = -1;
        }
        return money;
    }
    
}
