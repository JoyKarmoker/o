public class Animal {
    public String name;
    public int age;

    public void eat(Food food)
    {
        System.out.println(name + " eating " + food.getName() + " food.");
    }
}
