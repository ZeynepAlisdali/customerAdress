package musteriadrestakipsistemi;

public class IndividualCustomer extends Customer {
   

    public IndividualCustomer(int id) {
        super(id);
    }
    public IndividualCustomer(int id,String CustomerName) {
        super(id,CustomerName);
    }

    
    public String surName;
    private String TCKN;
    
    public String getTCKN() 
    {
        return TCKN;
    }

    public void setTCKN(String TCKN) 
    {
        this.TCKN = TCKN;
    }
    
    private String phoneNumber;
    
    public String getphoneNumber() 
    {
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void printCurrentCustomerInfo()
    {
        System.out.println("-------Customer Information:----------");
        System.out.println("CustomerId : " + this.id + "Customer Name : " + this.customerName);
        System.out.println("Surname : " + this.surName + "TCKN : " + this.TCKN +  "Phone Number : " + this.phoneNumber);
        System.out.println("-------Customer Information:----------");
    }
}

