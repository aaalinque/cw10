import java.util.ArrayList;
import java.util.List;

public class ContainerShip {
    private String name;
    private int speed;
    private int maxContainers;
    private double maxWeight;
    private List<Container> containers = new ArrayList<>();

    public ContainerShip(String name, int speed, int maxContainers, double maxWeight) {
        this.name = name;
        this.speed = speed;
        this.maxContainers = maxContainers;
        this.maxWeight = maxWeight;
    }

    public boolean addContainer(Container c) {
        if (containers.size() < maxContainers && getTotalWeight() + c.getCargoWeight() <= maxWeight) {
            containers.add(c);
            return true;
        }
        return false;
    }

    public double getTotalWeight() {
        double sum = containers.stream().mapToDouble(Container::getCargoWeight).sum();
        return sum;
    }

    public List<Container> getContainers() {
        return containers;
    }

    @Override
    public String toString() {
        return name + " (speed=" + speed + ", maxContainers=" + maxContainers + ", maxWeight=" + maxWeight + ")";
    }
}
