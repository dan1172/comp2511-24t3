package example; 

import java.util.Scanner;

public class Sum {
    // read in some numbers from stdin (our terminal)
    // "1 2 3"
    // we want to print out their sum
    // printing out : 6
    public static void main(String[] args) {
        // the scanner class to read in from stdin
        // type: int
        // name of the variable: x
        // what you want it to be initialised to: 5
        // int x = 5;

        // type: Scanner
        // name of variable: sc
        // initialised to: new Scanner(System.in)

        // new instances of classes must first call the "new"
        // keyword, then put the class name, 
        // any arguments you might need
        Scanner sc = new Scanner(System.in);

        // methods are just functions that belong to classes

        // to call functions/methods, we need to specify
        // what class we are calling it form
        String s = sc.nextLine();

        // besides primitive types, 
        // every other type is a class
        // so String is a class and has associated functions
        // as well
        String[] nums = s.split(" ");
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            // static function
            // static functions are called from the
            // class name itself, not any particular instance

            sum = sum + Integer.parseInt(nums[i]); 
        }

        // for each string num in nums
        // writing for-loops like this provide an abstraction
        // on the internal collection


        for (String num : nums) {
            // are we ever required to explicitly describe how to 
            // access a particualr element of the array
            sum = sum + Integer.parseInt(num); 
        }
        System.out.println(sum);
        sc.close();
    }
}

