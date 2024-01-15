package main.java.task2;

import main.java.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
Завдання 2
Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
 Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
 */
public class StreamReverseList {
    public void listSortedStrings(List<Person> personList) {
        Stream<String> sortedList = personList.stream()
                .map(person -> person.getName().toUpperCase())
                .sorted(Comparator.reverseOrder());
        sortedList.forEach(s -> System.out.print(s + " "));
    }
}
