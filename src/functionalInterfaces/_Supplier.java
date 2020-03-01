package functionalInterfaces;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getConnectionUrl());
        System.out.println(getConnectionsURLSupplier.get());
    }

    // function
    static String getConnectionUrl(){
        return "jdbc://localhos:5432/users";
    }

    // functional interface
    static Supplier<String> getConnectionsURLSupplier = () ->
            "jdbc://localhos:5432/users";

}
