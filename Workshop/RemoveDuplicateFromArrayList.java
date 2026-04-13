package Workshop;


import java.util.*;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Duplication"+list);
        Set<Integer> set = new HashSet<>(list);
        ArrayList<Integer> UniqueList = new ArrayList<>(list);
        System.out.println("UniqueList"+UniqueList);
    }
}
