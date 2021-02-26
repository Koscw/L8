public class GenericMethod {
    public static void main(String[] args) {
        Integer integer=printAndGet(123);
        String string= printAndGet("knfdlk");
        Boolean bool=printAndGet(false);
        Pearson pearson= printAndGet(new Pearson(10,"Ilya"));
    }
    public static <T> T printAndGet(T object){
        System.out.println(object);
        return object;
    }
}
