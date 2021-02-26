import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public  class Pearson implements Comparable<Pearson>{
    private final int age;

    private final String name;

    public Pearson(int age, String name){
            this.age = age;
            this.name = name;

        }

    @Override
    public String toString() {
        return "Pearson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Queue<Pearson> pearsons= new PriorityQueue<>();
        Comparator<Pearson> pearsonComparator = new Comparator<Pearson>() {
            @Override
            public int compare(Pearson o1, Pearson o2) {
                if(o1.getName().length() > o2.getName().length()){
                    return -1;
                }
                if(o1.getName().length() < o2.getName().length()){
                    return 1;
                }
                return 0;

            }
        };
        pearsons.add(new Pearson(19,"Ivan"));
        pearsons.add(new Pearson(80,"Anatoly"));
        pearsons.add(new Pearson(18,"Kolya"));
        pearsons.add(new Pearson(40,"Kate"));
        pearsons.add(new Pearson(25,"Vasya"));
        System.out.println(pearsons.poll());
        System.out.println(pearsons.poll());
        System.out.println(pearsons.poll());
        System.out.println(pearsons.poll());
        System.out.println(pearsons.poll());




    }


    @Override
    public int compareTo(Pearson o) {
        if(this.age>o.age){
            return -1;
        }
        if(this.age<o.age){
            return 1;
        }
        return 0;

    }


    public String getName() {
        return name;
    }
}

