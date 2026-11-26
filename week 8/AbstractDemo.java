// This program demonstrates abstract classes.
// An abstract class cannot be instantiated (you cannot do 'new Shape()').
// It acts as a strict contract for subclasses.

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract method: Has no body.
    // Any concrete (non-abstract) subclass MUST implement this method.
    public abstract double calculateArea();

    // Concrete method: Has a body and is inherited by subclasses.
    public void displayName() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Shape s = new Shape("Test"); // ERROR: Cannot instantiate an abstract class.

        Shape myCircle = new Circle(5.0);
        Shape myRect = new Rectangle(4.0, 6.0);

        myCircle.displayName();
        System.out.println("Area: " + myCircle.calculateArea());

        System.out.println();

        myRect.displayName();
        System.out.println("Area: " + myRect.calculateArea());
    }
}
