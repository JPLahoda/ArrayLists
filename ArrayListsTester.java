package ArrayLists;
import java.util.*;
public class ArrayListsTester {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("1","2","3"));
        System.out.println(ArrayLists.unique(list));

        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 25, 2, 5, 30, 19, 57, 2, 25));
        System.out.println(ArrayLists.allMultiples(list2,5));

        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("I", "like", "to", "eat", "eat", "eat", "apples", "and", "bananas"));
        System.out.println(ArrayLists.allStringOfSize(list3,3));

        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1, 2, 4));
        ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(2, 1, 4));
        System.out.println(ArrayLists.isPermutation(list4, list5));

        System.out.println(ArrayLists.tokenize("Hello, world!"));

        ArrayList<String> list6 = new ArrayList<String>(Arrays.asList("fire", "ice", "water", "ice", "fire"));
        System.out.println(ArrayLists.removeAll(list6, "ice"));
    }
}
