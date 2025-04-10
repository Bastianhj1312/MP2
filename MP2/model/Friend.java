package MP2.model;

public class Friend
{
    private String name;
    private int phone;
    private String address;
    private int postalcode;
    private String city;
   

    public Friend(String name, int phone, String address, int postalcode, String city) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.postalcode = postalcode;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
