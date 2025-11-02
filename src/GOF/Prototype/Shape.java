package GOF.Prototype;

public abstract class Shape {
    public int x, y;
    public String color;

    public Shape(){};

    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract Shape Clone();
}
