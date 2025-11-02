package GOF.Prototype.Sava;

public class Circle extends Shape{
    public float radius;

    public Circle(){}

    public Circle(Circle target){
        super(target);
        if(target != null)
            this.radius = target.radius;
    }

    @Override
    public Shape Clone(){
        return new Circle(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" +
                "radius=" + radius +
                '}';
    }
}
