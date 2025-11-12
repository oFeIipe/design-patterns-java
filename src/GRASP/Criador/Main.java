package GRASP.Criador;

public class Main {
    public static void main(String[] args) {
        // 1. Criar os objetos
        Forum forumDeJava = new Forum();
        Usuario felipe = new Usuario("Felipe");

        // 2. O cliente pede ao Fórum (o Criador) para criar os Tópicos.
        // O cliente não usa "new Topico()".
        forumDeJava.criaPost(felipe, "Minha dúvida sobre GRASP");
        // 3. Verificar se o Fórum realmente "contém" os tópicos
        forumDeJava.exibirTopicos();
    }
}