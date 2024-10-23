package coffee;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost() + "\n");
        

        // add the milk decorator
        coffee = new MilkDecorator(coffee);


        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost() + "\n");
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost() + "\n");
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
