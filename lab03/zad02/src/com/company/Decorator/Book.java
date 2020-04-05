package com.company.Decorator;


import com.company.Exceptions.WrapperException;
import com.company.Exceptions.CoverException;
import com.company.Exceptions.AutographException;

public class Book implements Publications{

    private String title = null;
    private String autograph = null;
    private String cover = null;
    private String author = null;
    private String wrapper = null;
    private int countPage;

    public Book() {
    }

    public Book(String author, String title, int countPage) {
        this.title = title;
        this.author = author;
        this.countPage = countPage;
    }

    @Override
    public String toString() {
        return  author +
                " | " + title + " | " +
                + countPage;
    }

    @Override
    public void setTitle(String t) {
        this.title = t;
    }

    @Override
    public void setAutograph(String t) throws AutographException {

        if(this.autograph == null){
            this.autograph = t;
        }else{
            throw new AutographException("Exception! There can be only one autograph");
        }
    }

    @Override
    public void setWrapper(String t) throws WrapperException {
        if(this.wrapper == null && this.cover != null){
            this.wrapper = t;
        }else if(this.wrapper != null){
            throw new WrapperException("Exception! There can be only one wrapper");
        }else{
            throw new WrapperException("Exception! You can't wrap book without cover ");
        }
    }

    @Override
    public void setCover(String t) throws CoverException {
        if(this.cover == null){
            this.cover = t;
        }else{
            throw new CoverException("Exception! Book can't have two covers");
        }
    }
}
