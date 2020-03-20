package com.company;
import java.util.HashMap;

public class Translator {

String var;

    Translator(String number)
    {
        var=number;
    }

    public void checkNumber(){
        if(var.charAt(0) == '-')
        {
           if (var.substring(1).matches("\\d+")){
                if(var.length() == 4) {
                    if (var.charAt(1)!= '0'){
                        System.out.println("Podano poprawną liczbę");
                    } else {
                        throw new ArithmeticException("Liczby całkowite nie mogą zaczynać się od 0");
                    }
                }
                else
                {
                    throw new IllegalArgumentException("Podana liczba nie jest 3 cyfrowa");
                }
            }
            else {
               throw new NumberFormatException("To nie jest liczba");
            }
        }
        else {
            if(var.matches("\\d+"))
            {
                if(var.length() == 3)
                {
                    if(var.charAt(0)=='0')
                    {
                        throw new ArithmeticException("Liczby całkowite nie mogą zaczynać się od 0");
                    }
                    else {
                        System.out.println("Podano poprawną liczbę");
                    }
                }
                else
                {
                    throw new IllegalArgumentException("Podana liczba nie jest 3 cyfrowa");
                }
            }
            else {
                throw new NumberFormatException("To nie jest liczba");
            }
        }
    }

    public void translate()
    {
        HashMap<Character,String> digittoword = new HashMap<>();
        digittoword.put('1',"jeden");
        digittoword.put('2',"dwa");
        digittoword.put('3',"trzy");
        digittoword.put('4',"cztery");
        digittoword.put('5',"pięć");
        digittoword.put('6',"sześć");
        digittoword.put('7',"siedem");
        digittoword.put('8',"osiem");
        digittoword.put('9',"dziewięć");
        digittoword.put('0',"zero");
        digittoword.put('-',"minus");

        checkNumber();
        int i;
        if(var.length()==4)
            i =3;
        else
            i=2;
        for(int j=0;j<=i;j++)
        System.out.print(digittoword.get(var.charAt(j)) + " " );
    }
}
