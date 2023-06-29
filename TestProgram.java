import java.util.ArrayList;
import java.util.Date;

public class TestProgram {
    public static void main(String[] args) {
        ArrayList<Visit> visits = new ArrayList<>();

        // Add customers and their visits to the system
        visits.add(new Visit("John", new Date()));
        visits.add(new Visit("Emily", new Date()));
        visits.add(new Visit("David", new Date()));
        visits.add(new Visit("Sophia", new Date()));
        visits.add(new Visit("Michael", new Date()));

        // Set expenses for each visit
        visits.get(0).setServiceExpense(50.0);
        visits.get(0).setProductExpense(100.0);

        visits.get(1).setServiceExpense(80.0);
        visits.get(1).setProductExpense(150.0);

        visits.get(2).setServiceExpense(30.0);
        visits.get(2).setProductExpense(80.0);

        visits.get(3).setServiceExpense(120.0);
        visits.get(3).setProductExpense(200.0);

        visits.get(4).setServiceExpense(90.0);
        visits.get(4).setProductExpense(120.0);

        // Print visit details
        for (Visit visit : visits) {
            System.out.println(visit);
            System.out.println();
        }
    }
}
