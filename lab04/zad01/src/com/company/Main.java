package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

import java.util.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        StandardCharsets.UTF_8.name();
        List<Person> per = getPersons("dane.txt");

        int sum = per.stream()
                .filter(g -> g.country.equals("PL"))
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(2)
                .mapToInt(Person::getSalary)
                .sum();

        System.out.print(sum);

        sum = per.stream()
                .filter(g -> g.country.equals("PL"))
                .sorted(Comparator.comparing(Person::getSalary))
                .limit(2)
                .mapToInt(Person::getSalary)
                .sum();

        System.out.print(" " + sum);


        Map<String, Long> letterToCount = per.stream()
                .map(Person::getCountry)
                .collect(groupingBy(identity(), LinkedHashMap::new, counting()));


        System.out.println();

        for (String i : letterToCount.keySet()) {
            System.out.print(i + ": " + letterToCount.get(i) + " ");
        }
    }

    private static List<Person> getPersons(String filePath) {
        List<Person> list = new ArrayList<>();
        BufferedReader reader;
        try {
            FileInputStream path = new FileInputStream(filePath);
            reader = new BufferedReader(new InputStreamReader(
                    path));

            String line = reader.readLine();
            while (line != null) {
                String[] buf = line.split(" ");
                list.add(new Person(buf[0], buf[1], buf[2], buf[3]));
                //System.out.println(line);
                line = reader.readLine();

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}