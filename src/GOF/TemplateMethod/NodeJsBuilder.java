package GOF.TemplateMethod;

public class NodeJsBuilder extends BuildProcess{
    @Override
    protected void compile() {
        System.out.println("COMPILANDO: 'npm run build'");
    }

    @Override
    protected void packageArtifact() {
        System.out.println("EMPACOTANDO: 'npm pack' (criando .zip)");
    }

    @Override
    protected void deploy(){
        System.out.println("DEPLOY: 'npm publish'");
    }
}