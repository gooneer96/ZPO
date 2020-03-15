package com.company;


public class HexConv implements converter{

    public String convert(int x)
    {
        System.out.println(Integer.toString(x));
        String hex = Integer.toHexString(x);
        return hex;
    }
}
