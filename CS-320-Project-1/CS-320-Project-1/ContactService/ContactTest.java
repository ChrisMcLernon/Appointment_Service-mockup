import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactTest {
    
    Contact testContact = new Contact("111", "Chris", "McLer", "3333333333", "111");

    @Test
    public void constructorTest(){
        assertEquals("111", testContact.getContactID());
        assertEquals("Chris", testContact.getFirstName());
        assertEquals("McLer", testContact.getLastName());
        assertEquals("3333333333", testContact.getPhone());
        assertEquals("111", testContact.getAddress());
    
    }

}