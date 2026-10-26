package java8_Stream_Recap;

/**
 * Question: Given a list of integers, use Java 8 Streams to sort all odd numbers first,
 * followed by all even numbers, without sorting the numbers within each group.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortOddAndEven {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,5,7,7,8,9,10);
        myList.stream()
                .sorted(Comparator.comparingInt(n->n%2==0?1:0))
                .forEach(System.out::println);

        System.out.println("====== Thursday, October 15, 2026 1:19:36 PM ======");
        System.out.println("====== In Descending Order  ======");

        myList.stream()
                .sorted(Comparator.comparingInt((Integer n)->n%2==0?1:0).reversed())
                .forEach(System.out::println);
    }
}


