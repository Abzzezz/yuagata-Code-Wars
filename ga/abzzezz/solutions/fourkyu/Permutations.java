package ga.abzzezz.solutions.fourkyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/5254ca2719453dcc0b00027d/
 */
public class Permutations {

    public static List<String> singlePermutations(String s) {
        final List<String> possibleCombinations = new ArrayList<>();
        permute(s, 0, s.length() - 1, possibleCombinations);
        return possibleCombinations.parallelStream().distinct().collect(Collectors.toList());
    }

    public static void permute(String string, final int start, final int end, final List<String> possibleCombinations) {
        if (start == end) possibleCombinations.add(string);

        for (int i = start; i <= end; i++) {
            string = swap(string, start, i);
            permute(string, start + 1, end, possibleCombinations);
            string = swap(string, start, i);
        }

    }

    public static String swap(final String string, final int swapOne, final int swapTwo) {
        final char temp;
        final char[] chars = string.toCharArray();
        temp = chars[swapOne];
        chars[swapOne] = chars[swapTwo];
        chars[swapTwo] = temp;
        return new String(chars);
    }
}
