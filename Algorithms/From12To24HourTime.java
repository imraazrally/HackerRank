import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //Reading time for Standard Input
        Time timeOfDay=new Time(new Scanner(System.in).nextLine());
        //Display Output
        System.out.println(timeOfDay.get24HourTime());
    }
    
}

class Time{
    int hour;
    int min;
    int sec;
    String period; //AM-PM
    
    public Time(String time){
        //Retreiving the Hour as Integer
        hour=Integer.parseInt(time.substring(0,2));
        //Retrieveing the Minute as Integer {Although In this example we don't need to make adjustment's to the minute}
        min=Integer.parseInt(time.substring(3,5));
        //Retrieveing the Seconds as Integer {Although In this example we don't need to make adjustment's to the minute}
        sec=Integer.parseInt(time.substring(6,8));
        //AM/PM
        period=time.substring(8,10);
    }
    
    public String get24HourTime(){
        /*Core of the Login for Conversion from AM/PM to 24-hour*/
        if(hour==12 && period.equals("AM"))hour=0;
        if(period.equals("PM") && hour>=1 && hour<12) hour+=12;
            
        return String.format("%02d:%02d:%02d",hour,min,sec);
    }
}