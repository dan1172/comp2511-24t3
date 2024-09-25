package code_review;

public class A {
    char c;
    // Shape s = new Triangle();

    // static type --> 
        // what we declare the variable to be (on the LHs of declaration)
        // lets us do type checking, e.g.: making sure that the methods \
        // do exist on the class, or that ity matches the types of a function call
    // dynamic type --> what type was 
        // what is the type of it underlying in memory?
        
    // public static void main(String[] args) {
    //     C c = new C(); // static = C, dynamic = C
    //     c.speak();  // "quack"
    //     B b = c; // static = B, dynamic = C
    //     b.speak();  // "quack"
    //     b = new B(); // static = B, dynamic B
    //     b.speak(); // "moo"
    //     c.speak(); // "quack"
    // }
    public static void main(String[] args) {
        System.out.println(new A().c);
    }
}

// bike class, and a wheel class
// bike class store an instance of a wheel as an attribuite
// "has a" rellationship

// school "has a" classroom
// student "has a" name

// aggregation and composition
// aggregatioon is when an instance is contained in another class
    // but can exist on its own

// composition is when the instance is integral to the host class
    // so the contained class cannot exist outside of the host


