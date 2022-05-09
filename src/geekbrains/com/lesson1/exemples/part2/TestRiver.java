package geekbrains.com.lesson1.exemples.part2;

public class TestRiver {

    public static void main(String[] args) {
        River river = new River("Volga", 100);
        Waterfowl dog = new Dog("jack", 3, "husky");
        Waterfowl duck = new Duck( "Duck",1);
        Pet pet = new Cat("Max",4);
        Waterfowl ship = new Ship();
        Bird bird = new Bird("Bird", 1);

        swimAcrossRiver(river, dog, duck, ship );
        flyAcrossRiver(river,bird);

        System.out.println(bird instanceof Flyable);
        System.out.println(dog instanceof Flyable);
    }

    private static void swimAcrossRiver(River river, Waterfowl ...waterfowls){
        for (Waterfowl waterfowl : waterfowls) {
            System.out.println(waterfowl);
            System.out.println(river.canSwim(waterfowl));
            System.out.println("---");
        }
    }

    private static void flyAcrossRiver(River river, Flyable flyable){

    }
}