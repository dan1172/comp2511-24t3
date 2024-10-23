package coffee;

public class SugarDecorator implements Coffee {
    private Coffee decoratedCoffee;

    public SugarDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.30;
    }
}
