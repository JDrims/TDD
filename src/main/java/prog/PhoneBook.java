package prog;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> list = new TreeMap<>();
    public int add(String name, String number) {
        if(!list.containsKey(name)) {
            list.put(name, number);
        }
        return list.size();
    }

    public String findByNumber(String number) {
        for(String key: list.keySet()) {
            if(number.equals(list.get(key))) {
                return key;
            }
        }
        return null;
    }
}
