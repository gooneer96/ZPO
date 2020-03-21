package com.company;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class LevenstheinTest {


    @Test
    public void test_1_5() {
        Levensthein lev = new Levensthein();
        if (lev.LevQWERTY("kot", "kita") != 1.5 || lev.LevQWERTY("olea","aloes") != 1.5 || lev.LevQWERTY("aleksandra","aleksander") != 1.5)
            fail("Wynik to nie 1.5");
    }

    @Test
    public void test_1()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("kit","kat") != 1 || lev.LevQWERTY("itak","tiak") != 1)
            fail("Wynik to nie 1");
    }
   @Test
    public void test_2_0()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("tablica","stolica") != 2.0)
            fail("Wynik to nie 2.0");
    }
   @Test
    public void test_3_0()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("woda","adow") != 3.0 || lev.LevQWERTY("kaleks","ale") != 3.0)
            fail("Wynik to nie 3.0");
    }
   @Test
    public void test_0_5()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("kakao","kalao") != 0.5)
            fail("Wynik to nie 0.5");
    }
    @Test
    public void test_4_0()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("mleczyk","mleko") != 4)
            fail("Wynik to nie 4");
    }
  /* @Test
    public void test()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("kot","kita") != 1.5)
            fail("Wynik to nie 1.5");
    }
    @Test
    public void test()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("kot","kita") != 1.5)
            fail("Wynik to nie 1.5");
    }@Test
    public void test()
    {
        Levensthein lev= new Levensthein();
        if(lev.LevQWERTY("kot","kita") != 1.5)
            fail("Wynik to nie 1.5");
    }

*/
}
