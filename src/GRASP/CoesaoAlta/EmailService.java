package GRASP.CoesaoAlta;

import java.io.File;

public class EmailService {

    public void enviarEmail(String para, String assunto, String corpo){
        System.out.println("Enviando e-mail para " + para);
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + corpo);
    }

    public void anexarArquivo(String email, File arquivo){
        System.out.println("Anexando arquivo...");
    }
}
