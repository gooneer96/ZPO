package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class DateCheckerTest {



    @org.junit.Test
    public void worldWarTwo() {
        DateChecker check = new DateChecker();

        LocalDate warStart = LocalDate.of(1939,9,1);
        LocalDate warEnd = LocalDate.of(1945,5,8);

        if((check.worldWarTwo(warStart,warEnd))!=2076)
            fail("Method worldWarTwo wrong output");
    }


    @org.junit.Test
    public void countSum() {
        DateChecker check = new DateChecker();
        LocalDateTime d = LocalDateTime.of(2020,4,5,11,45);
        LocalDateTime d1 = LocalDateTime.of(2020,4,5,22,30);
        if(check.countSum(d,d1)!=51)
            fail("Method countSum fails for time in the same day from 11:45 to 22:30");
    }

    @org.junit.Test
    public void howMany() {
        DateChecker check = new DateChecker();
        LocalDate birth = LocalDate.of(1996,10,30);
        if(check.howMany(birth)!=6)
            fail("Method howMany failed for creator date of birth");

    }
}