public class Month {
    public static Month January = new Month("January");
    public static Month February = new Month("February");
    public static Month March = new Month("March");
    public static Month April = new Month("April");
    public static Month May = new Month("May");
    public static Month June = new Month("June");
    public static Month July = new Month("July");
    public static Month August = new Month("August");
    public static Month September = new Month("September");
    public static Month October = new Month("October");
    public static Month November = new Month("November");
    public static Month December = new Month("December");



    String name;

    private  Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
