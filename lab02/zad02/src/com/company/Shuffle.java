package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {

    public static void shuffleArray(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);

            array = list.toArray(new String[list.size()]);
        }
    }

