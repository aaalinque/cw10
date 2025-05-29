public class RefrigeratedContainer extends Container {
    private String productType;
    private double currentTemperature;

    public RefrigeratedContainer(double cargoWeight, int height, int weight, int depth, String serialNumber,
                                 double maxLoad, String productType, double currentTemperature) {
        super(cargoWeight, height, weight, depth, serialNumber, maxLoad);
        this.productType = productType;
        this.currentTemperature = currentTemperature;
    }

    @Override
    public void unload() {
        System.out.println("Unloading refrigerated container...");
        cargoWeight = 0;
    }

    public boolean isTemperatureSafe() {
        return currentTemperature >= ProductTemperature.getMinTemperature(productType);
    }
}
