package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
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