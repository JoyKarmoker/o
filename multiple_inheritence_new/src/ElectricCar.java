class ElectricCar implements Vehicle, Electric {
    @Override
    public void start() {
        System.out.println("Electric car started.");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped.");
    }

    @Override
    public void charge() {
        System.out.println("Charging electric car.");
    }

    // Additional methods specific to ElectricCar
    public void drive() {
        System.out.println("Electric car is driving.");
    }
}