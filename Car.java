public class Car {
    private String name;
    private float speed;

    private CarBody body;
    private CarEngine engine;

    public Car(String name, CarBody body, CarEngine engine) {
        this.name = name;
        this.body = body;
        this.engine = engine;

        this.speed = 0.0f;
    }

    public float getSpeed() {
        return speed;
    }

    public void accelerate() {
        this.speed = this.engine.accelerate(this.speed, this.body.getMaxSpeed());
    }

    @Override
    public String toString() {
        return String.format("{%s, %f km/h}", this.name, this.speed);
    }
}
