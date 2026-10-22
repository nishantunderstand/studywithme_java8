package _comparableVsComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorListImpl {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(9,8,7,6,5,4,3,2,1);

        Collections.sort(myList, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return Integer.compare(a,b);
            }
        });

        Collections.sort(myList,(a,b)->Integer.compare(a,b));
        System.out.println(myList);
    }
}
