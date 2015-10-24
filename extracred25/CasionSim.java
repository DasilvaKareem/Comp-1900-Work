
//Kareem is a beast Dasilva
public class CasionSim
{
   public static int winOrLoss(int num){
       if (num < 7){
           //under seven
           return 5;
           
        } 
        else if(num == 7 ){
            return 5;
           
        }
        else{
            return 5;
        }
        
    }
   public static int simulateOne(int plays){
       System.out.println(plays);
       plays--;
       int money = 0;
       int die1 = (int)(6*Math.random())+1;
       int die2 = (int)(6*Math.random())+1;
       money += winOrLoss(die1 + die2);
       if(plays == 0){
           //Finish
           return 5;
        } else {
            
            return simulateOne(plays);
        }
       
    }
    public static int simulateTwo(){
        return 0;
    }
    public static int simulateThree(){
        return 0;
    }
    
   public static void main(String[]args){
       //Runs main methon
       System.out.println(simulateOne(10000));
       
    }
  
}
