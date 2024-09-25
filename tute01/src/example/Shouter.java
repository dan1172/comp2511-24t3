package example; 

public class Shouter {
    // variables left as private
    // attributes --> are variables in a class
    private String message;

    // constructor
    // initialises the internal state of the class
    public Shouter(String message) {
        this.message = message;
    }

    // using setters and getters gives more explicit
    // control on read and write access
    // andd effectively abstracts away the internal details

    // anyone who calls this function
    // will be returned the message stored
    // "read" access
    public String getMessage() {
        return this.message;
    }

    // "write" access
    public void setMessage(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("hello world");
        shouter.shout();
        System.out.println(shouter.getMessage());
        shouter.setMessage("another message");
        System.out.println(shouter.getMessage());
    }
}
