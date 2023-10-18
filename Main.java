class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        CarEngine slowEngine = new CarEngine("Pando engine", 10f);
        CarEngine fastEngine = new CarEngine("Farrori engine", 30f);
        CarProportionalEngine proportionalEngine = new CarProportionalEngine("Proporional", 20f);

        CarBody scrapBody = new CarBody("Pando body", 60f);
        CarBody robustBody = new CarBody("Farrori body", 200f);

        Car slowCar = new Car("Pando", scrapBody, slowEngine);
        Car fastCar = new Car("Farrori", robustBody, fastEngine);
        Car mixedCar = new Car("Parrori", robustBody, proportionalEngine);

        for(int i = 1; i <= 10; ++i) {
            System.out.println("Accelerata #" + i);
            slowCar.accelerate();
            fastCar.accelerate();
            mixedCar.accelerate();

            System.out.println(slowCar);
            System.out.println(fastCar);
            System.out.println(mixedCar);
        }
    }
}
