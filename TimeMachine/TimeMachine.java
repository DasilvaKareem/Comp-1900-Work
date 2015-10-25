
/**

/**
 * Write a description of class TimeMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TimeMachine
{
    //this is general
    public static void main(String[]args){
        //main method
        int cont = 0;
        do{
        Scanner input = new Scanner(System.in);
        
        Calendar c = new GregorianCalendar();
       System.out.println(c.getTime());
       System.out.println(c.get(Calendar.YEAR));
       long locationSeconds = convertToSeconds(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH), c.get(Calendar.YEAR), c.get(Calendar.MINUTE) + 1, c.get(Calendar.HOUR) + 1, c.get(Calendar.SECOND +1));
       enterDate();
       System.out.println("Press 1 to leave time machine");
       cont = input.nextInt();
       
    }while(cont == 1);

    }
    public static void enterDate(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        int minute = input.nextInt();
        int hours = input.nextInt();
        int seconds = input.nextInt();
        if(errorCheck(day,month,year) == false){
            //everything is good 
            
            if(month == 1){
                month = 13;
            }
            if(month == 2){
                month = 14;
            }
            int century = year/100;
            int zellarYear = year % 100;
            System.out.println(getDay(zellerFormula(day,month,zellarYear,century)) + " " + getMonth(month) + " " + day + " " + year + " " + hours +":"+minute+":" + seconds );
            Calendar c = new GregorianCalendar();
            System.out.println(c.getTime());
            long locationSeconds = convertToSeconds(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH) + 1, c.get(Calendar.YEAR), c.get(Calendar.MINUTE), c.get(Calendar.HOUR), c.get(Calendar.SECOND) );
            long destinationSeconds = convertToSeconds(day,month,year,minute,hours,seconds);
            System.out.println(costOfTrip(locationSeconds, destinationSeconds));
        } else {
            System.out.println("nah");
        }
        
        
    }
    public static long convertToSeconds(int day, int month, int year, int minute, int hours, int seconds){
       int leapYearSeconds = (year/4) * 24 * 60 * 60;
       
       long totalSeconds = 0;
       long yearToSeconds = year * 365L * 24L * 60L * 60L;
       
       int monthToSecond = 0;
                for (int i = 1; i < month; i++)
                
                {
                    
                    if (i > 7 && i % 2 == 0){
                    //AUgust and after and even 
                     monthToSecond += 31 * 24 * 60 * 60;
                }
                else if (i > 7 && i % 2 != 0){
                    //AUgust and after and odd
                    monthToSecond += 30 * 24 * 60 * 60;
                }
                
                 else if (i < 8 && i % 2 != 0){
                    //Everything before August and odd
                   monthToSecond += 31 * 24 * 60 * 60;
                }
                else if (i < 8 && i % 2 == 0){
                    //Everything before August and even
                    monthToSecond += 30 * 24 * 60 * 60;
                }
            }
       int daysToSecond = day * 24 * 60 *60;
       int hoursToSeconds = hours * 60 * 60;
       int minutesToSeconds = minute * 60;
       totalSeconds = seconds + yearToSeconds + leapYearSeconds + monthToSecond + daysToSecond + hoursToSeconds + minutesToSeconds;
      
       return totalSeconds;
    }
    
    public static double costOfTrip(long location , long destination){
        long secondsToTravel = 0;
        double mgOfPluto = 0.0;
        if(location < destination){
            secondsToTravel = destination - location;
        } else {
            secondsToTravel = location - destination;
        }
        
        if( secondsToTravel > 283824000 ){
            //expensive trip
            mgOfPluto = ((secondsToTravel  % 283824000) * 0.001) + ((283824000-94608000)*0.002) + (94608000*0.005);
        } else if(secondsToTravel > 94608000 && secondsToTravel < 283824000){
            //in the middle upgrade cost
            mgOfPluto = ((secondsToTravel  % 94608000) * 0.002) + (0.005 * 94608000);
        } else {
            mgOfPluto = secondsToTravel * 0.005;
            //minium trip
        }
        return mgOfPluto + 500;
        
    }
    public static boolean errorCheck(int day, int month, int year){
        //checks if the day is valid
        boolean isError = false;
        isError = basicErrorCheck(day,month,year);
        if((year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0) ){
            //is leap year
            if (month == 2){
                //checks if feb
                
                    if(day < 1 || day > 29){
                    //non valid day
                    isError = true;
                }
            }
            
        } else {
            //not leap year
                isError = basicErrorCheck(day,month,year);
               if (month == 2){
                   //checks if feb
                    if(day < 1 || day > 28){
                    //non valid day
                    isError = true;
                }
            }
        }
        return isError;
    }
    public static boolean basicErrorCheck(int day, int month, int year){
        boolean isError = false;
        if (year < 1500 || year > 2200){
            //checks if year constraints are gud!
            isError = true;
                 if (month < 1 || month > 12){
                //all of the normal months
                
                isError = true;
                //TODO AManda work 
                if (month > 7 && month % 2 == 0){
                    //AUgust and after and even 
                         if (day < 1 || day > 31){
                        isError = true;
                    }
                }
                if (month > 7 && month % 2 != 0){
                    //AUgust and after and even
                         if (day < 1 || day > 30){
                        isError = true;
                        
                    }
                }
                
                 if (month < 8 && month % 2 != 0){
                    //Everything before August and odd
                         if (day < 1 || day > 31){
                        isError = true;
                    }
                }
                if (month < 8 && month % 2 == 0){
                    //Everything before August and odd
                         if (day < 1 || day > 30){
                        isError = true;
                        
                    }
                }
            }
                //end
            }
        return isError;
        }
    public static String getMonth(int koolaid)
    {   
        String month = "";
        switch(koolaid){
        case 1:
        month = "January";
        break;
        case 2:
        month = "February";
        break;
        case 3:
        month = "March";
        break;
        case 4:
        month = "April";
        break;
        case 5:
        month = "May";
        break;
        case 6:
        month = "June";
        break;
        case 7:
        month = "July";
        break;
        case 8:
        month = "August";
        break;
        case 9:
        month = "September";
        break;
        case 10:
        month = "October";
        break;
        case 11:
        month = "November";
        break;
        case 12:
        month = "December";
        break;
    }
    return month;
    }
   public static String getDay(int days)
   {
       String weekday = "";
        switch(days){
        
        case 0: 
        weekday = "Saturday";
        break;
        case 1: 
        weekday = "Sunday";
        break;
        case 2: 
        weekday = "Monday";
        break;
        case 3: 
        weekday = "Tuesday";
        break;
        case 4: 
        weekday = "Wednesday";
        break;
        case 5: 
        weekday = "Thursday";
        break;
        case 6: 
        weekday = "Friday";
        break;
    }
    return weekday;
}
    public static int zellerFormula(int day, int month, int year, int century){
        //returns the day of the week
      int dayOfTheWeek = (day + (int)((13 * (month+1))/5) + year + (int)(year/4) + (int)(century/4) + (5*century)) % 7;
      return dayOfTheWeek;
    }
    
}
