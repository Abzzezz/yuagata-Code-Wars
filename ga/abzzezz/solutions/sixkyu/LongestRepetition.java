package ga.abzzezz.solutions.sixkyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.codewars.com/kata/586d6cefbcc21eed7a001155
 */
public class LongestRepetition {
    
    public static Object[] longestRepetition(String s) {
        if (s.isEmpty()) return new Object[]{"", 0};
        else {
            final Pattern pattern = Pattern.compile("(\\w)\\1+");
            final Matcher matcher = pattern.matcher(s);
            String longest = "";

            while (matcher.find()) {
                final String group = matcher.group();
                if (group.length() > longest.length()) {
                    longest = group;
                }
            }
            return new Object[]{longest.isEmpty() ? longest : longest.substring(0, 1), longest.length()};
        }
    }
}
