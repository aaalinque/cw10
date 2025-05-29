public class Main {
    public static void main(String[] args) {
        ContainerShip ship = new ContainerShip("Baltic Trader", 25, 3, 15000);

        Container liquid = new LiquidContainer(4000, 250, 3000, 500, "KON-L-001", 5000, true);
        Container gas = new GasContainer(2000, 250, 2000, 500, "KON-G-001", 4000, 2.3);
        Container cold = new RefrigeratedContainer(3000, 250, 2500, 500, "KON-C-001", 5000, "Meat", -15.0);

        ship.addContainer(liquid);
        ship.addContainer(gas);
        ship.addContainer(cold);

        System.out.println("Statek: " + ship);
        System.out.println("Liczba kontenerów: " + ship.getContainers().size());

        for (Container c : ship.getContainers()) {
            System.out.println(" - " + c.getSerialNumber() + " (ładunek: " + c.getCargoWeight() + "kg)");
        }
    }
}
