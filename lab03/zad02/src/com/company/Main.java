package com.company;

import com.company.Decorator.*;
import com.company.Exceptions.AutographException;
import com.company.Exceptions.WrapperException;
import com.company.Exceptions.CoverException;


public class Main {

    public static void main(String[] args) {
        Publications k1 = new Book("Adam Mickiewicz", "Pan Tadeusz", 340);
        Publications k2 = new Book("Adam Mickiewicz", "Dziady", 130);
        try{

            //Publications fakeBook = new BookWithWrapper(k1);  // instrukcja przeniesiona wyżej, ponieważ jeżeli udekorujemy książke okładką wyjątek nie wystąpi, w pliku lab03.docx ,
                                                                // najpierw dekorujemy książke okładką a dopiero potem sprawdzamy czy można ja udekorować obwolutą, w takim wypadku nie rzuci wyjątkiem

            Publications kk1 = new BookWithNormalCover(k1);
            Publications kk2 = new BookWithHardCover(k2);


            Publications kkk2 = new BookWithWrapper(kk2);
            //Publications odrzut = new BookWithWrapper(kkk2);



            Publications dziadyZAutografemWieszcza = new BookWithAutograph(kk2," Drogiej Hani - Adam Mickiewicz");

            System.out.println(dziadyZAutografemWieszcza);

            Publications dziadyZDwomaAutografamiWieszcza = new BookWithAutograph(dziadyZAutografemWieszcza, " Haniu, to nieprawda, Dziady napisałem ja, Julek Słowacki!");


        }catch(CoverException e){
            System.out.println(e.getMessage());
        }catch(WrapperException e){
            System.out.println(e.getMessage());
        }catch(AutographException e){
            System.out.println(e.getMessage());
        }
    }
}
