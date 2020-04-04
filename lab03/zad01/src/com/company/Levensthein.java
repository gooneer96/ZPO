package com.company;

    public class Levensthein {

        public double Lev(String s1,String s2)
        {


            double [][] dist= new double[s1.length() + 1][s2.length() +1];
            for(int i=0;i<=s1.length();i++)
                dist[i][0]=i;
            for(int j=1; j<=s2.length();j++)
                dist[1][j]=j;
            double cost;

            try {
                if(!s2.equals(s2.toLowerCase()))
                    throw new NullPointerException();
                for (int i = 1; i <= s1.length(); i++) {
                    for (int j = 1; j <= s2.length(); j++) {

                        if (s1.charAt(i - 1) == s2.charAt(j - 1))
                            cost = 0;
                        else
                            cost = 1;

                        dist[i][j] = Math.min(dist[i - 1][j] + 1,
                                Math.min(dist[i][j - 1] + 1,
                                        dist[i - 1][j - 1] + cost));
                    }
                }
            }
            catch (NullPointerException exception)
            {
                throw new NullPointerException("Założeniem było sprawdzanie tylko małych liter łacinkich");

            }

            return dist[s1.length()][s2.length()];
        }
    }


