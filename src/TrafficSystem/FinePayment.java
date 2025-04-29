package TrafficSystem;
public class FinePayment extends TrafficRecord {

    public FinePayment(FineAssessment assessment) {
        copyData(assessment);
    }

    private void copyData(FineAssessment assessment) {
        this.driverId = assessment.driverId;
        this.driverName = assessment.driverName;
        this.vehiclePlate = assessment.vehiclePlate;
        this.violationType = assessment.violationType;
        this.fineAmount = assessment.fineAmount;
        this.paymentStatus = assessment.paymentStatus;
    }

    @Override
    public void processPayment() {
        System.out.println("==== Payment Processing ====");

        if (paymentStatus.equals("PAID")) {
            System.out.println("Error: Fine already paid.");
        } else {
            paymentStatus = "PAID";
            System.out.println("Payment Successful!");
            System.out.println("Receipt:");
            System.out.println("Driver: " + driverName);
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.println("Paid Amount: " + fineAmount + " RWF");
            System.out.println("Payment Status: " + paymentStatus);
        }
    }

    @Override
    public void assessFine() {}
    @Override
    public void recordViolation() {}
}