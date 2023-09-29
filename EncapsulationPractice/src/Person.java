public class Person {
    // Private instance variables (encapsulated data)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Using the setter method for data validation
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with data validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Assume a reasonable age range
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Alice", 30);

        // Accessing and modifying encapsulated data using getter and setter methods
        person.setName("Bob");
        person.setAge(25);

        // Displaying information
        person.displayInfo();
    }
}
