/**
 * @author Dzmitry Fursevich
 */
public class Artifact {
    int identifier;
    String culture;
    int age;

    Artifact(int identifier, String culture, int age) {
        this.identifier = identifier;
        this.culture = culture;
        this.age = age;
    }

    Artifact(int identifier) {
        this(identifier, "Unknown", Integer.MIN_VALUE);
    }

    void print() {
        System.out.println("identifier = " + identifier);
        System.out.println("culture = " + culture);
        System.out.println("age = " + age);
    }
}
