package dbc;

import java.util.*;

public class MakeList {
    /**
     * @preconditions n >= 1
     * @postconditions returns list containing 
     *                 numbers 1 to n inclusive, in increasing order
     */
    public static List<Integer> makeList(int n) {
        // we DO NOT need to do this 
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        // or this
        assert((n >= 1) == true); 

        // maintaining preconditions are the responsibility of the client

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(makeList(-1));
    }
}
