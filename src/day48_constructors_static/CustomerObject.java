package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {


        Customer cs1 = new Customer();
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("bob");
        System.out.println("cs1 = " + cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("john",3);
        
        //array of customers
        
        Customer [] totayCustomers = {cs1,cs2,cs3, new Customer("Illia",4)};

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("mariia",5));
        customerList.add(new Customer("ollie",6));

        System.out.println(totayCustomers[0]);
        System.out.println(customerList.get(4));

        for (int i = 0; i <customerList.size() ; i++) {
            System.out.println(customerList.get(i).getName());
        }
        System.out.println("======================");



    }
    }
