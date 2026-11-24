// This program demonstrates Method Overriding and the 'super' keyword.
public class OverridingDemo {

    // ============================================================
    // SUPERCLASS
    // ============================================================
    static class Employee {
        // Protected field
        protected String name;
        protected double baseSalary;

        // Constructor
        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        // Method to calculate salary
        public double calculateSalary() {
            return baseSalary;
        }

        // Method to display info
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Base Salary: KSh " + baseSalary);
        }
    }

    // ============================================================
    // SUBCLASS
    // ============================================================
    static class Manager extends Employee {
        // A field unique to Manager
        private final double bonus;

        // Constructor
        public Manager(String name, double baseSalary, double bonus) {
            super(name, baseSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            double base = super.calculateSalary();
            return base + bonus;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Bonus: KSh " + bonus);
            System.out.println("Total Salary: KSh " + calculateSalary());
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        System.out.println("=== EMPLOYEE ===");
        emp.displayInfo();
        System.out.println("Calculated Salary: " + emp.calculateSalary());

        System.out.println();

        Manager mgr = new Manager("Bob", 80000, 20000);
        System.out.println("=== MANAGER ===");
        mgr.displayInfo();
        System.out.println("Calculated Salary: " + mgr.calculateSalary());
    }
}
