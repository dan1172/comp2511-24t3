package circle;

public class Circle extends Object {
    // Every class extends Object, it is not needed though
    private static final double pi = 3.14159;
    private int x, y;
    private int r;
	
    // Only 1 variable for all Circle objects
    static int no_circles = 0; 

    public Circle() {
        super(); // not needed
        no_circles++;
    }
    
     public double circumference() {
        return 2 * pi * r;
    }
    public static void main(String[] args) {
        // System.out.println(Circle.no_circles);
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        System.out.println(Circle.no_circles);

    }
}