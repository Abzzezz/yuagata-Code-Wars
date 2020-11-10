package ga.abzzezz.solutions.sixkyu;

/**
 * https://www.codewars.com/kata/57829376a1b8d576640000d6
 * Pretty fun kata, imo
 */
public class TrumpnessDetector {

    public static double detect(String trumpySpeech) {
        final char[] chars = new char[]{'a', 'e', 'i', 'o', 'u'};
        char last = ' ';

        double vowels = 0;
        double matches = 0;

        for (char c : trumpySpeech.toLowerCase().toCharArray()) {
            for (char aChar : chars) {
                if (aChar == c) {
                    if (last == c) {
                        matches++;
                    } else vowels++;
                }
            }
            last = c;
        }

        double result = matches / vowels;
        if (Double.isNaN(result)) return 0;

        return Math.round(result * 100.0) / 100.0;
    }
}
