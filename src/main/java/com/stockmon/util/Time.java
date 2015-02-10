package com.stockmon.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Kory
 */
public class Time {

    public static final DateFormat YYYYMMDD_FORMAT =
        new SimpleDateFormat( "yyyyMMdd" );
    public static final DateFormat MDY_FORMAT =
        new SimpleDateFormat( "MM/dd/yyyy" );
    public static final DateFormat YYYY_MM_DD_FORMAT =
        new SimpleDateFormat( "yyyy-MM-dd" );
    public static final DateFormat UTC_FORMAT =
        new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssZ" );

    public static boolean sameDay (Date aDate, Date bDate)
    {
        Calendar aCal = new GregorianCalendar();
        Calendar bCal = new GregorianCalendar();
        aCal.setTime(aDate);
        bCal.setTime(bDate);
        return sameDay(aCal, bCal);
    }

    public static boolean sameDay (Calendar aCal, Calendar bCal)
    {
        if ( aCal.get(Calendar.DATE) == bCal.get(Calendar.DATE) &&
             aCal.get(Calendar.MONTH) == bCal.get(Calendar.MONTH) &&
             aCal.get(Calendar.YEAR) == bCal.get(Calendar.YEAR) )
            return true;
        return false;
    }

    /**
     * Determines the absolute last day of the provided month (ignoring holidays and weekends).
     * 
     * @param   date    A date for a day within the month for which to retrieve the last day.
     * @return          The date of the last day of the month.
     */
    public static Date getMonthEnd (Date date)
    {
        Calendar myCal = GregorianCalendar.getInstance();
        myCal.setTime(date);
        // get first day of next month
        myCal.set(Calendar.DAY_OF_MONTH, 1);
        myCal.set(Calendar.HOUR_OF_DAY, 0);
        myCal.set(Calendar.MINUTE, 0);
        myCal.set(Calendar.SECOND, 0);
        myCal.set(Calendar.MILLISECOND, 0);
        myCal.add(Calendar.MONTH, 1);
        // get previous day
        myCal.add(Calendar.DATE, -1);
        return myCal.getTime();
    }

    public static String toYYYYMMDD ()
    {
        return toYYYYMMDD( new Date() );
    }

    public static String toYYYYMMDD (Date aDate)
    {
        return YYYYMMDD_FORMAT.format( aDate );
    }

    public static String toYYYY_MM_DD (Date aDate)
    {
        return YYYY_MM_DD_FORMAT.format( aDate );
    }

    public static String toUTC ()
    {
        return toUTC( new Date() );
    }

    public static String toUTC (Date aDate)
    {
        // return asOfUTC String (yyyy-MM-dd'T'HH:mm:ss.SSSZ)
        String tempUTC = UTC_FORMAT.format( aDate );
        int tempUTCLen = tempUTC.length();
        // add ':' before minutes in Time Zone.
        StringBuffer sbUTC = new StringBuffer();
        sbUTC.append( tempUTC.substring(0,tempUTCLen-2) )
             .append( ":" )
             .append( tempUTC.substring(tempUTCLen-2) );

        return sbUTC.toString();
    }

    public static String fromUTC ( String aString )
    {
        String re1 = "T";
        String re2 = "-";
        String [] temp = aString.split(re1);
        temp = temp[0].split(re2);
        return temp[0]+temp[1]+temp[2];
    }

    public static Date parseTimestamp ( String timestamp )
    {
        int tsLen = timestamp.length();
        if (timestamp.lastIndexOf(":") == tsLen-3) {
            timestamp = timestamp.substring(0,tsLen-3) +
                        timestamp.substring(tsLen-2);

            try
            {
                return UTC_FORMAT.parse( timestamp );
            } catch(java.text.ParseException pEx) {
                return null;
            }
        } else 
            if (timestamp.lastIndexOf("/") == tsLen-5) {
                try
                {
                    return MDY_FORMAT.parse( timestamp );
                } catch(java.text.ParseException pEx) {
                    return null;
                }
            } else {
                try
                {
                    return YYYY_MM_DD_FORMAT.parse( timestamp );
                } catch(java.text.ParseException pEx) {
                    return null;
                }                
            }
    }
    /* 
     * http://www.coderanch.com/t/381676/java/java/number-months-between-two-given
     */
    public static int monthsBetween(Date endDate, Date startDate)  //Date minuend, Date subtrahend
    {          
        /*
        Calendar cal = Calendar.getInstance();  
        // default will be Gregorian in US Locales  
        cal.setTime(minuend);  
        int minuendMonth =  cal.get(Calendar.MONTH);  
        int minuendYear = cal.get(Calendar.YEAR);  
        cal.setTime(subtrahend);  
        int subtrahendMonth =  cal.get(Calendar.MONTH);  
        int subtrahendYear = cal.get(Calendar.YEAR);  

        // the following will work okay for Gregorian but will not  
        // work correctly in a Calendar where the number of months   
        // in a year is not constant  
        return ((minuendYear - subtrahendYear) * cal.getMaximum(Calendar.MONTH)) +    
        (minuendMonth - subtrahendMonth);
        */
        //the following taken from http://stackoverflow.com/questions/16558898/get-difference-between-two-dates-in-months-using-java
        Calendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(startDate);
        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(endDate);

        int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
        int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
        return diffMonth;
    }  
     /**
     * removes the time portion from the provided date
     * 
     * @param   date    A datetime value to remove it's time portion
     * @return          The provided datetime with the time info removed
     */
   public static Date dateOnly(Date date)
    {
        // Get Calendar object set to the date and time of the given Date object  
        Calendar cal = GregorianCalendar.getInstance();  
        cal.setTime(date);  

        // Set time fields to zero  
        cal.set(Calendar.HOUR_OF_DAY, 0);  
        cal.set(Calendar.MINUTE, 0);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MILLISECOND, 0);  

        // Put it back in the Date object  
        return cal.getTime();          
    }    
}