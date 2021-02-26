import java.util.HashMap;

public class HashMaoTest {


    public static void main(String[] args) {
        HashMap<String,Integer> items= new HashMap<>();
        items.put(null,3);
        items.put(null,4);



        items.put("яблоки",1);
        items.put("яблоки",3);
        items.put("яблоки",2);
        items.put("груши",1);
        items.put("сливы",3);
        items.put("бананы",4);

        System.out.println(items);

        System.out.println(items.get("бананы"));

        if(items.containsKey("груши")){
            System.out.println("есть");
        }


    }
}
