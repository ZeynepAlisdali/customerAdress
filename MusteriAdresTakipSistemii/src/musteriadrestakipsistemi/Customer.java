package musteriadrestakipsistemi;

public class Customer 
{
    protected int id;
    protected String customerName;
    public static Address[] customerAddress;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Customer(int id)
    {
        this.id = id;
        customerAddress = new Address[2];
        CustomerListClass.addCustomer(this);
    }
    
    public Customer(int id, String customerName)
    {
        this.id = id;
        this.customerName = customerName;
        customerAddress = new Address[2];
        CustomerListClass.addCustomer(this);

    }
    
    public void printCurrentCustomerInfo()
    {
        System.out.println("-------Customer Information:----------");
        System.out.println("CustomerId : " + this.id + "Customer Name : " + this.customerName);
        if(customerAddress != null)
        {
            for(Address ad : customerAddress)
            {
                if(ad != null)
                System.out.println( " -" + ad.addressType 
                            + " " +ad.street   
                            + " " +ad.mainStreet 
                            + " " +ad.district 
                            + " " +ad.city 
                            + " " +ad.country );
            }
        }
        System.out.println("-------Customer Information:----------");
    }
    
    public void addCustomerAdress(Address address) 
    { 
        boolean isAdrdressEmpty = false;
        Address adress = address;
        for(int i = 0 ; i<2 ; i++)
        {
            if(customerAddress[i] == null)
            {
                customerAddress[i] = adress;
                isAdrdressEmpty = true;
                AddressListClass.addAddress(address);
                break;
            }
        }
        if(isAdrdressEmpty == false)
        {
            System.out.println("Customer must have most 2 address");
        }
    }
    
    //Overloading
    public void addCustomerAdress(Address address, Address address2) 
    { 
        if(customerAddress[0] != null || customerAddress[1] != null)
        {
          System.out.println("Can not add 2 address at the same time. Please use addCustomerAdress(Address address) method.");  
          
        }
        else
        {
            customerAddress[0] = address;
            customerAddress[1] = address2;
            AddressListClass.addAddress(address);
            AddressListClass.addAddress(address2);
        }
        
    }
    
    public void removeCustomerAdress(int addressId) 
    {
        System.out.println("-------Remove Address----------");
        if(customerAddress == null)
        {
            System.out.println("Customer already does not have address");
        }
        else
        {
            for(int i = 0; i<customerAddress.length; i++)
            {
                if(customerAddress[i].id == addressId)
                {
                   customerAddress[i] = null;
                   AddressListClass.removeAddress(addressId);
                   System.out.println(addressId + " id address deleted");
                }
                else
                {
                    System.out.println(addressId + " id address not found");
                }
                break;
            }
        }
        System.out.println("-------Remove Address----------");
    }
    
    public void listCustomerAddresses() 
    {
        System.out.println("-------Customer Addresses:----------");
        if(customerAddress == null)
        {
            System.out.println("Customer does not have address");
        }
        else
        {
            int cnt = 0;
            for(Address ad : customerAddress)
            {
                if(ad != null)
                {
                    cnt++;
                    System.out.print("Customer ID : " + ad.customerID);
                    System.out.println(", Adres Bilgisi: "
                            + " " +ad.getId() 
                            + " " +ad.addressType 
                            + " " +ad.street  
                            + " " +ad.mainStreet 
                            + " " +ad.district 
                            + " " +ad.city 
                            + " " +ad.country );
                }
                
            }
            System.out.println("Customer has "+ cnt + " address");
        }
        System.out.println("-------Customer Addresses:----------");
    }
    
}
