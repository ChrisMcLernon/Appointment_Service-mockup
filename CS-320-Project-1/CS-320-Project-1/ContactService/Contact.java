public class Contact {
    
    String contactID;
    String firstName;
    String lastName;
    String phone;
    String address;

    public Contact(String ID, String firstName, String lastName, String phone, String address){

        if(ID == null || ID.length() > 10){
            throw new IllegalArgumentException("Invalid ID");
        }

        if(firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("Invalid First Name");
        }

        if(lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("Invalid Last Name");
        }

        if(phone == null || phone.length() != 10){
            throw new IllegalArgumentException("Invalid Phone Number");
        }

        if(address == null || address.length() > 30){
            throw new IllegalArgumentException("Invalid Address");
        }

        contactID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;

    }

    public String getAddress() {
        return address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getContactID() {
        return contactID;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        
        if(address == null || address.length() > 10){
            throw new IllegalArgumentException("Invalid Address");
        }

        this.address = address;
    }
    public void setFirstName(String firstName) {

        if(firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("Invalid First Name");
        }

        this.firstName = firstName;
    }
    public void setLastName(String lastName) {

        if(lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("Invalid Last Name");
        }

        this.lastName = lastName;
    }
    public void setPhone(String phone) {

        if(phone == null || phone.length() > 10){
            throw new IllegalArgumentException("Invalid Phone Number");
        }

        this.phone = phone;
    }
}
