public class Manager extends Employee {

    private int teamSize;
    String status = "Managerial Employee";

    //CONSTRUCTOR
    public Manager(String name, String employeeId, double baseSalary, int teamSize) {
        super(name, employeeId, baseSalary);
        this.teamSize = teamSize;
    }

    //GETTER
    public int getTeamSize() {
        return teamSize;
    }

    public String getStatus() {
        return status;
    }

    //OVERRIDE
    @Override
    public String toString() {
        return super.toString() + "\nTeam Size: " + teamSize;
    }

    @Override
    public double calculateTakeHome() {
        return getBaseSalary();
    }
}
