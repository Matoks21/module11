package main.java.task4;

import java.util.stream.Stream;
/*
Завдання 4
Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().

Реалізуйте свій лінійний конгруентний генератор.
 Для цього почніть з x[0] = seed, і далі кожний наступний елемент рахуйте за формулою
 на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.

Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.

Для тесту використовуйте такі дані:

a = 25214903917
c = 11
m = 2^48 (2в степені48`)

 */
public class Generator {

    public void streamIterate(long a, long c, long m, long seed) {

        Stream.iterate(seed, n ->  (a * n + c) % m).limit(10).forEach(System.out::println);

    }


}
