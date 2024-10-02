package stream;

import java.util.*;

public class MyExample {
    public static void main(String[] args) {
        // Let's say we want to sum all the ints in a list
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        int sum1 = 0;
        for (int n : list) {
            sum1 += n;
        }

        int sum2 = 0;
        Set<Integer> set = new HashSet<>(Set.of(1,2,3,4,5));
        for (int n : set) {
            sum2 += n;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
