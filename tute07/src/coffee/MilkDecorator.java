package coffee;

public class MilkDecorator implements Coffee {
    private Coffee decoratedCoffee;

    public MilkDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.5;
    }
}
