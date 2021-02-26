import java.util.HashMap;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("two");
        strings.add("one");
        strings.add("three");
        System.out.println(strings);
///ctr alt v - переменная
        System.out.println(strings.contains("two"));
        System.out.println(strings.contains("four"));

        for(String str: strings){
            System.out.println(str);
        }

    }
}
