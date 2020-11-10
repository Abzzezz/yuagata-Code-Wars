package ga.abzzezz.solutions.sixkyu;

/**
 * https://www.codewars.com/kata/59f08f89a5e129c543000069
 */
public class String_array_duplicates {

    public static String[] dup(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("([A-Za-z])\\1+", "$1");
        }
        return arr;
    }
}
