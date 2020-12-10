import p3.Person;

/**
 * @author Dzmitry Fursevich
 */
public class StaticRun {
    public static void main(String[] args) {
//        Person alex = new Person("Alex", 20, "+375");
//        System.out.println("alex.getCounter() = " + alex.getCounter());
//
//        Person tom = new Person("Tom", 30, "+375");
//        System.out.println("tom.getCounter() = " + tom.getCounter());
//
//        System.out.println("alex.getCounter() = " + alex.getCounter());
//
//        System.out.println("Person.counter = " + Person.getCounter());
//
//        Person.setCounter(10);
//        System.out.println("Person.counter = " + Person.getCounter());
//
//        System.out.println("alex.getCounter() = " + alex.getCounter());

        Person ann = new Person("Ann", 20, "+375");
        Person sam = new Person("Sam", 20, "+375");

        ann.print();
        sam.print();

        Person alex = new Person("Alex", 40, "+375");

        alex.print();

        System.out.println("Person.getCounter() = " + Person.getCounter());

        printOlderPerson(alex, sam);
    }

    public static void printOlderPerson(Person p1, Person p2) {
        if (p1.getAge() >= p2.getAge()) {
            p1.print();
        } else {
            p2.print();
        }
    }
}
