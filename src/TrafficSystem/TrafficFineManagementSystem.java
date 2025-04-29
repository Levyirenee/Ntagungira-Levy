package TrafficSystem;
import java.util.Scanner;

public class TrafficFineManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ViolationEntry violation = new ViolationEntry();

        // Step 1: Record Violation
        violation.recordViolation();

        // Step 2: Assess Fine
        FineAssessment assessment = new FineAssessment(violation);
        assessment.assessFine();

        // Step 3: Ask for Payment
        System.out.print("Do you want to pay the fine now? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            FinePayment payment = new FinePayment(assessment);
            payment.processPayment();
        } else {
            System.out.println("Payment deferred. Status remains UNPAID.");
        }

        scanner.close();
    }
}
