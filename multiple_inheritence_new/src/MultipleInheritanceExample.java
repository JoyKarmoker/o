public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of ElectricCar
        ElectricCar electricCar = new ElectricCar();

        // Calling methods from both interfaces and the class
        electricCar.start();    // from Vehicle interface
        electricCar.stop();     // from Vehicle interface
        electricCar.charge();   // from Electric interface
        electricCar.drive();    // from ElectricCar class

        System.out.println();

        // Creating an instance of GasCar
        GasCar gasCar = new GasCar();

        // Calling methods from the Vehicle interface and GasCar class
        gasCar.start();     // from Vehicle interface
        gasCar.stop();      // from Vehicle interface
        gasCar.refuel();    // from GasCar class
    }
}