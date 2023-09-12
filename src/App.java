

import entity.CustomerEntity;
import repository.CustomerRepositary;


public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepositary customerRepositary = new CustomerRepositary();
        CustomerEntity customerEntity = customerRepositary.getCustomer("C001");
        System.out.println(customerEntity.toString());
    }
}
