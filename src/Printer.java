import javax.management.BadStringOperationException;

public class Printer <T> {
    T value;
    public Printer(T value){
        this.value=value;

    }

    @Override
    public String toString() {
        return "Printer{" +
                "value=" + value +
                '}';
    }
    public T getValue(){
        return value;
    }

    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>("smthng");
        System.out.println(stringPrinter.toString());
        System.out.println(stringPrinter.getValue());

        Printer<Pearson> pearsonPrinter = new Printer<>(new Pearson(10,"Ko"));
        System.out.println(pearsonPrinter.toString());
        System.out.println(pearsonPrinter.getValue());
    }
}
