package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int var =0b1101_1000;
	 Scanner scan = new Scanner(System.in);
	 while(true) {
         System.out.println("Podaj podstawe systemu, do wyboru : dziesieć,trzy,szesnaście");
         String choice = scan.nextLine();
         Konwertuj konv;
         konv = new Konwertuj(var);
         if (choice.equals("dziesieć")) {
             konv.ToDec();
             break;
         } else if (choice.equals("trzy")) {
             konv.ToBase3();
             break;
         } else if (choice.equals("szesnaście")) {
             konv.ToHex();
             break;
         } else
             System.out.println("To nie jest prawidłowy wybór");
     }
    }

}
