package geekbrains.com.lesson2.exemles.Homework2;

public class MyArrayDataExeption extends RuntimeException {
    public MyArrayDataExeption( int row, int col) {

        super(String.format("невозможно получить число из элемента по адресу", row, col));
    }
}
