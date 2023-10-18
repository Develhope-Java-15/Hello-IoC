public class CarBody {
    private String name;
    private float maxSpeed;

    public CarBody(String name, float maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "CarBody [name=" + name + ", maxSpeed=" + maxSpeed + "]";
    }
}
