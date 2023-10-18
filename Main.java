class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        Car slowCar = new Car("Pando");
        Car fastCar = new Car("Farrori");
        Car mixedCar = new Car("Parrori");

        CarShop.mountScrapBody(slowCar);
        CarShop.mountSlowEngine(slowCar);

        CarShop.mountRobustBody(fastCar);
        CarShop.mountFastEngine(fastCar);

        CarShop.mountRobustBody(mixedCar);
        CarShop.mountSlowEngine(mixedCar);

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
