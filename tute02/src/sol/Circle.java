package sol;

public class Circle {
    static int no_circles = 0;
    String name;
    public Circle() {
        no_circles++;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(Circle.no_circles);

    }
}
