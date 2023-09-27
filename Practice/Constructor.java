public class Constructor {
    public static void main(String args[]){
        Human obj = new Human();
        Human obj1 = new Human(10, "Roy");
        Human obj2 = new Human("Koy");
        // obj.setAge(30);
        // obj.setName("Joy");
        System.out.println(obj.getName() + " : " +  obj.getAge());
        System.out.println(obj1.getName() + " : " +  obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
    
}




class Human{
    private int age;
    private String name;

    public Human()
    {
        age = 12;
        name = "Jhon";
    }

    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public Human(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}



