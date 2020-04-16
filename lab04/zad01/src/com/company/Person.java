package com.company;

public class Person implements Comparable<Person> {
    public String name;
    public String surname;
    public String country;
    public int salary;

    public Person(String name, String surname, String country, String salary) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.salary = Integer.parseInt(salary);
    }


    public int getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int compareTo(Person o) {
        if(this.salary > o.salary)
            return this.salary;
        else
            return o.salary;
    }
}