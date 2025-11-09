package GOF.TemplateMethod;

public class JavaMavenBuilder extends BuildProcess{
    @Override
    protected void compile() {
        System.out.println("COMPILANDO: 'mvn compile'");
    }

    @Override
    protected void packageArtifact() {
        System.out.println("EMPACOTANDO: 'mvn package' (criando .jar)");
    }
}
