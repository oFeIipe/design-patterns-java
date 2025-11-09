package GOF.TemplateMethod;

public abstract class BuildProcess {
    public final void runBuild() {
        compile();
        runTests();
        packageArtifact();
        deploy();
    }

    protected abstract void compile();
    protected abstract void packageArtifact();

    protected void runTests(){
        System.out.println("Executando teste unitários comuns...");
    }

    protected void deploy(){};
}
