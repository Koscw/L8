import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthTest {
    public static void main(String[] args) throws IOException {
        Month jan = Month.January;
        System.out.println(jan);
        System.out.println(jan.getName());
        MonthEnum jan2 = MonthEnum.JANUARY;
        System.out.println(jan2);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input= reader.readLine()).equals("exit")) {
            MonthEnum inputEnum = MonthEnum.valueOf(input.toUpperCase());

            switch (inputEnum) {
                case JANUARY:
                case FEBRUARY:
                case DECEMBER:
                    System.out.println("winter");
                    break;
                case MARCH:
                case APRIL:
                case MAY:
                    System.out.println("spring");
                    break;
            }
        }
    }
}