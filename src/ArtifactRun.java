/**
 * @author Dzmitry Fursevich
 */
public class ArtifactRun {
    public static void main(String[] args) {
        Artifact ar1 = new Artifact(1, "ацтеки", -20);
        Artifact ar2 = new Artifact(2, "рим", -5);
        Artifact ar3 = new Artifact(3, "ussr", 19);

        ar1.print();
        System.out.println();
        ar2.print();
        System.out.println();
        ar3.print();

        Artifact ar4 = new Artifact(4);
        System.out.println();
        ar4.print();

        System.out.println("ar1.getCulture() = " + ar1.getCulture());
    }
}
