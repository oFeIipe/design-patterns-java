package GRASP.Criador;

public class Topico {
    public String texto;
    public Usuario usuario;
    public Forum forum;

    @Override
    public String toString() {
        return "Topico{" +
                "texto='" + texto + '\'' +
                ", usuario=" + usuario +
                ", forum=" + forum +
                '}';
    }

    public Topico(String texto, Usuario usuario, Forum forum){
        this.texto = texto;
        this.usuario = usuario;
        this.forum = forum;
    }
}
