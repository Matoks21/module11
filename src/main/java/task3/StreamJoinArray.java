package main.java.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Завдання 3
Є масив:
["1, 2, 0", "4, 5"]
Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:

"0, 1, 2, 4, 5"
 */
public class StreamJoinArray {
    public void sortArrayInStream(String[] array) {
        Stream<String> sortArray = Arrays.stream(String.join(",", array).split(","))
                .map(String::trim)
                .sorted();
        sortArray.forEach(s -> System.out.print(s + " "));

    }


}
