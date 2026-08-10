public class Tester {
    public static void main(String[] koiychi) {
        // Employee e1 = new Employee("Koi", "Emp-003987", 50000);
        // // System.out.printf("Employee Info: %s (%s) | Salary: %.2f", e1.getName(), e1.getEmployeeId(), e1.getBaseSalary());
        // System.out.println(e1.toString());

        // // Manager m1 = new Manager("Koi", "Man-003987", 100000, 5);
        // // System.out.println(m1.toString());

        //POLYMORPHISM: OVERRIDING
        //Implicit/Upcasting Casting
        //Superclass name = new Subclass();
        Employee m1 = new Manager("Mark", "2026001", 2500, 25);
        System.out.println(m1.toString());
        System.out.println(m1.getStatus());

        Employee int1 = new Intern("Koi", "Int-003987", 250, 5);
        System.out.println(int1.toString());

        //Explicit Casting/Downcasting
        // System.out.println();
        // Manager m2 = (Manager) m1;
        // System.out.println(m1.getStatus());

        //UPCASTING  super -< subclass
        Employee i1 = new Intern("Rhaine", "Intern-001", 500, 22);
        System.out.println(i1.toString());

        if (i1 instanceof Manager) {
            Manager i2 = (Manager) i1; //ACTUAL DOWNCASTING
            System.out.println(i2.getTeamSize());
        } else {
            System.out.println(i1.getName() + " is not a Manager.");
        }

        //INSTANCEOF DEMO
        Employee[] employees = {
            new Intern("Koi", "INT-01", 250, 25),
            new Manager("LJ", "MAN-001", 25000, 25),
            new Intern("Miles", "INT-002", 250, 20),
            new Manager("MJ", "MAN-002", 25000, 25),
            new Intern("Jake", "INT-003", 250, 15)
        };

        System.out.println();
        for(Employee e: employees) {
            if (e instanceof Intern) {
                System.out.println(e.getName() + " is an intern.");
            } else if (e instanceof Manager) {
                System.out.println(e.getName() + " is a manager.");
            }
        }


        //ABSTRACTION

        
        
    }
}
