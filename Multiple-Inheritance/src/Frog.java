public class Frog implements Animal, TerrestrialAnimal, AquaticAnimal{
    @Override
    public void SpecialCapabilities() {
        System.out.println("Frog is an Amphibian Animal");
        System.out.println("Frog lives on both land and water");
    }

    @Override
    public void livesIn() {
        System.out.println("It is an Amphibian Animal, So lives on both land and Water");
    }
}
