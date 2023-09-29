public class Shark extends AquaticAnimal implements Oviparous {
    public Shark(){}

    public Shark(String name, int age){
        super(name, age);
    }
    @Override
    public String reproduce() {
        return birthType;
    }
}
