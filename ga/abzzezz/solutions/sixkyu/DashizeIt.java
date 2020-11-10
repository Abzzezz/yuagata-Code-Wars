package ga.abzzezz.solutions.sixkyu;

/**
 * https://www.codewars.com/kata/58223370aef9fc03fd000071
 */
public class DashizeIt {

    public static String dashatize(int num) {
        final String stringFromNum = String.valueOf(num);
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < stringFromNum.toCharArray().length; i++) {
            char c = stringFromNum.charAt(i);
            if (Character.isDigit(c)) {
                if (Integer.parseInt(String.valueOf(c)) % 2 == 0) {
                    builder.append(c);
                } else {
                    builder.append("-").append(c).append("-");
                }
            }
        }
        return builder.toString().replaceAll("^-+|-+$", "").replaceAll("--", "-");
    }
}
