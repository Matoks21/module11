package main.java.task5;

import java.util.stream.Stream;

public class MixStreams {

    public static void main(String[] args) {

        Stream<String> first = Stream.of("Oleg", "Mykola", "Tamara",
                "Petro", "Marta");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        new MixStream<String>().zip(first, second);

    }
}
