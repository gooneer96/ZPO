package com.company;

public class Konwertuj implements converter {

    int x;
    Konwertuj(int y)
    {
        y=x;
    }

    public String ToBase3()
    {
        System.out.println(Integer.toString(x,3));
        String base3 = Integer.toString(x,3);
        return base3;
    }

    public int ToDec()
    {
        System.out.println(x);
        return x;
    }

    public String ToHex()
    {
        System.out.println(Integer.toString(x));
        String hex = Integer.toHexString(x);
        return hex;
    }
}
