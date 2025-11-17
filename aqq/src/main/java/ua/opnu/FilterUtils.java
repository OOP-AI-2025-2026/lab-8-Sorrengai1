package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

//task4
public class FilterUtils {
    public static <T> T[] filter(T[] input, Predicate<T> predicate) {
        int count = 0;
        for (T element : input) {
            if (predicate.test(element)) count++;
        }

        T[] result = Arrays.copyOf(input, count);
        int index = 0;
        for (T element : input) {
            if (predicate.test(element)) {
                result[index++] = element;
            }
        }

        return result;
    }
}
