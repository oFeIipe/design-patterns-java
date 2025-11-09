package GOF.Proxy.Exemplo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando álbum de fotos (usando Proxies) ---");

        // Criar os proxies é INSTANTÂNEO. Nenhum dado é carregado.
        IImage foto1 = new ImageProxy("ferias_praia.jpg");
        IImage foto2 = new ImageProxy("aniversario_2024.jpg");
        IImage foto3 = new ImageProxy("documento_importante.png");

        System.out.println("Álbum criado. Nenhuma imagem foi carregada do disco ainda.");
        System.out.println("--------------------------------------------------");

        // 1ª Exibição da foto 1
        System.out.println("Usuário clicou na foto 1:");
        foto1.display(); // LENTO (Vai imprimir "CARREGANDO...")

        System.out.println("--------------------------------------------------");

        // 2ª Exibição da foto 1
        System.out.println("Usuário clicou na foto 1 DE NOVO:");
        foto1.display(); // RÁPIDO (Já estava carregada, só exibe)

        System.out.println("--------------------------------------------------");

        // 1ª Exibição da foto 2
        System.out.println("Usuário clicou na foto 2:");
        foto2.display(); // LENTO (Vai imprimir "CARREGANDO...")

        // A foto 3 nunca foi carregada, economizando memória.
    }
}
