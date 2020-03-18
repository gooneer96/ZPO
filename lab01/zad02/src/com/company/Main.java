package com.company;
import java.util.Scanner;

/*

Napisz funkcję, która analizuje numer PESEL i wyciąga datę urodzenia oraz płeć danej osoby.
Te dane są zwracane jako obiekt odpowiedniej (utworzonej) klasy.
Przekazany do funkcji argument może być niepoprawny jako PESEL,
też obsłuż taką sytuację (albo przez rzucenie stosownego wyjątku albo w inny sposób).
https://pl.wikipedia.org/wiki/PESEL

 */
public class Main {

    public static void main(String[] args) {
    System.out.println("Podaj nr Pesel");
    Scanner scan = new Scanner(System.in);
    String pesel =scan.nextLine();
    AnalyzePesel analyze = new AnalyzePesel(pesel);
    DateOfBirth date = new DateOfBirth(analyze.getDate());
    date.show();
    Sex check_sex = new Sex(analyze.getSex());
    check_sex.show();

    }
}

