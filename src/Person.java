/**
 * @author Dzmitry Fursevich
 */
public class Person {
    String name;
    int age;
    String phone;

    Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    Person(String newName, int newAge) {
        this(newName, newAge, null);
    }

    Person() {
    }

    void sayHello() {
        System.out.println("Hello i'm " + name);
    }

    boolean isOlderThan(int age) {
        return this.age > age;
    }
}
