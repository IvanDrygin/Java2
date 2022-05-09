package geekbrains.com.lesson1.exemples.part2;

public class Cat extends Animal implements Pet {
    public Cat(String name, int age) {
        super(name, age);
    }


    protected String catInfo() {
        return "cat  Info";
    }

    @Override
    public String info() {
        return "This is Cat";
    }

    @Override
    public String voice() {
        return "Cat's voice";
    }

    @Override
    public void loveMaster() {
        System.out.println("love you Master");
    }

    @Override
    public boolean isUseful() {
        return false;
    }


}
