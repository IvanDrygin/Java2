package geekbrains.com.lesson1.exemples.part2;

public class River {

    private final String name;
    private final int widhth;

    public River(String name, int widhth) {
        this.name = name;
        this.widhth = widhth;
    }

    public boolean canSwim(Waterfowl waterfowlAnimal){
     int animalSwimLength = waterfowlAnimal.swim();
        return animalSwimLength >= widhth;
    }
}
