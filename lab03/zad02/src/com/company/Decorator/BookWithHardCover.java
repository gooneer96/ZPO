package com.company.Decorator;

import com.company.Exceptions.CoverException;

public class BookWithHardCover extends Decorations {

    String dec = "Book with hard cover";

    public BookWithHardCover(Publications p) throws CoverException {
        super(p);
        p.setCover(dec);
    }

    @Override
    public String toString() {
        return super.ksi.toString() + " | " + this.dec;
    }
}
