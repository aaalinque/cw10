public class GasContainer extends Container implements HazardNotifier {
    private double pressure;

    public GasContainer(double cargoWeight, int height, int weight, int depth, String serialNumber, double maxLoad, double pressure) {
        super(cargoWeight, height, weight, depth, serialNumber, maxLoad);
        this.pressure = pressure;
    }

    @Override
    public void unload() {
        System.out.println("Unloading gas container...");
        cargoWeight *= 0.05;  // zostaje 5%
    }

    @Override
    public void notifyHazard(String message) {
        System.out.println("HAZARD [" + serialNumber + "]: " + message);
    }

    public double getPressure() {
        return pressure;
    }
}
