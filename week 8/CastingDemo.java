// This program demonstrates upcasting, downcasting, and how to prevent
// a ClassCastException using the 'instanceof' operator.

class Vehicle { }

class Car extends Vehicle {
    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
}

class Bike extends Vehicle { }

public class CastingDemo {
    public static void main(String[] args) {
        // UPCASTING: Assigning a subclass to a superclass reference.
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Upcasting successful.");

        // DOWNCASTING: The cast is safe only after checking the actual type.
        System.out.println("\nChecking types safely...");

        if (v1 instanceof Car c1) {
            c1.openTrunk();
        }

        if (v2 instanceof Car) {
            System.out.println("This will not print.");
        } else {
            System.out.println("v2 is not a Car, it is a Bike. Downcasting prevented!");
        }
    }
}
