public class CarEngine {
    protected String name;
    protected float acceleration;

    public CarEngine(String name, float acceleration) {
        this.name = name;
        this.acceleration = acceleration;
    }

    public String getName() {
        return name;
    }

    public float accelerate(float currentSpeed, float maxSpeed) {
        float finalSpeed = currentSpeed + this.acceleration;
        if(finalSpeed > maxSpeed) {
            finalSpeed = maxSpeed;
        }
        return finalSpeed;
    }

    @Override
    public String toString() {
        return "CarEngine [name=" + name + ", acceleration=" + acceleration + "]";
    }
}
