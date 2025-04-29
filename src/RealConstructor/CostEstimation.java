package RealConstructor;
public class CostEstimation extends ConstructionMaterial {

    public CostEstimation(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void estimateCost() {
        double costPerTon;
        if (materialQuantity >= 5 && materialQuantity <= 15) {
            costPerTon = 200000;
        } else if (materialQuantity > 15) {
            costPerTon = 180000;
        } else {
            System.out.println("❌ Quantity too low for cost estimation.");
            return;
        }

        double totalCost = costPerTon * materialQuantity;
        System.out.println("📋 Cost Estimation");
        System.out.println("----------------------");
        System.out.println("Contractor ID   : " + contractorId);
        System.out.println("Contractor Name : " + contractorName);
        System.out.println("Quantity Used   : " + materialQuantity + " tons");
        System.out.printf("Total Cost      : %, .2f RWF%n", totalCost);
    }

    @Override
    public void receiveMaterial() {}
    @Override
    public void useMaterial() {}
}
