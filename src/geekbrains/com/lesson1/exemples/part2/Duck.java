package geekbrains.com.lesson1.exemples.part2;

public class Duck extends Animal implements Waterfowl, Pet{
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public String info() {
        return "This is Duck";
    }



    @Override
    public boolean isUseful() {
        return true;
    }

    @Override
    public String voice() {
        return "Duck's voice ";
    }

    @Override
    public void loveMaster() {
        System.out.println("love you master");

    }

    @Override
    public int swim() {
        return 20;
    }

    @Override
    public int run() {
        return Pet.super.run();
    }
}
