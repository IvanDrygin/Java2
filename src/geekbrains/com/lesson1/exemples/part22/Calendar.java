package geekbrains.com.lesson1.exemples.part22;

public class Calendar {

    public static void main(String[] args) {


        System.out.println("monthNumber = " + DayOfWeek.JANUARY.getRussianMonthName());


        DayOfWeek[] values = DayOfWeek.values();
        for (DayOfWeek value : values) {
            System.out.println(value);
        }
    }
}
