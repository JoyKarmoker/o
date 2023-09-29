public class AquaticAnimal extends Animal{
    public AquaticAnimal(){
        livesIn = "Water";
    }
    public AquaticAnimal(String name, int age) {
        super(name, age);
        livesIn = "Water"; // Set the value of livesIn to 'Water'
    }
}
