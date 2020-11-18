package ga.abzzezz.solutions.sixkyu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.codewars.com/kata/5a7f58c00025e917f30000f1
 */
public class Longest_alphabetical_substring {

    public static void main(String[] args) {
        System.out.println(longestAlpabeticalSubstring("nab"));
    }

    public static String longestAlpabeticalSubstring(String text) {
        if(text.length() < 2) return text;
        final List<String> stringList = new ArrayList<>();

        StringBuilder longest = new StringBuilder();

        char last = '\0';
        for (int i = 0; i < text.toCharArray().length; i++) {
            final char c = text.charAt(i);
            if (last > c) {
                stringList.add(longest.toString());
                longest = new StringBuilder();
            }

            longest.append(c);

            last = c;
        }
        stringList.add(longest.toString());
        return stringList.stream().max(Comparator.comparing(String::length)).orElse("");
    }
}
