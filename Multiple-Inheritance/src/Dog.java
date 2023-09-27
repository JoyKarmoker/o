public class Dog implements Animal, TerrestrialAnimal{
    public String color = "Parent Color";
    public String name;
    public String breed;
    public int age;

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void eating()
    {
        System.out.println("Dog eats");
    }

    @Override
    public void SpecialCapabilities() {
        System.out.println("Dog Barks");
    }

    @Override
    public void livesIn() {
        System.out.println("Dog Lives On Land");
    }
}
