package ga.abzzezz.solutions.sixkyu;

/**
 * https://www.codewars.com/kata/5727bb0fe81185ae62000ae3
 * Super whack solution
 */
public class BackspacesInString {

    public static String cleanString(String s) {
        if(s.isEmpty()) return "";

        final StringBuilder builder = new StringBuilder(s);
        int start = 0;
        int length = 0;

        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            final char c = s.charAt(i);
            if (c == '#') {
                start = i;
                break;
            }
        }

        for (int i = start; i >= 0; i--) {
            final char charAt = builder.charAt(i);
            if (charAt == '#') {
                length++;
            } else {
                for (int l = 0, charIndex = i - l; l < length && charIndex >= 0 && length > 0; l++) {
                    if (builder.charAt(charIndex) == '#') {
                        i = charIndex;
                        break;
                    } else {
                        builder.deleteCharAt(charIndex);
                        length--;
                    }
                }
            }
        }
        return builder.toString().replace("#", "");
    }
}
