package ArrayLists;
import java.util.*;
public class ArrayLists {
    public static <E> Boolean unique(List<E> e){

        for (int i=0; i<e.size(); i++){
            for (int j=0; j<e.size(); j++){
                if (e.get(i)==e.get(j) && i != j){
                    return false;
                }
            }
        }
        return true;
    }

    public static List<Integer> allMultiples(List<Integer> list, int number){

        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i=0; i<list.size(); i++){
            if (list.get(i) % number == 0){
                newList.add(list.get(i));
            }
        }
        return newList;

    }

    public static List<String> allStringOfSize(List<String> list, int number){

        ArrayList<String> newList = new ArrayList<String>();
        for (int i=0; i<list.size(); i++){
            if (list.get(i).length() == number){
                newList.add(list.get(i));
            }
        }
        return newList;

    }

    public static <E> boolean isPermutation(List<E> list1, List<E> list2){
        if (list1.size() != list2.size()){
            return false;
        }
        int count = 0;
        for (int i=0; i<list1.size(); i++){
            for (int j=0; j<list2.size(); j++){
                if (list1.get(i) == list2.get(j)){
                    count++;
                }
                if (count == list1.size()){
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> tokenize(String e){

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(e.replaceAll("\\p{Punct}","").split(" ")));
        //regex method for punctuation removal is present in the code
        return list;
    }


    public static <E> List<E> removeAll(List<E> list, E var){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == var){
                list.remove(i);
            }
        }

        return list;
    }
}