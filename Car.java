public class Car {
    private String name;
    private float speed;

    private CarBody body;
    private CarEngine engine;
    
    public Car(String name) {
        this.name = name;
        this.body = null;
        this.engine = null;

        this.speed = 0.0f;
    }

    public void setBody(CarBody body) {
        this.body = body;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
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
