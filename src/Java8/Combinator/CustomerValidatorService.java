package Java8.Combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(Customer customer){
        return customer.getEmail().contains("@");
    }

    private boolean isPhoneValid(Customer customer){
        return customer.getPhoneNumber().length()==10;
    }

    private boolean isDobValid(Customer customer){
     //   return customer.getDob().getYear()-LocalDate.now().getYear()>=18;
        return Period.between(customer.getDob(), LocalDate.now()).getYears()>=18;

    }

     public boolean isCustomerValid(Customer c){
        return isEmailValid(c) && isDobValid(c) && isPhoneValid(c);
     }


}
