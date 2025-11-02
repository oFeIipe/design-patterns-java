package GOF.Prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.x = 10;
        circle.y = 20;
        circle.radius = 20;

        Circle copia = (Circle) circle.Clone();

        System.out.println(circle);
        System.out.println(copia);

        System.out.println("\n\n");

        circle.radius = 90;
        copia.radius = 45;

        System.out.println(circle);
        System.out.println(copia);
    }
}
