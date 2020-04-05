package com.company.Decorator;

import com.company.Exceptions.WrapperException;

public class BookWithWrapper extends Decorations {

    String dec = "Book with wrapper";

    public BookWithWrapper(Publications p) throws WrapperException {
        super(p);
        p.setWrapper(dec);
    }

    @Override
    public String toString() {
        return super.ksi.toString() + " | " + this.dec;
    }
}
