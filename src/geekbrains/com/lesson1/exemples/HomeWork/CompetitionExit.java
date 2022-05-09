package geekbrains.com.lesson1.exemples.HomeWork;

import geekbrains.com.lesson1.exemples.HomeWork.Obstacle.Obstacle;
import geekbrains.com.lesson1.exemples.HomeWork.Obstacle.Track;
import geekbrains.com.lesson1.exemples.HomeWork.Obstacle.Wall;
import geekbrains.com.lesson1.exemples.HomeWork.Participiant.*;

public class CompetitionExit {
    public static void main(String[] args) {



      Participant[] participants = new Participant[3];
        participants [0] = new Human("Human");
        participants [1] = new Robot("Robot");
        participants [2] = new Cat("Cat");

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Track(150);
        obstacles[1] = new Wall(3);

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.passObstacle(participant);
                
            }
            
        }

        }

    }


