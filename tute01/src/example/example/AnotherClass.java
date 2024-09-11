package example;
public class AnotherClass {
    public static void main(String[] args) {
        Shouter s = new Shouter("heres a message");
        s.shout();
    }

    // protected means it can be accessed in subclasses
    // other classes in the package
    // the class itself

    // private means it can only be accessed by the class itself
}
