package coffee;

import java.util.List;

public class NaiveCoffee {
    private List<Integer> condimentPrices;
    public double getCost() {
        // a coffee by itself with no condiments costs $5 
        double cost = 5.0;
        
        for (int condimentPrice : condimentPrices) {
            cost += condimentPrice;
        }
        return cost;
    }
}
