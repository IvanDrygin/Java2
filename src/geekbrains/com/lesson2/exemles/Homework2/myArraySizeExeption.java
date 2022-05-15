package geekbrains.com.lesson2.exemles.Homework2;

public class myArraySizeExeption extends RuntimeException {

    public myArraySizeExeption() {
        super("Неверный размер массива, требуется 4x4");
    }
}
