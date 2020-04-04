package com.company;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


 class ParserJ {
    HashMap<String, ArrayList<String>> parseFileToJavaObject() throws FileNotFoundException {
        String path = "src/com/company/PolEngTest.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Gson gson = new Gson();
        HashMap<String, ArrayList<String>> json = gson.fromJson(bufferedReader, HashMap.class);
        return json;
    }

     void parseObjectToFile(QueAnsPair[] outputs) throws IOException {

        String path = "src/com/company/imie_nazwisko.json";
        Gson gson = new Gson();
        gson.toJsonTree(outputs);
        FileWriter writer= new FileWriter(path, false);
        gson.toJson(outputs, writer);
        writer.flush();
        writer.close();

    }
}
