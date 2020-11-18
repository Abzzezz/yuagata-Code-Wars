package ga.abzzezz.solutions.threekyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5519a584a73e70fa570005f5
 */
public class PrimeStreaming {

    public static IntStream stream() {
        return IntStream.rangeClosed(2, Integer.MAX_VALUE)
                .filter(n -> {
                    if (n == 2) return true;
                    else if (n % 2 == 0) return false;
                    else
                        for (int i = 3; i <= Math.sqrt(n); i += 2) {
                            if (n % i == 0) return false;
                        }
                    return true;
                });
    }

}
