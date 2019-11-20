package musteriadrestakipsistemi;

public class Address {
    
    protected int id;
    public int customerID;

    public Address(int addresid, int custId)
    {
        this.id = addresid;
        this.customerID = custId;
    }
    
    public Address(int addresid, int custId, String street, String mainStreet,
            String district, String city, String country, String addressType)
    {
        this.id = addresid;
        this.customerID = custId;
        this.street = street;
        this.mainStreet = mainStreet;
        this.district = district;
        this.city = city;
        this.country = country;
        this.addressType = addressType;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String street; //sokak
    public String mainStreet; //cadde
    public String district;
    public String city;
    public String country;
    public String addressType;
    
}

