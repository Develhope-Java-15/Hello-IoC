public class CarShop {
    public static void mountFastEngine(Car car) {
        CarEngine fastEngine = new CarEngine("Farrori engine", 30f);
        car.setEngine(fastEngine);
    }

    public static void mountSlowEngine(Car car) {
        CarEngine slowEngine = new CarEngine("Pando engine", 10f);
        car.setEngine(slowEngine);
    }

    public static void mountScrapBody(Car car) {
        CarBody scrapBody = new CarBody("Pando body", 60f);
        car.setBody(scrapBody);
    }

    public static void mountRobustBody(Car car) {
        CarBody robustBody = new CarBody("Farrori body", 200f);
        car.setBody(robustBody);
    }
}
