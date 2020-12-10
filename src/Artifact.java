/**
 * @author Dzmitry Fursevich
 */
public class Artifact {
    private int identifier;
    private String culture;
    private int age;

    public Artifact(int identifier, String culture, int age) {
        if (identifier > 0) {
            this.identifier = identifier;
        }
        this.culture = culture;
        this.age = age;
    }

    public Artifact(int identifier) {
        this(identifier, "Unknown", Integer.MIN_VALUE);
    }

    public void print() {
        System.out.println("identifier = " + identifier);
        System.out.println("culture = " + culture);
        System.out.println("age = " + age);
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        if (identifier > 0) {
            this.identifier = identifier;
        }
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
