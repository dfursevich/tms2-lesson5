import p3.Person;

/**
 * @author Dzmitry Fursevich
 */
public class Run {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.setName("Alex"); //8 byte
        alex.setAge(20); //4 byte
        alex.setPhone("+37522222222"); //20 byte

        p3.Person tom = new p3.Person();
        tom.setName("Tom");
        tom.setAge(30);
        tom.setPhone("+375293333333");

        alex.sayHello();
        tom.sayHello();

        boolean isAlexOlderThanTom = alex.isOlderThan(19);
        System.out.println("isAlexOlderThanTom = " + isAlexOlderThanTom);

        Person ann = new Person("Ann", 40, "+3752944444444");
        ann.sayHello();

        Person sam = new Person("Sam", 50);
        sam.sayHello();

        Person mark = new Person();
        mark.setAge(-10);
    }
}
