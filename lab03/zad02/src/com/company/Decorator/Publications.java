package com.company.Decorator;

import com.company.Exceptions.WrapperException;
import com.company.Exceptions.CoverException;
import com.company.Exceptions.AutographException;

public interface Publications {

    void setTitle(String t);
    void setAutograph(String t) throws AutographException;
    void setCover(String t) throws CoverException;
    void setWrapper(String t) throws WrapperException;
}
