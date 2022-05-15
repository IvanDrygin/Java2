package geekbrains.com.lesson2.exemles.lesson;

public class ExeptionApp {

    public static void main(String[] args){

        try {
            someMethod();

            System.out.println("Блок try");
            int[] array = {1,2,3};
            System.out.println(array[400]);
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println( exception.getMessage());

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("обращение к несуществующему индексу массива");
        }
        System.out.println("программа завершена");
    }

    private static void someMethod() {
        int a = 0;
        if (a == 0) {
            throw new DividedByZeroExeption();
        }
        int b = 10 / a;
        System.out.println(b);
    }
}
