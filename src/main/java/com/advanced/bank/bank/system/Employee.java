import java.util.Objects;

public class Employee implements Comparable, Stimul {
    protected String name;
    protected double baseSalary;
    protected int workingHours;

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", workingHours=" + workingHours +
                '}';
    }

    public Employee(String name, double baseSalary, int workingHours) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.baseSalary, baseSalary) == 0;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        if (this.baseSalary>other.baseSalary) return 1;
        else if (this.baseSalary<other.baseSalary) return -1;
        else return 0;
    }

    @Override
    public double increaseSalary(Employee employee, int hoursMinimum, double overtimePrice) {
        int overtimeHours =  Math.max(0, employee.getWorkingHours() - hoursMinimum);
        double overtimePay = overtimeHours * overtimePrice;
        baseSalary = employee.getBaseSalary() + overtimePay;
        return baseSalary;
    }


}

