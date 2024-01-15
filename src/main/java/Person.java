package main.java;

public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
       this(name);
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  id +"."+ name+" " ;
    }
}
