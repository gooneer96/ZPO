package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj pierwszy ciąg znaków");
        Scanner scan = new Scanner(System.in);
        String first_string =scan.nextLine();
        System.out.println("Podaj drugi ciąg znaków");
        String second_string =scan.nextLine();
        Levensthein lev = new Levensthein();
        System.out.println(lev.LevQWERTY(first_string,second_string));
    }
}


/*Zaimplementuj funkcję
	double LevQWERTY(String s1, String s2),
która zwraca ważoną odległość Levenshteina między napisami s1 i s2, gdzie wagi zależne są od wzajemnego położenia pary znaków
 na klawiaturze.
Konkretniej, odl. Levenshteina bazuje na 3 elementarnych operacjach: wstawienia znaku (ang. insertion),
 usunięcia znaku (ang. deletion) oraz zastąpienia znaku innym (ang. substitution).
  W naszym przypadku waga operacji insercji i delecji ma wynosić 1, natomiast waga substytucji wynosi:
•	0.5, jeśli odnośna para znaków sąsiaduje w rzędzie na klawiaturze,
•	1, w przeciwnym przypadku.
Zakładamy, że s1 i s2 mogą zawierać tylko małe litery łacińskie.

Przykłady:
LevQWERTY("kot", "kita") == 1.5 (1 insercja (a) + 1 substytucja znaków 	sąsiadujących w rzędzie (o <--> i)).
LevQWERTY("drab", "dal") == 2 (1 delecja (r) + 1 substytucja znaków 	niesąsiadujących w rzędzie (b <--> l)).

Napisz testy z użyciem jUnit sprawdzające poprawność napisanej funkcji. Istotne jest dobranie własnych sensownych przykładów.

Wskazówka: zastosuj tablicę asocjacyjną z małymi literami łacińskimi jako kluczami
 oraz zbiorami liter z nimi sąsiadujących jako wartościami.

Formuła programowania dynamicznego dla obliczania odl. Levenshteina + przykład:
https://pl.wikipedia.org/wiki/Odleg%C5%82o%C5%9B%C4%87_Levenshteina
*/