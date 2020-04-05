package com.company.Decorator;


import com.company.Exceptions.AutographException;

public class BookWithAutograph extends Decorations{

    String dec = "";


    public BookWithAutograph(Publications ksi, String dec) throws AutographException {
        super(ksi);
        this.dec = dec;
        ksi.setAutograph(dec);
    }

    @Override
    public String toString() {
        return super.ksi.toString() + " | " + this.dec;
    }


}
