public class LiquidContainer extends Container implements HazardNotifier {
    private boolean hazardous;

    public LiquidContainer(double cargoWeight, int height, int weight, int depth, String serialNumber, double maxLoad, boolean hazardous) {
        super(cargoWeight, height, weight, depth, serialNumber, maxLoad);
        this.hazardous = hazardous;
    }

    @Override
    public void unload() {
        System.out.println("Unloading liquid container...");
        cargoWeight = 0;
    }

    @Override
    public void notifyHazard(String message) {
        System.out.println("HAZARD [" + serialNumber + "]: " + message);
    }

    public void checkFillSafety() {
        if (hazardous && cargoWeight > 0.5 * maxLoad) {
            notifyHazard("Niebezpieczny ładunek przekracza 50% ładowności!");
        } else if (!hazardous && cargoWeight > 0.9 * maxLoad) {
            notifyHazard("Zwykły ładunek przekracza 90% ładowności!");
        }
    }
}
