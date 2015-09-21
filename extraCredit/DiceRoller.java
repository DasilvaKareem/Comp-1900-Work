
/**
 * Write a description of class DiceRoller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiceRoller
{
    public static void main(String[]args){
        
      
        System.out.println("play Craps!");
        craps(reRoll());      
        
       
    }
    public static int reRoll(){
        int dice1= (int)(6 * Math.random() + 1);
        int dice2 = (int)(6 * Math.random() + 1);
        return dice1 + dice2;
    }
    public static void craps(int score){
        switch (score) {
            case 7 : 
            System.out.println("you rolled " + score);
            System.out.println("you lose");
            break;
            
            case 11: 
            System.out.println("you rolled " + score);
            System.out.println("you lose");
            break;
            
            case 2 : 
            System.out.println("you rolled " + score);
            System.out.println("you win");
            break;
            
             case 3: 
             System.out.println("you rolled " + score);
            System.out.println("you win");
            break;
            
            case 12: 
            System.out.println("you rolled " + score);
            System.out.println("you neother win or lose play again");
            craps(reRoll());
            break;
            
            case 4:
            System.out.println("you rolled " + score);
            System.out.println("keep rolling");
            craps(reRoll());
            break;
            
            case 5 :
            System.out.println("you rolled " + score);
            System.out.println("keep rolling");
            craps(reRoll());
            break;
            
            case 6:
            System.out.println("you rolled " + score);
            System.out.println("keep rolling");
            craps(reRoll());
            break;
            
            case  8:
            System.out.println("you rolled " + score);
            System.out.println("keep rolling");
            craps(reRoll());
            break;
            
            case  9:
            System.out.println("you rolled " + score);
            System.out.println("keep rolling");
            craps(reRoll());
            break;
            
            case 10:
            System.out.println("you rolled " + score);
            System.out.println("keep rolling");
            craps(reRoll());
            break;
            
        }
    }
}
