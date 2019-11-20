package musteriadrestakipsistemi;

import java.util.ArrayList;

public class AddressListClass {
    private static AddressListClass instance;
    public static ArrayList<Address> addressList;       //singleton

    public AddressListClass() {
        
        addressList = new ArrayList<Address>();
    }

    //singleton
    public static AddressListClass getInstance(){
        if(instance == null) {
            instance =  new AddressListClass();
        }
        return instance;
    }

    public static Address findById(int addressId){
        for (Address address: addressList) {
            if(address.getId() == addressId){
                return address;
            }
        }
        return null;
    }

    public static void addAddress(Address address){
        addressList.add(address);
    }

    public static void removeAddress(int addressId){
        Address toBeRemoved = findById(addressId);
        addressList.remove(toBeRemoved);
    }
    
    //overloading
    public static void removeAddress(Address address){
        addressList.remove(address);
    }
    
    public void PrintAllAdresses()
    {
        System.out.println("--------All Addres List----------");
        if(addressList != null)
        {
            for(Address address : addressList)
            {
                System.out.print(" Adres Listesi: Customer Id : " + address.customerID);
                System.out.println(", "
                            + address.getId() + " "
                            + address.street + " "
                            + address.mainStreet + " "
                            + address.district + " "
                            + address.city + " "
                            + address.country + " "
                            + address.addressType + " "
                    );
            }
        }
        else
        {
            System.out.println("Adres List Null");
        }
        System.out.println("--------All Addres List----------");
    }
    
    public void getTotalAddressCount()
    {
        if(addressList != null)
        {
            System.out.println("Address List Class has totallt " + addressList.size() + " address");
        }
        else
        {
            System.out.println("Address List Class Null");
            
        }
    }
    
}
