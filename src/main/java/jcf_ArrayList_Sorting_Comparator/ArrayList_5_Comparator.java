package jcf_ArrayList_Sorting_Comparator;



import java.util.*;

class ArrayList_5_Comparator {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(9,8,7);

        Collections.sort(al,new Comparator<Integer>(){    // What if i use new ArrayList
            @Override
            public int compare(Integer a, Integer b){
                return Integer.compare(a,b);
            }
        });



        Collections.sort(al, (a, b) -> Integer.compare(a,b));
        System.out.println(al);
    }
}