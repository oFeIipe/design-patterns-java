package GOF.FactoryMethod.Site;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>HTML Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button clicked!");
    }
}
