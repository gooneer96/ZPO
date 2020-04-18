package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxSearchAlgorithms {


    List<Integer> scanFromLeftToRight(List<Integer> list) {
        List<Integer> buff = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        Integer max = 0, var;
        while (iterator.hasNext()) {
            var = iterator.next();
            if (var > max) {
                max = var;
                buff.add(max);
            }
        }

        return buff;
    }

    List<Integer> scanFromRightToLeft(List<Integer> list) {
        List<Integer> buff = new ArrayList<>();
        Integer max = 0, var;
        for (int i = list.size() - 1; i >= 0; i--) {
            var = list.get(i);
            if (var > max) {
                max = var;
                buff.add(max);
            }
        }
        return buff;

    }

    List<Integer> scanOnEvenIndexNextOnOddIndex(List<Integer> list) {
        List<Integer> buff = new ArrayList<>();
        Integer max = 0, var;
        for (int i = 0; i < list.size(); i++) {

            if (i % 2 == 0) {
                var = list.get(i);
                if (var > max) {
                    max = var;
                    buff.add(max);
                }
            }
        }

        for (int i = 1; i < list.size(); i++) {

            if (!(i % 2 == 0)) {
                var = list.get(i);
                if (var > max) {
                    max = var;
                    buff.add(max);
                }
            }
        }
        return buff;
    }
}


