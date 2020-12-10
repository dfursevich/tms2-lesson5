package p3;

/**
 * @author Dzmitry Fursevich
 */
public class Person {
    private String name;
    private int age;
    private String phone;

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Person(String newName, int newAge) {
        this(newName, newAge, null);
    }

    public Person() {
    }

    public void sayHello() {
        System.out.println("Hello i'm " + name);
    }

    public boolean isOlderThan(int age) {
        return this.age > age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
