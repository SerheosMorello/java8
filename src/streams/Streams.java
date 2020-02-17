package streams;

import java.util.ArrayList;

public class Streams {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Bob", 18));
        users.add(new User("Sem", 23));
        users.add(new User("Tom", 50));
        users.add(new User("Anna", 35));

        System.out.println("---all list");
        users.stream().
                forEach(x -> System.out.println(x));

        System.out.println("--- filter lis");
        users.stream().
                filter(x -> x.getAge() > 19).
                filter(x -> x.getAge() < 49).
                forEach(x -> System.out.println(x));

        System.out.println("--- sorted list");
        users.stream().
                sorted((x1,x2) -> x1.getName().compareTo(x2.getName())).
                forEach(x -> System.out.println(x));

        System.out.println("--- anyMatch list");
        boolean match = users.stream().anyMatch(user -> user.getName().equals("Anna"));
        System.out.println("Anna contains in list = "+ match);
        match = users.stream().anyMatch(user -> user.getName().equals("Rick"));
        System.out.println("Rick contains in list = "+ match);





    }


}
