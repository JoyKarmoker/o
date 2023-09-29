public class Owl extends AvianAnimal implements Mammal{

    public Owl(){}

    public  Owl(String name, int age){
        super(name, age);

    }
    @Override
    public String reproduce() {
        return birthType;
    }
}
