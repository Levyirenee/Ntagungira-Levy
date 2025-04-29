package RealConstructor;
public class MaterialDelivery extends ConstructionMaterial {

    public MaterialDelivery(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void receiveMaterial() {
        if (materialQuantity >= 1 && materialQuantity <= 10) {
            materialBalance += materialQuantity;
            System.out.println("✅ Delivery successful! Current material balance: " + materialBalance + " tons.");
        } else {
            System.out.println("❌ Invalid delivery quantity. Must be between 1 and 10 tons.");
        }
    }

    @Override
    public void useMaterial() {}
    @Override
    public void estimateCost() {}
}
