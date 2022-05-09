package geekbrains.com.lesson1.exemples.part22;

public enum DayOfWeek {

    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май");

private String russianMonthName;

    DayOfWeek(String russianMonthName) {
        this.russianMonthName = russianMonthName;
    }

     public String getRussianMonthName(){
        return russianMonthName;
     }
}
