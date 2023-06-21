import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContactServiceTest {
    
    Contact testContact_1 = new Contact("111", "Chris", "Mcler", "3333333333", "111");
    Contact testContact_2 = new Contact("222", "Chris", "Mcler", "3333333333", "111");

    @Test
    public void addContactTest(){

        ContactService.addContact(testContact_1);
        ContactService.addContact(testContact_2);

        assertTrue("Not Added", testContact_1 == ContactService.contactList.get(ContactService.getContact("111")));
        assertTrue("Not Added", testContact_2 == ContactService.contactList.get(ContactService.getContact("222")));
    }

    @Test
    public void deleteContactTest(){

        ContactService.deleteContact(testContact_2.getContactID());

        assertFalse("Not Deleted", ContactService.contactList.contains(testContact_2));

    }

    @Test
    public void changeContactElementTest(){

        ContactService.changeContactElement("firstName", "111", "Alex");
        ContactService.changeContactElement("lastName", "111", "James");
        ContactService.changeContactElement("phone", "111", "4444444444");
        ContactService.changeContactElement("address", "111", "222");

        assertTrue("Not Changed", ContactService.contactList.get(ContactService.getContact("111")).getFirstName() == "Alex");
        assertTrue("Not Changed", ContactService.contactList.get(ContactService.getContact("111")).getLastName() == "James");
        assertTrue("Not Changed", ContactService.contactList.get(ContactService.getContact("111")).getAddress() == "222");
        assertTrue("Not Changed", ContactService.contactList.get(ContactService.getContact("111")).getPhone() == "4444444444");
    }

}
