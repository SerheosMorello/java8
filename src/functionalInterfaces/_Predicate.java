package functionalInterfaces;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberIsValid("+380950000000"));
        System.out.println(isPhoneNumberIsValidPredicate.test("+380950000000"));
    }

    // function
    static boolean isPhoneNumberIsValid(String number){
        return number.contains("+") && number.length() == 13;
    }

    // functional interface
    static Predicate<String> isPhoneNumberIsValidPredicate = number ->
            number.contains("+") && number.length() == 13;
}
