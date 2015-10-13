
/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RandomPicker
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            int answer;
            
            do 
            {
                System.out.println("OK, I am thinking of a number between 1 and 100. You will have five guesses.");
                int number = (int)(100*Math.random())+1; //assigns the variable number to a random value
                int guess; //user input for guess
                int numGuesses = 0;//variable for number of guesses
                int remGuesses = 5;//variable for remaining guessses
                do
                {
                    System.out.print("Your guess: ");
                    guess = input.nextInt();
                    numGuesses++; //counter for number of  guesses
                    remGuesses--;//counter for remaining guesses. Subtracts 
                    if(guess>number){
                        if(guess>100){System.out.println("Please enter a number between 1 and 100");
                            numGuesses--;
                            remGuesses++;
                        }
                        if((guess>number)&&(guess<=100)&&(guess>=1))
                        System.out.println("your guess is too high " + remGuesses + " amount of gueses.");
                    }
                   else if(guess<number){
                        if((guess<number)&&(guess<=100)&&(guess>=1)){
                            System.out.println("pick higher too low " + remGuesses + " amount of guesses.");
                        }
                        if((guess<1)){
                         System.out.println("Please enter a number between 1 and 100");
                         numGuesses--;
                         remGuesses++;
                        }
                    }
                    if(guess == number)
                        System.out.println("That's it! It only took you " + numGuesses + " tries!");
                    } while(number!=guess&&numGuesses<5);
                if(numGuesses==5){
                        System.out.println("The correct number was " + number + " You lose, try again next time?");
                }
                do 
                {
                    System.out.print("Play again? 1 for YES; 0 for NO: ");
                    answer = input.nextInt();
                    System.out.println();
                }while (answer!=0 && answer !=1);
                    
                }while(answer == 1);
                System.out.println("Thanks for playing :)");
                
            }
}
