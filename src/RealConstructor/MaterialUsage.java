package RealConstructor;

public class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity);
        this.materialBalance = materialBalance;
    }

    @Override
    public void useMaterial() {
        if (materialBalance - materialQuantity >= 2) {
            materialBalance -= materialQuantity;
            System.out.println("✅ Material used. Remaining balance: " + materialBalance + " tons.");
        } else {
            System.out.println("❌ Insufficient material. Minimum balance of 2 tons must be maintained.");
        }
    }

    @Override
    public void receiveMaterial() {}
    @Override
    public void estimateCost() {}
}
