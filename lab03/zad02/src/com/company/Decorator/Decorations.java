package com.company.Decorator;

import com.company.Exceptions.WrapperException;
import com.company.Exceptions.CoverException;
import com.company.Exceptions.AutographException;

public abstract class Decorations extends Book implements Publications {
    protected Publications ksi;


    public Decorations(String author, String title, int pageCount, Publications ksi) {
        super(author, title, pageCount);
        this.ksi = ksi;
    }

    public Decorations(Publications ksi) {
        super();
        this.ksi = ksi;
    }

    @Override
    public void setTitle(String t) {
        ksi.setTitle(t);
    }

    @Override
    public void setAutograph(String t) throws AutographException {

        ksi.setAutograph(t);
    }

    @Override
    public void setCover(String t) throws CoverException {

        ksi.setCover(t);
    }

    @Override
    public void setWrapper(String t) throws WrapperException {

        ksi.setWrapper(t);
    }
}