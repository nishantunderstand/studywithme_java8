package java8_Stream_Recap;

/**
 * Question:Given a list of integers,
 * use Java 8 Streams to sort all odd numbers first in descending order,
 * followed by all even numbers in descending order.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortOddAndEvenInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,5,7,7,8,9,10);
        myList.stream()
                .sorted(
                        Comparator.comparingInt((Integer n)->n%2==0?1:0) //<--
                                .thenComparing(Comparator.reverseOrder())
                )
                .forEach(System.out::println);
    }
}


