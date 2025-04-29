package TrafficSystem;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ViolationEntry extends TrafficRecord {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void recordViolation() {
        System.out.println("==== Record Traffic Violation ====");

        // Driver ID Validation
        while (true) {
            System.out.print("Enter Driver ID (16 digits): ");
            driverId = scanner.nextLine();
            if (driverId.matches("\\d{16}")) break;
            else System.out.println("Invalid Driver ID. Must be 16 digits.");
        }

        // Driver Name
        System.out.print("Enter Driver Name: ");
        driverName = scanner.nextLine();

        // Vehicle Plate Validation
        while (true) {
            System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
            vehiclePlate = scanner.nextLine();
            if (Pattern.matches("[A-Z]{3}\\d{3}[A-Z]", vehiclePlate)) break;
            else System.out.println("Invalid Plate Number. Format: RAB123D");
        }

        // Violation Type Validation
        while (true) {
            System.out.print("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
            violationType = scanner.nextLine().toUpperCase();
            if (violationType.equals("SPEEDING") || violationType.equals("RED_LIGHT") ||
                    violationType.equals("NO_HELMET") || violationType.equals("DUI")) break;
            else System.out.println("Invalid Violation Type.");
        }

        paymentStatus = "UNPAID";
        fineAmount = 0.0;

        System.out.println("Violation recorded successfully!");
        System.out.println("Driver: " + driverName + " | Plate: " + vehiclePlate +
                " | Violation: " + violationType + " | Status: " + paymentStatus);
    }

    @Override
    public void assessFine() {}

    @Override
    public void processPayment() {}
}