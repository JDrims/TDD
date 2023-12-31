import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import prog.PhoneBook;

public class PhoneBookTest {
    @Test
    public void addTest() {
        final int original = 1;
        PhoneBook phoneBook = new PhoneBook();
        final int result = phoneBook.add("Name", "89997776655");
        Assertions.assertEquals(original, result);
    }

    @Test
    public void findByNumberTest() {
        final String original = "Name";
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Name", "89997776655");
        final String result = phoneBook.findByNumber("89997776655");
        Assertions.assertEquals(original, result);
    }

    @Test
    public void findByNameTest() {
        final String original = "89997776655";
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Name", "89997776655");
        final String result = phoneBook.findByName("Name");
        Assertions.assertEquals(original, result);
    }

    @Test
    public void printAllNamesTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Name", "89997776655");
        phoneBook.add("Name1", "87776665544");
        phoneBook.printAllNames();
    }
}
