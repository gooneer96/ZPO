package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class DateChecker {

    long worldWarTwo(LocalDate d1, LocalDate d2){

        long diff = ChronoUnit.DAYS.between(d1,d2);
        System.out.println(" Answer for a) : " + diff);
        return diff;
    }

    void whichDayAndMonth(LocalDate d){

        System.out.println(" Answer for b) Month: " + d.getMonthValue() + " and Day: " + d.getDayOfMonth());
    }

    int countSum(LocalDateTime d, LocalDateTime d1){

        if(d.compareTo(d1)>=0)
            throw new IllegalArgumentException("First date cannot be after or equal to second date");
        int hours= d.getHour();
        int minutes=d.getMinute();
        int buf=0;
        int hoursFirstDigit,hoursSecondDigit,minutesFirstDigit,minutesSecondDigit;
        for(int i= hours;i<=d1.getHour();i++) {
            if(i>9) {
                hoursFirstDigit = i % 10;
                hoursSecondDigit = i / 10;
            }
            else{
                hoursFirstDigit=i;
                hoursSecondDigit=0;
            }
            if(i==d1.getHour()){
                for (int j = minutes;j<=d1.getMinute();j++) {
                    if(j>9) {
                        minutesFirstDigit = j % 10;
                        minutesSecondDigit = j / 10;
                    }
                    else{
                        minutesFirstDigit=j;
                        minutesSecondDigit=0;
                    }
                    if (hoursFirstDigit + hoursSecondDigit + minutesFirstDigit + minutesSecondDigit == 15)
                        buf++;
                }
            }
            else{
                    for (int j = minutes; j <= 60; j++) {
                        if(j>9) {
                            minutesFirstDigit = j % 10;
                            minutesSecondDigit = j / 10;
                        }
                        else{
                            minutesFirstDigit=j;
                            minutesSecondDigit=0;
                        }
                        if (hoursFirstDigit + hoursSecondDigit + minutesFirstDigit + minutesSecondDigit == 15)
                            buf++;
                    }
            }
            minutes=0;
        }
        System.out.println(" Answer for c): " + buf);
        return buf;
    }


    int howMany(LocalDate data){
        int buf = 0;
        int year = LocalDate.now().getYear()-data.getYear();

        for(int i=0;i<year;i++){
            if(data.isLeapYear()){
                buf++;
            }
            data = data.plusYears(1);
        }
        if(LocalDate.now().getMonthValue()<3)
            buf--;

        System.out.println(" Answer for d) : " + buf);
        return buf;
    }
}
