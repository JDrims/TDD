package prog;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> list = new TreeMap<>();
    public int add(String name, String number) {
        list.put(name, number);
        return list.size();
    }

    public String findByNumber(String number) {
        return null;
    }
}
