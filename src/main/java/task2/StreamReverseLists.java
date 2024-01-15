package main.java.task2;


import main.java.Person;

import java.util.Arrays;
import java.util.List;

public class StreamReverseLists {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Oleg", 1),
                new Person("Mykola", 2), new Person("Tamara", 3),
                new Person("Petro", 4), new Person("Marta", 5));
        new StreamReverseList().listSortedStrings(personList);

    }
}
