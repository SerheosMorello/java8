package collections.set;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class SetExapmle {
    public static void main(String[] args) {

        // init Sets
        HashSet<Integer> setList = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setList2 = new HashSet<>();

        // show size of Set
        System.out.println(setList.size()); // 4
        System.out.println(setList2.size()); // 0

        // show Sets
        System.out.println(setList); // [1, 2, 3, 4]
        System.out.println(setList2); // []

        // Set is Empty
        System.out.println("setList isEmpty = " + setList.isEmpty()); // false
        System.out.println("setList2 isEmpty = " + setList2.isEmpty()); // true

        // add value to Set
        setList2.add(5);
        System.out.println(setList2); // [5]

        // add Set to Set
        setList2.addAll(setList);
        System.out.println(setList2); // [1, 2, 3, 4, 5]

        // delete Set from Set
        setList2.removeAll(setList); // [5]

        // delete value from Set
        setList2.remove(5);
        System.out.println(setList2); // []

        // clear Set
        setList2.addAll(setList);
        System.out.println(setList2); // [1, 2, 3, 4,]
        setList2.clear();
        System.out.println(setList2); // []

        // Set contains value
        System.out.println("" + setList.contains(1)); // true
        System.out.println("" + setList.contains(5)); // false
    }
}
