public class Animal {
    protected String name;
    protected int age;
    protected String livesIn;

    public Animal() { }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(Food food)
    {
        System.out.println(name + " eating " + food.getName() + " food.");
    }

}
