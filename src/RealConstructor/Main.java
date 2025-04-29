package RealConstructor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🏗️ Welcome to REAL CONSTRUCTOR – Site Construction Management System");

        System.out.print("Enter Contractor ID: ");
        String contractorId = scanner.nextLine();

        System.out.print("Enter Contractor Name: ");
        String contractorName = scanner.nextLine();

        System.out.print("Enter Material Quantity (in tons): ");
        double quantity = scanner.nextDouble();

        System.out.println("\n📦 Handling Delivery...");
        MaterialDelivery delivery = new MaterialDelivery(contractorId, contractorName, quantity);
        delivery.receiveMaterial();

        double currentBalance = delivery.getMaterialBalance();

        System.out.print("\nEnter Quantity to Use: ");
        double useQty = scanner.nextDouble();

        System.out.println("\n🔧 Using Material...");
        MaterialUsage usage = new MaterialUsage(contractorId, contractorName, useQty, currentBalance);
        usage.useMaterial();

        System.out.println("\n💰 Estimating Cost...");
        CostEstimation cost = new CostEstimation(contractorId, contractorName, useQty);
        cost.estimateCost();

        scanner.close();
    }
}
