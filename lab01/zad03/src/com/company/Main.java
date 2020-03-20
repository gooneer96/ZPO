package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj 3-cyfrowa liczbe całkowitą z opcjonalnym znakiem '-': ");
        Scanner scan = new Scanner(System.in);
        String num =scan.nextLine();
        Translator translator = new Translator(num);
        translator.translate();
    }
}


/*) Napisz program wczytujący z wiersza poleceń liczbę całkowitą 3-cyfrową, z opcjonalnym znakiem
 ‘-’ (minus) na początku, wypisujący słownie tę liczbę (w języku polskim, ale w stylu „cyfra po cyfrze”)
  na komponencie typu

Przykłady:
127  jeden dwa siedem
	-205  minus dwa zero pięć
	911  dziewięć jeden jeden

Próba wczytania niedozwolonej liczby, tj. o innej liczbie cyfr niż 3,
 powinna rzucać stosowny wyjątek i w konsekwencji (w kodzie obsługi wyjątku) komunikat o błędzie.
Wskazówka: w odpowiedni sposób użyj słownika/-ów (np. HashMap<…>).
*/