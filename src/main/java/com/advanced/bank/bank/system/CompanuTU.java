import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Comparator;

public class CompanuTU implements Comparable {
    private String name;
    private Employee[] employees = new Employee[5];
    private final int minHours;
    private final double overtime;
    List<Employee> employeesInList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getMinHours() {
        return minHours;
    }

    public double getOvertime() {
        return overtime;
    }

    @Override
    public String toString() {
        return "CompanuTU{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", minHours=" + minHours +
                ", overtime=" + overtime +
                '}';
    }
    public CompanuTU(String fname) throws FileNotFoundException {
            Scanner sc ;
            sc = new Scanner(new File(fname));
            String line = sc.nextLine();
            String[] fields = line.split(" ");
            this.name = fields[0];
            this.minHours = Integer.parseInt(fields[1]);
            this.overtime = Double.parseDouble(fields[2]);
            int i = 0;
            while (sc.hasNextLine()) {
                String line1 = sc.nextLine();
                String[] fields1 = line1.split(" ");
                String empname = fields1[0];
                Double baseSalary = Double.parseDouble(fields1[1]);
                int workingHours = Integer.parseInt(fields1[2]);
                Employee employee = new Employee(empname, baseSalary, workingHours);
                employeesInList.add(employee);
                i++;
            }
            sc.close();
    }

    public void reversedOrder(){
        Collections.sort(employeesInList,Comparator.comparing(Employee::getBaseSalary, Comparator.reverseOrder()));
        employeesInList.stream().forEach(employee -> {
            System.out.println(employee.getName()+" "+ employee.getBaseSalary()+ " "+employee.getWorkingHours());
        });
        System.out.println("Reversed order delimeter \n");
    }
    public void SortBySalary(){
        checkIfIsEmpty();
        calculateAverageSalary();
        Collections.sort(employeesInList);
//        System.out.println("sortbysalary");// for testing purposes
        employeesInList.stream()
                .forEach(employee -> {
            System.out.printf("%s %.2f %d\n", employee.getName(), employee.getBaseSalary(),employee.getWorkingHours());
        });
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        if (this.employeesInList.get(0).getBaseSalary()>other.getBaseSalary())
            return 1;
        else if  (this.employeesInList.get(0).getBaseSalary()<other.getBaseSalary())
            return -1;
        else
            return 0;
    }

    public void calculateAverageSalary() {
        checkIfIsEmpty();
        for (Employee employee : employeesInList){
            employee.increaseSalary(employee,minHours,overtime);
        }
    }

    public void checkIfIsEmpty(){
        if (employeesInList == null || employeesInList.size() == 0) {
            System.out.println("Employee size is " + employeesInList.size() + " null");
        }
    }
    public void calculateAllSalaryAverage() {
        checkIfIsEmpty();
        double totalSalary = employeesInList.stream().mapToDouble(Employee::getBaseSalary).sum();
        double avg = totalSalary/employeesInList.size();
        List<Employee> employeesAboveAvgSalary = new ArrayList<>();
        for (Employee employee : employeesInList) {
            if (employee.getBaseSalary() > avg) {
                employeesAboveAvgSalary.add(employee);
            }
        }
        //not neccesary sorting there
        //Collections.sort(employeesAboveAvgSalary);
        System.out.println("Над средната заплата");
        for (Employee employee : employeesAboveAvgSalary) {
            System.out.printf("%s %.2f %d\n", employee.getName(), employee.getBaseSalary(),employee.getWorkingHours());
        }
    }

    public void getEmplWithLessWorkingHours(){
        Employee min = employeesInList.get(0);
        int n = employeesInList.size();
        for (int i = 1; i < n; i++) {
            if (employeesInList.get(i).getWorkingHours() < min.getWorkingHours()) {
                min = employeesInList.get(i);
            }
        }
        System.out.printf("Най-малко часове\n%s %.2f %d\n", min.getName(), min.getBaseSalary(), min.getWorkingHours());
    }
}
