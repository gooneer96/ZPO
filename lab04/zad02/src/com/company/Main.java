package com.company;

import java.io.*;
import java.util.Random;

public class Main {

    private static Random random = new Random();
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double m = Double.parseDouble(args[1]);
        double σ = Double.parseDouble(args[2]);
        assert σ >= 0 : "ERROR: σ musi byc dodatnie";
        try{
            DataOutputStream outbin = new DataOutputStream(new FileOutputStream("binFile.bin"));
            DataInputStream inbin = new DataInputStream(new FileInputStream("binFile.bin"));
            DataOutputStream outxt = new DataOutputStream(new FileOutputStream("txtFile.txt"));
            for(int i = 0;i < n;i++){
                double d  = nextGaussian(m,σ);
                System.out.println(d);
                outbin.writeDouble(d);
            }
            System.out.println();
            for(int i=0;i<n;i++){
                outxt.writeBytes(String.valueOf(inbin.readDouble()).replace('.',',')+'\n');
            }
        }catch (FileNotFoundException x){
            System.out.println(x.getMessage());
        }catch (IOException x){
            System.out.println(x.getMessage());
        }
    }

    private static double nextGaussian(double m, double σ){

        return random.nextGaussian()* σ + m;
    }
}