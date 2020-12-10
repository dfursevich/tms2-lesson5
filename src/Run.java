/**
 * @author Dzmitry Fursevich
 */
public class Run {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alex"; //8 byte
        alex.age = 20; //4 byte
        alex.phone = "+37522222222"; //20 byte

        Person tom = new Person();
        tom.name = "Tom";
        tom.age=30;
        tom.phone = "+375293333333";

        alex.sayHello();
        tom.sayHello();

        boolean isAlexOlderThanTom = alex.isOlderThan(19);
        System.out.println("isAlexOlderThanTom = " + isAlexOlderThanTom);

        Person ann = new Person("Ann", 40, "+3752944444444");
        ann.sayHello();

        Person sam = new Person("Sam", 50);
        sam.sayHello();

//        Person mark = null;
//        mark.sayHello();
    }
}
