package main.java.task1;

import main.java.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Завдання 1
Метод приймає на вхід список імен.
Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
 */
public class StreamList {
    public void listToString(List<Person> personList) {
        Stream<String> collect = personList.stream()
                .filter(person -> person.getId() % 2 != 0)
                .map(Object::toString);

        collect.forEach(s -> System.out.print(s + " "));

    }
}
