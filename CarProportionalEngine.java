public class CarProportionalEngine extends CarEngine {
    public CarProportionalEngine(String name, float acceleration) {
        super(name, acceleration);
    }

    @Override
    public float accelerate(float currentSpeed, float maxSpeed) {
        float finalSpeed = currentSpeed + this.acceleration * ((maxSpeed - currentSpeed) / maxSpeed);
        if(finalSpeed > maxSpeed) {
            finalSpeed = maxSpeed;
        }
        return finalSpeed;
    }
}
