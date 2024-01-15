package main.java.task5;

import java.util.Iterator;
import java.util.stream.Stream;

/*
Завдання 5
Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
який "перемішує" елементи зі стрімів first та second, зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.
 */
public class MixStream<T> {

    public void zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorOne = first.iterator();
        Iterator<T> iteratorTwo = second.iterator();
        Stream<T> stream = Stream.empty();
        while (iteratorOne.hasNext() & iteratorTwo.hasNext()) {
            stream = Stream.concat(stream, Stream.of(iteratorOne.next(), iteratorTwo.next()));
        }
        stream.forEach(s-> System.out.print(s+ " "));
    }


}
