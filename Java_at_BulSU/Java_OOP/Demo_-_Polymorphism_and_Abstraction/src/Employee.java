public abstract class Employee { //Abstraction applied
    //FIELDS
    private String name;
    private String employeeId;
    private double baseSalary;
    String status = "Active Employee";

    //CONSTRUCTORS (Overloading)
    //A. Parameterized Constructor
    public Employee(String name, String employeeId, double baseSalary) {
        setName(name);
        setEmployeeId(employeeId);
        setBaseSalary(baseSalary);
    }

    //B. Default Constructor
    public Employee() {
        setName("Unknown Employee");
        setEmployeeId("2025003987");
        setBaseSalary(500);
    }

    //C. Copy Constructor
    public Employee(Employee other) {
        this(other.name, other.employeeId, other.baseSalary);
    }

    //GETTER
    public String getName() { 
        return name; //returns the name (private)
    }

    public String getEmployeeId() {
        return employeeId; //returns employeeId
    }

    public double getBaseSalary() {
        return baseSalary; //returns baseSalary
    }

    public String getStatus() {
        return status;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //Overriding
    public String toString() {
        return "\nName: " + getName() + "\nEmployee ID: " + getEmployeeId() + "\nSalary: " + getBaseSalary();
    }

    //ABSTRACTION
    // - require all subclass to implement calculateTakeHome
    public abstract double calculateTakeHome(); //abstract class
   



}
