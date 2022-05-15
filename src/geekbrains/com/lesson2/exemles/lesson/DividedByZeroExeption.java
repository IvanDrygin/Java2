package geekbrains.com.lesson2.exemles.lesson;

public class DividedByZeroExeption extends ArithmeticException {

    public DividedByZeroExeption() {
        super("Деление на ноль. Кастомный тип исключения");
    }
}
