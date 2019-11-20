package musteriadrestakipsistemi;

import java.util.ArrayList;

public class CustomerListClass {
    
    private static CustomerListClass instance;
    public static ArrayList<Customer> customerList ;
    
    public CustomerListClass() {
        
        customerList = new ArrayList<Customer>();
    }
    
    //singleton
    public static CustomerListClass getInstance(){
        if(instance == null) {
            instance =  new CustomerListClass();
        }
        return instance;
    }
    
     public Customer findById(Integer id){
        for (Customer customer: customerList) {
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }
    
    public static void addCustomer(Customer customer){
        customerList.add(customer);
    }
    
    public void removeCustomer(Integer id){
        Customer toBeRemoved = findById(id);
        customerList.remove(toBeRemoved);
    }
    
    //overloading
    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
    
    public void listAllCustomers()
    {
        System.out.println("-------All Customer List----------");
        if(customerList != null)
        {
            for( Customer customer : customerList)
            {
                System.out.println("Customer ID:" + customer.id + ", " + "CustomerName: " + customer.customerName);
            }
        }
        else
        {
            System.out.println("CustomerRepository Class Null");
        }
        System.out.println("-------All Customer List----------");
    }
    
    public int getTotalCustomerCount()
    {
        if(customerList != null)
        {
            return customerList.size();
        }
        else
        {
            System.out.println("CustomerRepository Class Null");
            return 0 ;
        }
    }
    
}
