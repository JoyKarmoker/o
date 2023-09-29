public class Cat extends TeristrialAnimal implements Mammal{
    public Cat(){}
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String reproduce() {
        return birthType;
    }
}
