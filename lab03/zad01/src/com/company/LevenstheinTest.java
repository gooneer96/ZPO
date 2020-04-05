package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevenstheinTest {

    @Test
    void test_1_5() {
        Levensthein lev = new Levensthein();
        if (lev.Lev("kot", "kita") != 2 || lev.Lev("olea","aloes") != 2 || lev.Lev("aleksandra","aleksander") != 2)
            fail("Wynik to nie 1.5");
    }

    @Test
    void test_1()
    {
        Levensthein lev= new Levensthein();
        if(lev.Lev("kit","kat") != 1 || lev.Lev("itak","tiak") != 1)
            fail("Wynik to nie 1");
    }
}