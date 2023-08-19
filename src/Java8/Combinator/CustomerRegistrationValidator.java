package Java8.Combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static Java8.Combinator.ValidationResult.*;

public interface CustomerRegistrationValidator
        extends Function<Customer,ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> {
            System.out.println("running email validation");
            return customer.getEmail().contains("@") ?
                    SUCCESS : EMAIL_NOT_VALID;
        };
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        System.out.println("running Phone Number validation");
        return customer -> customer.getPhoneNumber().length()==10 ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isDobValid(){
        System.out.println("running DOB validation");
        return customer ->
                Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }


}
