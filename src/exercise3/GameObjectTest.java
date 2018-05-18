package exercise3;

import java.util.Scanner;

public class GameObjectTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GameObject NewGameObject = new GameObject(23.44,32.2,"alive",1.23);

        System.out.printf("Initial Game Object center information is: %s%n%n", NewGameObject.getCenter());
        System.out.printf("Initial Game Object velocity information is: %s%n%n", NewGameObject.getVelocity());
        System.out.printf("Initial Game Object state information is: %s%n%n", NewGameObject.getState());
        System.out.printf("Initial Game Object rotation information is: %s%n%n", NewGameObject.getRotation());

        
    }

}
