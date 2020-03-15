package com.company;

public class Base3Conv implements converter {

    public String convert(int x)
    {
        System.out.println(Integer.toString(x,3));
        String base3 = Integer.toString(x,3);
        return base3;
    }

}
