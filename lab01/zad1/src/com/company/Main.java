package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int liczba =0b1101_1000;
	 Scanner scan = new Scanner(System.in);
	 //rozkmin to, miały być 3 klasy, ale jak utworzyć obiekt? jednak chyba jedna klasa w której utworzysz 3 metody
	 while(true) {
         System.out.println("Podaj podstawe systemu, do wyboru : dziesieć,trzy,szesnaście");
         String wybor = scan.nextLine();
         Konwertuj konv;
         if (wybor.equals("dziesieć")) {
             konv = new
             konwerter.ToDec(liczba);
             break;
         } else if (wybor.equals("trzy")) {
             konwerter.ToBase3(liczba);
             break;
         } else if (wybor.equals("szesnaście")) {
             konwerter.ToHex(liczba);
             break;
         } else
             System.out.println("To nie jest prawidłowy wybór");
     }

        konv.convert(d)
    }

}
