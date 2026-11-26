// This program demonstrates the difference between an Abstract Class and an Interface.

// ============================================================
// ABSTRACT CLASS
// ============================================================
// Represents an "IS-A" relationship with shared code (state/behavior).
abstract class Animal {
    // Abstract classes can have fields (state).
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Concrete method: Shared by all animals.
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method: Must be implemented by subclasses.
    public abstract void makeSound();
}

// ============================================================
// INTERFACE
// ============================================================
// Represents a "CAN-DO" capability. It defines a contract with NO state (fields).
interface Flyable {
    // Interfaces can only have constants (public static final).
    int MAX_ALTITUDE = 10000;

    // Abstract method: Must be implemented by any class that implements this interface.
    void fly();
}

// ============================================================
// SUBCLASS IMPLEMENTING BOTH
// ============================================================
class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying up to " + MAX_ALTITUDE + " feet.");
    }
}

// ============================================================
// MAIN CLASS
// ============================================================
public class InterfaceVsAbstract {
    public static void main(String[] args) {
        Bird myBird = new Bird("Tweety");

        myBird.sleep();
        myBird.makeSound();
        myBird.fly();
    }
}
