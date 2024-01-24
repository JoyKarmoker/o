// Another Concrete Class implementing the first interface
class GasCar implements Vehicle {
    @Override
    public void start() {
        System.out.println("Gas car started.");
    }

    @Override
    public void stop() {
        System.out.println("Gas car stopped.");
    }

    // Additional methods specific to GasCar
    public void refuel() {
        System.out.println("Refueling gas car.");
    }
}