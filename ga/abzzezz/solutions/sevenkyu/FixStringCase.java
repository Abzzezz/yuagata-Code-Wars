package ga.abzzezz.solutions.sevenkyu;

import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/5b180e9fedaa564a7000009a
 */
public class FixStringCase {

    public static String solve(final String str) {
        int upperCase = 0;
        int lowerCase = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) upperCase++;
            else lowerCase++;
        }

        return upperCase > lowerCase ? str.toUpperCase() : str.toLowerCase();
    }
}
