package com.company.Decorator;

import com.company.Exceptions.CoverException;

public class BookWithNormalCover extends Decorations{

    String dec = "Book with normal cover";

    public BookWithNormalCover(Publications p) throws CoverException {
        super(p);
        p.setCover(dec);
    }

    @Override
    public String toString() {
        return super.ksi.toString()  + " | " + this.dec;
    }
}
