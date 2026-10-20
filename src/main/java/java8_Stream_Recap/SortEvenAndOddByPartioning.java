package java8_Stream_Recap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEvenAndOddByPartioning {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,5,7,7,8,9,10);
        Map<Boolean,List<Integer>> result =
        myList.stream().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println(result);
        System.out.println(result.get(true));

    }
}
