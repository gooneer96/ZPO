package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int length,labels;
        System.out.println("Podaj długość: ");
        Scanner scan = new Scanner(System.in);
        labels = scan.nextInt();
        System.out.println("Podaj liczbę zagnieżdżeń: ");
        length = scan.nextInt();
        DrawTool tool = new DrawTool();
        //tool.drawTicks(5,5);
        tool.drawRuler(labels,length);
    }
}


/*Narysuj w konsoli, z wykorzystaniem rekurencji, pionową linijkę o zadanych parametrach:
 (długość w danych jednostkach, liczba poziomów zagnieżdżeń).  Podziałka ma być „dwukierunkowa”, co widać na obrazku poniżej.
Udokumentuj swoją funkcję i obejrzyj wygenerowanego (-> javadoc) HTML-a.
https://www.oracle.com/technetwork/java/javase/documentation/index-137868.html

Przykład, (2, 5):

---------- 0
    --
   ----
    --
  ------
    --
   ----
    --
 --------
    --
   ----
    --
  ------
    --
   ----
    --
---------- 1
    --
   ----
    --
  ------
    --
   ----
    --
 --------
    --
   ----
    --
  ------
    --
   ----
    --
---------- 2

*/