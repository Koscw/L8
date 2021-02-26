import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
    public static void main(String[] args) throws IOException {
        HashSet<String> statuses = new HashSet<>();
        String aNew = "new";
        String inProgress ="in progess";
        String done ="done";
        String failed ="failed";
        String lost =" lost";

        statuses.add(aNew);
        statuses.add(inProgress);
        statuses.add(done);
        statuses.add(failed);
        statuses.add(lost);

        System.out.println(statuses);
        for(String str: statuses){
            System.out.println(str);
        }
        Set<String> goodStatuses = Set.of(aNew,inProgress,done);
        Set<String> badStatuses = Set.of(failed,lost);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String orderStatus;
        while(!(orderStatus= reader.readLine()).equals("exit")) {
            if (goodStatuses.contains(orderStatus)) {
                System.out.println("Everything is good");
                break;
            }
            if (badStatuses.contains(orderStatus)) {
                System.out.println("Everything is bad , you have lost your money ) ");
                break;
            } else {
                System.out.println("Unknown status ");
                break;
            }

        }
    }
}
