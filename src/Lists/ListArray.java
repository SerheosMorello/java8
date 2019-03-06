package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListArray {

    public static void main(String[] args) {
        // create an array list
        ArrayList al = new ArrayList(); // init empty list
        System.out.println(al); // []
        ArrayList al2 = new ArrayList(Arrays.asList("1","2","3")); // init list with values
        System.out.println(al2); // [1, 2, 3]

        // add element in to list
        al.add("one"); // add one element in list
        System.out.println(al); // [one]
        al.addAll(Arrays.asList("two","three","four","five")); // add list values in to list
        System.out.println(al); // [one, two, three, four, five]
        al.add(5, "six"); // add element by index
        System.out.println(al); // [one, two, three, four, five, six]
        al.add(al.size(), "seven"); // add element by index
        System.out.println(al); // [one, two, three, four, five, six, seven]
        al.addAll(al.size(),al2); // add list values by index
        System.out.println(al); // [one, two, three, four, five, six, seven, 1, 2, 3]

        //remove elements in to list
        al.removeAll(al2); // remove sut list in to list
        System.out.println(al); // [one, two, three, four, five, six, seven]
        al.remove("seven"); // remove element by name element
        System.out.println(al); // [one, two, three, four, five, six]
        al.remove(al.size()-1); // remove element by index
        System.out.println(al); // [one, two, three, four, five]

        //printing each element of list
        for (int i = 0 ; i < al2.size(); i++) {
                System.out.print(al2.get(i)); //123
        }
        System.out.println();

        al2.forEach(x -> System.out.print(x+", ")); // 1, 2, 3,
        System.out.println();

        Iterator<String> iter = al.iterator(); // create iterator
        while(iter.hasNext()){
            System.out.print(String.format("%s, ", iter.next())); //one, two, three, four, five,
        }
        System.out.println();
        System.out.println("al list contain one element - " + al.contains("one"));
        System.out.println("al list is empty - " + al.isEmpty());


    }
}
