package ga.abzzezz.solutions.sevenkyu;

import java.util.regex.Pattern;

/**
 * https://www.codewars.com/kata/55f8a9c06c018a0d6e000132
 */
public class PinValidations {

    public static boolean validatePin(String pin) {
        return Pattern.compile("\\d{4}|\\d{6}").matcher(pin).matches();
    }
}
