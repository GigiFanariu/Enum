public class Main {

    enum Month {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }

    public static void main(String[] args) {
        for (Month month : Month.values()) {
            if (month.toString().endsWith("y")) {
                System.out.println(month + " ends with y");
            } else {
                System.out.println(month + " doesn't end with y");
            }
        }
    }
}
