package dbc;

import java.util.*;

public class SuperClass {
    /**
     * @postcondition returns a number n between 0 <= n < 100
     */
    public int getRandomNum() {
        Random r = new Random();
        return r.nextInt(100);
    }
}

class SubClass extends SuperClass {
    /**
     * @postcondition returns a number n between 0 <= n < 50
     */
    public int getRandomNum() {
        Random r = new Random();
        return r.nextInt(50);
    }
}