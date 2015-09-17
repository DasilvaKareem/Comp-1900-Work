
/**
 * Write a description of class Lab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lab2
{
    private static String getSmurfCount(int one, int two){
            //Takes in two paremeters of the smurf population and compares and finds the diffrence
            String result; // empty string that will be the return result
           if (one < two) {
               int diffrence = two - one; // finds the difrence
              result = String.format("The smurf population increase from " + one + " to " + two + " it increased by "  + diffrence); //Convert statement into string
              return result;
            } else {
                int diffrence = one - two; //find the difrence
              result = String.format("The smurf population decrease by "  + one + " to " + two + " it decreased by " + diffrence); //converts statement into string
              return result;
            }
           
        }
    public static void main(String[]args) {
        ///basic F to C calclucations
        System.out.println(5/9*(87-32)); //converts F degree of 87 to x in INT
        System.out.println(5/9*(87.0-32)); //Converts F degrees of 87 to x in Double
        System.out.println((87.0-32)*5/9); // the order of operations is wrong which evaulates to 0
        System.out.println((87.0-32)*(5/9)); // Converts F degress to x in DOuble
        
        //Part 2:
        int secondsToConvert = 9804; //Fastest run speed of pokemon emerald
        int hoursOfRun = 9804/3600;
        int minutesOfRun = 9804 / 60 % 60;
        int seconds = 9804 % 60;
       System.out.println(hoursOfRun + ":" + minutesOfRun + ":" + seconds);
     
       
        
       
        //Part 3
        int maySmurfs = 73; //amount of smurfs
        int juneSmurfs = 80;
        int julySmurfs = 75;
        int augustSmurfs = 64;
        
        System.out.println(getSmurfCount(maySmurfs,juneSmurfs)); //diffrence with may and june
        System.out.println(getSmurfCount(juneSmurfs,julySmurfs)); // diffrence with june and july
        System.out.println(getSmurfCount(julySmurfs,augustSmurfs)); // diffrence wiith july august
        
        
        
        
        
    }
}
