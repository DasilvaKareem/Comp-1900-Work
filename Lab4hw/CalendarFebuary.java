import java.util.Scanner;

public class CalendarFebuary {
    public static void main(String[] args) {
        
        System.out.println("Enter the day of the week that Jan. 1 fell on: (0 = Sunday, 1 = Monday. . .)");
        
        System.out.println("February");
        System.out.println("----------");
        System.out.println("S   M   T   W   R   F   S");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        int count = 0;
        while((answer< 0)||(answer>6)){
            System.out.println("Yo  u have entered an incorrect date, please try again:");
            answer = input.nextInt();
        }
            answer += 3; //This adds the algrothim to the method
            count+=answer;
            String tabSpace = "";
            //Create the amount of tabs to 
            for(int j=0;j<answer;j++){
                tabSpace+= "\t";
            }
            System.out.print(tabSpace);
            
            for (int i = 1; i <= 28; i++) {
                count++;
                System.out.print(i);
                
                if (count < 7) {        
                    System.out.print("\t");
                }
                if (count > 6) {
                            
                    System.out.println("\n");
                    count = 0;
                }
                
                


            }
        
        
        
        

    }
}
