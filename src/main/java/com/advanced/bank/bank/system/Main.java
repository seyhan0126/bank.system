import java.io.FileNotFoundException;

public class Main {
    //already cought
    public static void main(String[] args) throws FileNotFoundException {
        CompanuTU companuTU = new CompanuTU("src/test.txt");
//        companuTU.reversedOrder();
        companuTU.SortBySalary();
        companuTU.calculateAllSalaryAverage();
        companuTU.getEmplWithLessWorkingHours();
    }
}
