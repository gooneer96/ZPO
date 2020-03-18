package com.company;

public class Konwertuj implements converter {

    public String ToBase3(int x)
    {
        System.out.println(Integer.toString(x,3));
        String base3 = Integer.toString(x,3);
        return base3;
    }

    public int ToDec(int x)
    {
        System.out.println(x);
        return x;
    }

    public String ToHex(int x)
    {
        System.out.println(Integer.toString(x));
        String hex = Integer.toHexString(x);
        return hex;
    }
}
