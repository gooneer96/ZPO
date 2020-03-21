package com.company;


import org.junit.Test;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

import static org.junit.Assert.*;

public class SortToolTest {


    @Test
    public void sortStrings() {
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));

        SortTool sort = new SortTool();
        String[] words2 = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        String[] words1 = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};

        String[] words  = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};

        sort.sortStrings(collator,words);

        sort.fastSortStrings(collator,words1);


        sort.fastSortStrings2(collator,words2);


        if( Arrays.equals(words,words1)  && Arrays.equals(words,words2))
        {
        }
        else
            fail("Posortowane tablice różnią się");

    }

    @Test
    public void sortStrings1() {
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));

        SortTool sort = new SortTool();
        String[] words2 = {"amadeussz", "Śdas", "Tarzan", "domek", "vasa1", "dasva1", "koniec", "śnieg"};
        String[] words1 = {"amadeussz", "Śdas", "Tarzan", "domek", "vasa1", "dasva1", "koniec", "śnieg"};

        String[] words  = {"amadeussz", "Śdas", "Tarzan", "domek", "vasa1", "dasva1", "koniec", "śnieg"};

        sort.sortStrings(collator,words);

        sort.fastSortStrings(collator,words1);


        sort.fastSortStrings2(collator,words2);


        if( Arrays.equals(words,words1)  && Arrays.equals(words,words2))
        {
        }
        else
            fail("Posortowane tablice różnią się");

    }

}