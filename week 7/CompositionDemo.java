// This program demonstrates Composition (HAS-A relationship).
// We use instance variables instead of 'extends'.

public class CompositionDemo {
    // The Engine class (independent component).
    static class Engine {
        public void start() {
            System.out.println("Engine started.");
        }
    }

    // The Car class (uses Composition).
    static class Car {
        // The Car HAS-A Engine.
        private final Engine engine;

        // Constructor initializes the Engine.
        public Car() {
            this.engine = new Engine();
        }

        // The Car delegates the starting action to its Engine.
        public void startCar() {
            System.out.println("Car is starting...");

            // Call the Engine's method.
            engine.start();
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
