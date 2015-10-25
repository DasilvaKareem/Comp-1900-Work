
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

public  class TimeMachine
{
    //this is general
    static long  locationSeconds;
    public static void main(String[]args){
        //main method
        int cont = 0;
        double plutLevels = 20000000;
         Calendar c = new GregorianCalendar();
        System.out.println("The current time is: " + c.getTime() );
        locationSeconds = 0;
        do{
            Scanner input = new Scanner(System.in);
               
           
         
            

            plutLevels = enterDate(plutLevels,locationSeconds);
            System.out.println("Shall we go on another adventure? Press 1 to use the time machine again!");
            cont = input.nextInt();

        }while(cont == 1);
        System.out.println("It was a nice ride see ya!");
    }

    public static double enterDate(double plutLevels, long longSeconds){
         System.out.println("Enter the destination you want to travel to " );
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = input.nextInt();
        System.out.println("Enter the month: ");
        int month = input.nextInt();
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the hour: ");
        int hours = input.nextInt();
        System.out.println("Enter the minute: ");
        int minute = input.nextInt();
        System.out.println("Enter the second: ");
        int seconds = input.nextInt();
        if(errorCheck(day,month,year, hours, minute, seconds) == false){
            //everything is good 
            int century = year/100;
            int zellarYear = year % 100;
            
            long destinationSeconds = 0;
            String destDate;
            String locationDate;

          
            
            if(longSeconds == 0){
                  Calendar c = new GregorianCalendar();
                 longSeconds = convertToSeconds(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH) + 1, c.get(Calendar.YEAR), c.get(Calendar.MINUTE), c.get(Calendar.HOUR), c.get(Calendar.SECOND) );
            }

            destinationSeconds = convertToSeconds(day,month,year,minute,hours,seconds);

            if(month == 1){
                month = 13;
            }
            if(month == 2){
                month = 14;
            }
            if ((costOfTrip(locationSeconds, destinationSeconds)) > plutLevels){
                //not enough gas to make it back
                if (2 * (costOfTrip(locationSeconds, destinationSeconds)) > plutLevels){
                    System.out.println("Oh, no! It looks like you don't have enough Plutonium to make it to your destination and back! Perhaps we should take a shorter trip, eh?");
                }
                //not enough gas to get there at all
                if (costOfTrip(locationSeconds, destinationSeconds) > plutLevels) {
                    System.out.println("Oh, no! It looks like you don't have enough Plutonium to make it to your destination! Perhaps we could take a shorter trip, eh?");
                }

            }else{
                //if you have enough fuel to travel
                
                System.out.println("And awaaaaay we go!");
                destDate = ""+getDay(zellerFormula(day,month,zellarYear,century)) + " " + getMonth(month) + " " + day + " " + year + " " + hours +":"+minute+":" + seconds+"";
                System.out.println(destDate );
                System.out.println("Cost of Trip: " + (costOfTrip(locationSeconds, destinationSeconds)) + "mg of Plutonium");
                System.out.println(((plutLevels - (costOfTrip(locationSeconds, destinationSeconds))) / 1000000) + "kg of Plutonium remaining");
                locationDate = destDate;
                locationSeconds = destinationSeconds;
                System.out.println("The current time is: " + locationDate);
               return  plutLevels - (costOfTrip(locationSeconds, destinationSeconds));  
            }

        } else {
            System.out.println("The date that you entered doesn't seem to exist.");
        }
        return 0.0;
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

    public static boolean errorCheck(int day, int month, int year , int hour, int minute, int seconds){
        //checks if the day is valid
        boolean isError = false;
        isError = basicErrorCheck(day,month,year,hour,minute,seconds);
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
            isError = basicErrorCheck(day,month,year,hour,minute,seconds);
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

    public static boolean basicErrorCheck(int day, int month, int year ,int hour, int minute, int seconds){
        boolean isError = false;
        
         if (hour < 1 || hour > 24){
                            isError = true;
                        
        }
           if (minute < 1 || minute > 60){
                                isError = true;
        }
        if (seconds < 1 || seconds > 60){
            isError = true;
        }
        if (month < 1 || month > 12){
            isError = true;
        }
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
                        if (hour < 1 || hour > 24){
                            isError = true;
                            if (minute < 1 || minute > 60){
                                isError = true;
                            }
                        }

                    }
                }

                if (month < 8 && month % 2 != 0){
                    //Everything before August and odd
                    if (day < 1 || day > 31){
                        isError = true;
                        if (hour < 1 || hour > 24){
                            isError = true;
                            if (minute < 1 || minute > 60){
                                isError = true;
                            }
                        }
                    }
                }
                if (month < 8 && month % 2 == 0){
                    //Everything before August and odd
                    if (day < 1 || day > 30){
                        isError = true;
                        if (hour < 1 || hour > 24){
                            isError = true;
                            if (minute < 1 || minute > 60){
                                isError = true;
                            }
                        }

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
