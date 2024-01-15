package main.java.task4;

public class Generators {
    public static void main(String[] args) {
        Generator generator=new Generator();
        generator.streamIterate( 25214903917L, 11, (long) Math.pow(2, 48),1);
    }
}
