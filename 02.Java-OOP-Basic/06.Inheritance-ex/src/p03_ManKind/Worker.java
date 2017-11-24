package p03_ManKind;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    protected void setWeekSalary(double weekSalary) {
        if (weekSalary < 10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    protected void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public void setLastName(String lastName) {
        char[] lastNameLenght = lastName.toCharArray();
        if (lastNameLenght.length < 3){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    private double calcSalaryPerHour(){
        return this.weekSalary / (this.workHoursPerDay * 7);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Week Salary: %.2f", this.weekSalary))
                .append(System.lineSeparator())
                .append(String.format("Hours per day: %.2f", this.workHoursPerDay))
                .append(System.lineSeparator())
                .append(String.format("Salary per hour: %.2f", calcSalaryPerHour()))
                .append(System.lineSeparator());
        return super.toString() + sb.toString();
    }
}
