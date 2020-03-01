package functionalInterfaces;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrimante(1));
        System.out.println(incrmentFunction.apply(1));
    }

    // function
    static int incrimante(int number){
        return number + 1;
    }

    // function interface
    static Function<Integer,Integer> incrmentFunction = number -> number + 1;

}
