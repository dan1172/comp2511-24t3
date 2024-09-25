package shapes;

public class Triangle extends Shape {

    public void triOnly() {

    }
    public static void main(String[] args) {

        // we can declare a variable's static type as
        // any superclass of it as well
        // Object s = new Triangle();

        // static type
            // what it is declared as, so in this case it's Shape

        // dynamic/runtime type
            // what is the type stored underlying in memory
            // when we had overriden methods in subclasses
            // the method actually executed depends on the DYNAMIC/RUNTIME
            // type of the object
    }
}
