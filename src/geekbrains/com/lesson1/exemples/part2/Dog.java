package geekbrains.com.lesson1.exemples.part2;

public class Dog extends Animal implements Pet, Waterfowl{
    private String type;

    public Dog(String name, int age, String type) {
        super(name, age);
        this.type =type;
    }

    @Override
    public String info() {
        return "This is Dog and my name is" + name;
    }

    @Override
    public int swim() {
        return 150;
    }

    @Override
    public String voice() {
        return "Dog's voice";
    }

    @Override
    public void loveMaster() {
        System.out.println("love you Master");

    }

    @Override
    public boolean isUseful() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " and type is" + this.type;
    }

    @Override
    public int run() {
        return Pet.super.run();
    }
}
