package ga.abzzezz.solutions.sevenkyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.codewars.com/kata/59c5f4e9d751df43cf000035
 */
public class Longest_vowel_chain {

    public static int solve(String s) {
        final Pattern pattern = Pattern.compile("[aeiou]+");
        final Matcher matcher = pattern.matcher(s);
        int longest = 0;

        while (matcher.find()) {
            final String s1 = matcher.group();
            if (s1.length() > longest) {
                longest = s1.length();
            }
        }
        return longest;
    }
}
