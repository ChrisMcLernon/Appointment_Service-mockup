import java.util.ArrayList;
import java.util.List;

public class ContactService {

    static List<Contact> contactList = new ArrayList<>();

    public static void addContact(Contact obj){

        if(contactList.contains(obj)){
            throw new IllegalArgumentException("Contact already exists");
        }

        if(contactList == null){
            contactList.add(0, obj);
        }
        else{
            contactList.add(contactList.size(), obj);
        }

    }

    public static void deleteContact(String ID){
        
        if(contactList == null){
            throw new IllegalArgumentException("No Contacts");
        }
        else{
            for(int i = 0; i < contactList.size(); i++){
                if(contactList.get(i).getContactID() == ID){
                    contactList.remove(i);
                }
            }
        }

    }

    public static void changeContactElement(String elem, String ID, String x){

        int y = getContact(ID);

        if(contactList == null){
            throw new IllegalArgumentException("No Contacts");
        }
        
        if(y == -1){
            throw new IllegalArgumentException("No valid Contact");
        }

            switch (elem) {
            case "firstName":
                contactList.get(y).setFirstName(x);
                break;

            case "lastName":
                contactList.get(y).setLastName(x);
                break;

            case "phone":
                contactList.get(y).setPhone(x);
                break;

            case "address":
                contactList.get(y).setAddress(x);
                break;

            default:
                throw new IllegalArgumentException("Invalid Option");
            }

    }

    public static int getContact(String ID){
        for(int i = 0; i < contactList.size(); i++){
            if(contactList.get(i).getContactID() == ID){
                return i;
            }
        }
        return -1;
    }

}
