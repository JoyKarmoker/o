// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Food dogFood = new DogFood();
        dog.name = "Tommy";
        dog.eat(dogFood);

        Cat cat = new Cat();
        Food catFood = new CatFood();
        cat.name = "Tom";
        cat.eat(catFood);

        Fish  fish = new Fish();
        fish.name = "Goldy";
        Food fishFood = new FishFood();
        fish.eat(fishFood);


    }
}