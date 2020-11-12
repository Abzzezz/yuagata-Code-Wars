package ga.abzzezz.solutions.sevenkyu;

/**
 * https://www.codewars.com/kata/5412509bd436bd33920011bc
 */
public class Credit_Card_Mask {

    public static String maskify(String str) {
        if (str.length() < 4) return str;
        else {
            final StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if(i < str.length() - 4) stringBuilder.append("#");
                else stringBuilder.append(str.charAt(i));
            }

            return stringBuilder.toString();
        }
    }
}
