
/**
 * Write a description of class CoinFlip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinFlip
{
    //coin flip method
    public static int flip(int amoutOfFlips, int heads){
       
           //tried to use recursion and failed.
       
        
        while(amoutOfFlips != 100000){
             int randomNumber = (int)(Math.random() + .5);
            amoutOfFlips++;
                 if (randomNumber == 1 ){
                heads++;
                System.out.println(heads);
            }
        }
        return heads;
        
    }
    public static void main(String[]args){
        int flipAmount = 0;
        int amtOfHeads = 0;
        System.out.println(flip(flipAmount, amtOfHeads));
        
        
    }
    
}
