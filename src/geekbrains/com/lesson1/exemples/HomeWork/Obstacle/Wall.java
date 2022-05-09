package geekbrains.com.lesson1.exemples.HomeWork.Obstacle;

import geekbrains.com.lesson1.exemples.HomeWork.Participiant.Participant;

public class Wall implements Obstacle {

    private final int hight;
    public Wall(int hight) {this.hight = hight;}

    @Override
    public boolean passObstacle(Participant participant) {
        if (hight <= participant.jump()){
            System.out.println("Успешно перепрыгнул");
            return true;
        }
        System.out.println("не смог");
        return false;
    }
}
