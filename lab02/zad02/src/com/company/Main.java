package com.company;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;



public class Main {

    public static void main(String[] args) {
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        SortTool sort = new SortTool();
        Shuffle shuffle = new Shuffle();
        String[] words = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        sort.sortStrings(collator,words);
        System.out.println("First function: " + Arrays.deepToString(words));
        shuffle.shuffleArray(words);
        System.out.println("shuffle \n" + Arrays.deepToString(words));
        sort.fastSortStrings(collator,words);
        System.out.println("Second function: " + Arrays.deepToString(words));
        shuffle.shuffleArray(words);
        System.out.println("shuffle\n" + Arrays.deepToString(words));
        sort.fastSortStrings2(collator,words);
        System.out.println("Third function: " + Arrays.deepToString(words));

        double time=System.nanoTime();
        for(int i =0; i <100000;i++)
        {
            shuffle.shuffleArray(words);
            sort.sortStrings(collator,words);
        }
        time = (System.nanoTime() - time) * Math.pow(10,-9);
        System.out.println("First method x100k duration  :" + time + " sec ");
        time=System.nanoTime();
        for(int i =0; i <100000;i++)
        {
            shuffle.shuffleArray(words);
            sort.fastSortStrings(collator,words);
        }
        time = (System.nanoTime() - time) * Math.pow(10,-9);
        System.out.println("Second method x100k duration  :" + time + " sec ");
        time=System.nanoTime();
        for(int i =0; i <100000;i++)
        {
            shuffle.shuffleArray(words);
            sort.fastSortStrings2(collator,words);
        }
        time = (System.nanoTime() - time) * Math.pow(10,-9);
        System.out.println("Third method x100k duration  :" + time + " sec ");
    }
}


/*
Napisz klasę zawierającą metody sortujące napisy z uwzględnieniem
alfabetu polskiego (np. „Łukasz” ma być między „Lucyna” a „Marek”).
Wskazówka: wykorzystaj klasę java.text.Collator.

Konkretnie napisz 3 metody sortujące:

public static void sortStrings(Collator collator, String[] words)
– sortującą napisy ręcznie i naiwnie, z użyciem sortowania przez wstawianie (insertion sort),

public static void fastSortStrings(Collator collator, String[] words)
i
public static void fastSortStrings2(Collator collator, String[] words)
– sortujące napisy z użyciem Arrays.sort(…).
Różnica między tymi dwiema metodami jest taka, że fastSortStrings ma używać anonimowego obiektu komparatora,
zaś fastSortStrings2 ma wykorzystać funkcję lambda.

W testach (z użyciem JUnit) porównaj zgodność wyników zwracanych przez wszystkie te 3 funkcje,
a także wyświetl wyniki na konsoli dla następującej tablicy:
    String[] names = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka",
                      "Zyta", "Órszula", "Świętopełk"};

Wykonaj również test wydajnościowy tych 3 metod, sortując powyższą tablicę imion w pętli 100 tys. razy (oczywiście na starcie ma być za każdym razem nieposortowana). Tym razem nie wypisuj tablicy na ekranie. Wykorzystaj metodę System.nanoTime().

 */