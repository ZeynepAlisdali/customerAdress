package musteriadrestakipsistemi;

public class MainTestClass {

    public static void main(String[] args) {
        
        //Bu listeleri(repositoryler) en basta tanımlamamız gerekiyor
        AddressListClass addressRepository = AddressListClass.getInstance();
        CustomerListClass customerRepository = CustomerListClass.getInstance();     

        //Müşteri Tanımlama, arraylist ekleme, child class
        CorporateCustomer coCust1 = new CorporateCustomer(1);
        coCust1.customerName = "Software Company";
        coCust1.settaxNumber("12345");
        
        //Müşteriye adres tanımlama
        Address coCustAddress = new Address(1, 1);
        coCustAddress.street = "Ahibaba  sok.";        
        coCustAddress.mainStreet = "Kenan Evren Cd.";
        coCustAddress.district = "AliBaba Mh.";
        coCustAddress.country = "Türkiye";
        coCustAddress.city = "Manisa";
        coCustAddress.addressType = "İş adresi";
        
        //Müşteriye adres tanımlama
        Address coCustAddress2 = new Address(2, 1);
        coCustAddress2.street = "Mahmut  sok.";        
        coCustAddress2.mainStreet = "Ali Evren Cd.";
        coCustAddress2.district = "Zıraat Mh.";
        coCustAddress2.country = "Türkiye";
        coCustAddress2.city = "Konya";
        coCustAddress2.addressType = "İş adresi";

        //overloading - array ekleme, arrayList ekleme
        coCust1.addCustomerAdress(coCustAddress, coCustAddress2);
        //ArraylistListeleme
        addressRepository.PrintAllAdresses();
        //overriding
        coCust1.printCurrentCustomerInfo();
        //array listeleme
        coCust1.listCustomerAddresses();
        //arraylist listelem
        customerRepository.listAllCustomers();
        //arraylist toplam count bulma
        addressRepository.getTotalAddressCount();
        
        System.out.println();
        System.out.println();
        
        //array silme, arraylist silme
        coCust1.removeCustomerAdress(1);
        coCust1.listCustomerAddresses();
        customerRepository.listAllCustomers();
        addressRepository.PrintAllAdresses();
        addressRepository.getTotalAddressCount();
    }
    
}
