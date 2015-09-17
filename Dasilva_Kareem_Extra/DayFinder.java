
/**
 * Find what day the person  Lives on
 * 
 * @author Kareem Dasilva
 * @version (a version number or a date)
 */

import java.util.*;
public class DayFinder {

public static void main(String[] args) {


int year = 1988; //year
int month = 5; //Month number
String monthConversion = "September"; // Month in english
int day = 13; // day of the month
int calculation = ((day + (day*((month+9) % 12 + 1)-1)/month + year % 100
 + year/400/4 + year/400 - 2*(year/100))%7 + 7) % 7 + 1 ; //Zellar Formula
 

System.out.println(monthConversion + ", " + day + " "+ year); // Prints the date
System.out.println     ("The day it fell on is " + calculation); // prints the day it fell on

    }
}