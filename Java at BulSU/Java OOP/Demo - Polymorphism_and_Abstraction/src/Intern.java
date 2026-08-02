public class Intern extends Employee{
    private double dailyStipend;
    private int daysPresent;


    //CONSTRUCTOR
    public Intern(String name, String employeeId, double dailyStipend, int daysPresent) {
        super(name, employeeId, 0);
        this.dailyStipend = dailyStipend;
        this.daysPresent = daysPresent;
    }

    //GETTERS 
    public double getDailyStipend() {
        return dailyStipend;
    }

    public double getDaysPresent() {
        return daysPresent;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDaily Stipend: " + getDailyStipend() + "\nDays Present: " + daysPresent;
    }

    @Override
    public double calculateTakeHome() {
        return getDailyStipend() * getDaysPresent();
    }

}
