import java.util.*;
import java.io.*;

class Main {
    public static String ArrayChallenge(String[] strArr) {
        // Initialize a set to store the integers
        TreeSet<Integer> set = new TreeSet<>();

        // Process each element in the array
        for (String element : strArr) {
            if (element.equals("E")) {
                // Remove the smallest integer from the set
                set.pollFirst();
            } else {
                // Add the integer to the set
                set.add(Integer.parseInt(element));
            }
        }

        // Convert the set back to a string with commas
        StringBuilder result = new StringBuilder();
        for (int num : set) {
            result.append(num).append(",");
        }

        // Remove the trailing comma
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(s.nextLine().split(" ")));
    }
}
