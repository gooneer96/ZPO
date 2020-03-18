package com.company;

public class AnalyzePesel {

    String pesel;
    int PESEL[] = new int[11];

    AnalyzePesel(String var){
        pesel=var;
    }

    public void getPesel(){
        try {
            for (int i = 0; i < 11; i++){
                PESEL[i] = Integer.parseInt(pesel.substring(i, i+1));
            }
            if(pesel.length() == 11){}
            else
            {
                throw new IllegalArgumentException("Pesel składa się z 11 cyfr");
            }
        }
        catch (NumberFormatException exception) {
            System.out.println("To nie jest prawidłowy numer Pesel");
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Pesel powinien mieć 11 cyfr");
        }
    }

    public String getDate(){

        getPesel();

        int year,month;

        year = 10 * PESEL[0];
        year += PESEL[1];
        month = 10 * PESEL[2];
        month += PESEL[3];

        if (month > 80 && month < 93) {
            year += 1800;
        }
        else if (month > 0 && month < 13) {
            year += 1900;
        }
        else if (month > 20 && month < 33) {
            year += 2000;
        }
        else if (month > 40 && month < 53) {
            year += 2100;
        }
        else if (month > 60 && month < 73) {
            year += 2200;
        }


        if (month > 80 && month < 93) {
            month -= 80;
        }
        else if (month > 20 && month < 33) {
            month -= 20;
        }
        else if (month > 40 && month < 53) {
            month -= 40;
        }
        else if (month > 60 && month < 73) {
            month -= 60;
        }

        String date = pesel.substring(4,6) + "-" + String.format("%02d",month) + "-" + year;

        return date;
    }

    public String getSex()
    {
        getPesel();

        String return_sex;

        if (PESEL[9]%2==1)
        {
            return_sex="Mężczyzna";
        }
        else
        {
            return_sex="Kobieta";
        }
        return return_sex;
    }

}
