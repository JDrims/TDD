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
}
