package pl.edu.pja.kirill;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Person person) {
        System.out.println("Hi " + person.name + "!");
    }

    @Override
    public String toString() {
        return name;
    }

}
