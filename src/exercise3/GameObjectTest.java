package exercise3;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

public class GameObjectTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GameObject NewGameObject = new GameObject(23.44,32.2,"alive",1.23);

        System.out.printf("Initial Game Object center information is: %s%n", NewGameObject.getCenter());
        System.out.printf("Initial Game Object velocity information is: %s%n", NewGameObject.getVelocity());
        System.out.printf("Initial Game Object state information is: %s%n", NewGameObject.getState());
        System.out.printf("Initial Game Object rotation information is: %s%n%n", NewGameObject.getRotation());


        System.out.printf("New information about the object:%n%n");

        double center = 23.44;
        double velocity = 32.2;
        String state = "alive";
        double rotation = 1.23;

        String message = String.format("Information about Object:%n Object Center:%s | Object Velocity:%s | Object State:%s | Object rotation:%s%n Click OK to change this information" , center , velocity, state,rotation);
        JOptionPane.showMessageDialog(null, message);


        JTextField Center = new JTextField(5);
        JTextField Velocity = new JTextField(5);
        JTextField State = new JTextField(5);
        JTextField Rotation = new JTextField(5);


        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("New Center:"));
        myPanel.add(Center);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("New Velocity:"));
        myPanel.add(Velocity);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("New State:"));
        myPanel.add(State);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("New Rotation:"));
        myPanel.add(Rotation);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter New Information Abount Onject", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Center Changed: " + Center.getText());
            System.out.println("Center Changed: " + Velocity.getText());
            System.out.println("State Changed: " + State.getText());
            System.out.println("Rotation Changed: " + Rotation.getText());


        }

    }

}
