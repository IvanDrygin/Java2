package geekbrains.com.lesson1.exemples.part2;

public class Ship implements Waterfowl {
    @Override
    public int swim() {
        return 100_000_000;
    }

    @Override
    public String toString() {
        return "Ship";
    }
}
