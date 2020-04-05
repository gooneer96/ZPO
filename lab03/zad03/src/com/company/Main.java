package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        DateChecker check = new DateChecker();

        LocalDate warStart = LocalDate.of(1939,9,1);
        LocalDate warEnd = LocalDate.of(1945,5,8);

        check.worldWarTwo(warStart,warEnd);

        LocalDate data = LocalDate.ofYearDay(2016,68);

        check.whichDayAndMonth(data);

        LocalDateTime d = LocalDateTime.of(2020,4,5,11,45);
        LocalDateTime d1 = LocalDateTime.of(2020,4,5,22,30);

        check.countSum(d,d1);

        LocalDate birth = LocalDate.of(1996,10,30);

        check.howMany(birth);
    }

}