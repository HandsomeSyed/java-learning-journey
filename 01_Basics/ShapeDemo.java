// Interface definition
interface Shape {
    double getArea();           // abstract method
    double getPerimeter();      // abstract method
    void display();            // abstract method
}

// Class implementing Shape
class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }

    public double getArea()      { return Math.PI*radius*radius; }
    public double getPerimeter() { return 2*Math.PI*radius; }
    public void display() {
        System.out.println("[Circle]  Area="+String.format("%.2f",getArea())+"  Perimeter="+String.format("%.2f",getPerimeter()));
    }
}

class Triangle implements Shape {
    double a, b, c;
    Triangle(double a,double b,double c) { this.a=a; this.b=b; this.c=c; }

    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double getPerimeter() { return a+b+c; }
    public void display() {
        System.out.println("[Triangle] Area="+String.format("%.2f",getArea())+"  Perimeter="+String.format("%.2f",getPerimeter()));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(7), new Triangle(3,4,5) };
        for (Shape s : shapes) s.display();
    }
}
