package exercise3;

public class GameObject {
    private double center = 23.44;
    private double velocity = 32.2;
    private String state = "alive";
    private double rotation = 1.23;
    private double x = 5.04;
    private double y = 9.003;

    //Constructor
    public GameObject(double centerNew, double velocityNew, String stateNew, double rotationNew)
    {
        center = centerNew;
        velocity = velocityNew;
        state = stateNew;
        rotation = rotationNew;

    }

    //Return all information method
    public String GetPatientInfo()
    {
        return ("Object center : " + this.center + " Object velocity " + this.velocity + " Object state: " + this.state + " Object rotation " + this.rotation);
    }

    //Allow to user to get information

    public double getCenter()
    {
        return center;
    }
    public double getVelocity()
    {
        return velocity;
    }
    public String getState()
    {
        return state;
    }
    public double getRotation()
    {
        return rotation;
    }

}
