package ga.abzzezz.solutions.sixkyu;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * https://www.codewars.com/kata/5efae11e2d12df00331f91a6
 */
public class CrackThePin {

    public static String crack(String hash) {
        try {
            final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (int i = 0; i < 100000; i++) {
                final String s = String.format("%05d", i);
                messageDigest.update(s.getBytes());
                if (String.format("%032x", new BigInteger(1, messageDigest.digest())).equals(hash))
                    return s;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}