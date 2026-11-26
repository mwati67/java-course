public class ShapeHierarchy {
    // This program demonstrates designing a class hierarchy with inheritance.

    // ============================================================
    // SUPERCLASS
    // ============================================================
    static class Shape {
        // Common attribute for all shapes.
        protected String name;

        // Constructor
        public Shape(String name) {
            this.name = name;
        }

        // A method to be overridden by subclasses.
        public double calculateArea() {
            return 0.0;
        }

        // Overriding the toString() method from the Object class.
        @Override
        public String toString() {
            return "Shape: " + name;
        }
    }

    // ============================================================
    // SUBCLASS 1
    // ============================================================
    static class Circle extends Shape {
        private final double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String toString() {
            return super.toString() + " | Radius: " + radius;
        }
    }

    // ============================================================
    // SUBCLASS 2
    // ============================================================
    static class Rectangle extends Shape {
        private final double length;
        private final double width;

        public Rectangle(String name, double length, double width) {
            super(name);
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public String toString() {
            return super.toString() + " | Length: " + length + ", Width: " + width;
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle("My Circle", 5.0);
        System.out.println(c.toString());
        System.out.println("Area: " + c.calculateArea());

        System.out.println();

        Rectangle r = new Rectangle("My Rectangle", 4.0, 6.0);
        System.out.println(r.toString());
        System.out.println("Area: " + r.calculateArea());
    }
}

