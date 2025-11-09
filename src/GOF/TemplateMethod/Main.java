package GOF.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        JavaMavenBuilder javaMavenBuilder = new JavaMavenBuilder();
        NodeJsBuilder nodeJsBuilder = new NodeJsBuilder();

        System.out.println("BUILDING JAVA");

        javaMavenBuilder.compile();
        javaMavenBuilder.packageArtifact();
        javaMavenBuilder.runBuild();

        System.out.println("-----------------\n\n");

        System.out.println("BUILDING NODEJS");
        nodeJsBuilder.compile();
        nodeJsBuilder.packageArtifact();
        nodeJsBuilder.deploy();

        nodeJsBuilder.runBuild();
    }
}
