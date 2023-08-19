package Java8.Combinator;



import OOPS.GenericsDemo.CustomArrayList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer Alice = new Customer("Alice","Alice@gmail.com","1234z67890"
        , LocalDate.of(2000,2,12));

        System.out.println(Alice);

//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        boolean b = validatorService.isCustomerValid(Alice);
//        System.out.println(b);

        ValidationResult validationResult = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isDobValid())
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .apply(Alice);
        if (validationResult != ValidationResult.SUCCESS) {
            throw new IllegalStateException(validationResult.name());
        }
        else{
            System.out.println("Valid Customer");
        }
    }
}
