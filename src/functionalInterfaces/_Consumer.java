package functionalInterfaces;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "+38095000000");
        greetCustomer(maria);
        greetCustomerConsumer.accept(maria);

    }

    // function
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName + " with number "+
                customer.customerPhoneNumber);
    }

    // functional interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+ customer.customerName + " with number "+
                    customer.customerPhoneNumber);


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String custumerNamem, String custumerPhoneNumber) {
            this.customerName = custumerNamem;
            this.customerPhoneNumber = custumerPhoneNumber;
        }
    }
}
