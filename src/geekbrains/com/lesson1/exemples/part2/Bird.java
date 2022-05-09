package geekbrains.com.lesson1.exemples.part2;

public class Bird extends Animal implements Flyable{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String info() {
        return "Bird";
    }
}
