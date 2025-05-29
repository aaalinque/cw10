import java.util.HashMap;
import java.util.Map;

public class ProductTemperature {
    private static final Map<String, Double> productTemps = new HashMap<>();

    static {
        productTemps.put("Bananas", 13.3);
        productTemps.put("Chocolate", 18.0);
        productTemps.put("Fish", 2.0);
        productTemps.put("Meat", -15.0);
        productTemps.put("Ice cream", -18.0);
        productTemps.put("Frozen pizza", -30.0);
        productTemps.put("Cheese", 7.2);
        productTemps.put("Sausages", 5.0);
        productTemps.put("Butter", 20.5);
        productTemps.put("Eggs", 19.0);
    }

    public static double getMinTemperature(String product) {
        return productTemps.getOrDefault(product, 0.0);
    }
}
