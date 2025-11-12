package GRASP.Criador;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<Topico> topicos = new ArrayList<>();


    public void criaPost(Usuario usuario, String content){
        topicos.add(new Topico(content, usuario, this));
    }

    public void exibirTopicos(){
        for(Topico topico: topicos){
            System.out.println(topico);
        }
    }
}
