import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Converter {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    private static List<String> pers = new ArrayList<String>();

    static {
        pers.add( "0");
        pers.add( "I");
        pers.add("II");
        pers.add("III");
        pers.add("IV");
        pers.add("V");
        pers.add("VI");
        pers.add("VII");
        pers.add("VIII");
        pers.add("IX");
        pers.add("X");
    }

    public static String topers(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + topers(number - l);
    }

    public static int toArabic(String number) {
return pers.indexOf(number);
    }
}
