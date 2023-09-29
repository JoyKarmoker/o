public class Dog extends TeristrialAnimal implements Mammal{
    public Dog(){}
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String reproduce() {
        return birthType;
    }
}
