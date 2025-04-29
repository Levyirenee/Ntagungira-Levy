package TrafficSystem;
public class FineAssessment extends TrafficRecord {

    public FineAssessment(ViolationEntry entry) {
        copyData(entry);
    }

    private void copyData(ViolationEntry entry) {
        this.driverId = entry.driverId;
        this.driverName = entry.driverName;
        this.vehiclePlate = entry.vehiclePlate;
        this.violationType = entry.violationType;
        this.paymentStatus = entry.paymentStatus;
        this.fineAmount = 0.0;
    }

    @Override
    public void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("Unrecognized Violation Type.");
                return;
        }

        System.out.println("==== Fine Assessment ====");
        System.out.println("Driver: " + driverName);
        System.out.println("Violation: " + violationType);
        System.out.println("Fine Amount: " + fineAmount + " RWF");
    }

    @Override
    public void recordViolation() {}
    @Override
    public void processPayment() {}
}