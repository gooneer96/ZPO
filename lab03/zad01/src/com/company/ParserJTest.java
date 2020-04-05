package com.company;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ParserJTest {

    @Test
    void parseFileToJavaObject() throws FileNotFoundException {

        String path = "src/com/company/PolEngTest.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Gson gson = new Gson();
        HashMap<String, ArrayList<String>> json = gson.fromJson(bufferedReader, HashMap.class);
        if(json.isEmpty())
            fail();
    }
}