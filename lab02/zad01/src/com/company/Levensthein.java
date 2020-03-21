package com.company;

import java.util.HashMap;

public class Levensthein {

    public double LevQWERTY(String s1,String s2)
    {

        HashMap<Character,String> levenstheinHM = new HashMap<>();
        levenstheinHM.put('z', "x");
        levenstheinHM.put('x', "cz");
        levenstheinHM.put('c', "vx");
        levenstheinHM.put('v', "bc");
        levenstheinHM.put('b', "nv");
        levenstheinHM.put('n', "mb");
        levenstheinHM.put('m', "n");
        levenstheinHM.put('a', "s");
        levenstheinHM.put('s', "da");
        levenstheinHM.put('d', "fs");
        levenstheinHM.put('f', "gd");
        levenstheinHM.put('g', "hf");
        levenstheinHM.put('h', "jg");
        levenstheinHM.put('j', "kh");
        levenstheinHM.put('k', "lj");
        levenstheinHM.put('l', "k");
        levenstheinHM.put('q', "w");
        levenstheinHM.put('w', "eq");
        levenstheinHM.put('e', "rw");
        levenstheinHM.put('r', "te");
        levenstheinHM.put('t', "yr");
        levenstheinHM.put('y', "ut");
        levenstheinHM.put('u', "iy");
        levenstheinHM.put('i', "ou");
        levenstheinHM.put('o', "pi");
        levenstheinHM.put('p', "i");


        double [][] dist= new double[s1.length() + 1][s2.length() +1];
        for(int i=0;i<=s1.length();i++)
            dist[i][0]=i;
        for(int j=1; j<=s2.length();j++)
            dist[1][j]=j;
        double cost;
        String neighbours;

       try {
           if(!s2.equals(s2.toLowerCase()))
               throw new NullPointerException();
           for (int i = 1; i <= s1.length(); i++) {
               for (int j = 1; j <= s2.length(); j++) {
                   neighbours = levenstheinHM.get(s1.charAt(i - 1));
                   if (s1.charAt(i - 1) == s2.charAt(j - 1))
                       cost = 0;
                   else if (neighbours.indexOf(s2.charAt(j - 1)) >= 0)   //indexOf zwraca index czyli(>=0) jeżeli char występuje w stringu
                   {
                       cost = 0.5;
                   } else
                       cost = 1;

                   dist[i][j] = Math.min(dist[i - 1][j] + 1,
                           Math.min(dist[i][j - 1] + 1,
                                   dist[i - 1][j - 1] + cost));
               }
           }
       }
       catch (NullPointerException exception)
       {
           throw new NullPointerException("Założeniem było sprawdzanie tylko małych liter łacinkich");

       }

        return dist[s1.length()][s2.length()];
    }
}
