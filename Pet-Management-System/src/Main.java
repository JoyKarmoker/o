public class Main {
    public static void main(String[] args) {
        Food fishFood = new FishFood();
        Food dogFood = new DogFood();
        Food catFood = new CatFood();
        Food birdFood = new BirdFood();

        Dog dog = new Dog();
        dog.name = "Tommy";
        dog.eat(dogFood);
        System.out.println(dog.name + " lives on " + dog.livesIn);
        System.out.println(dog.name + " reproduce " + dog.reproduce());
        System.out.println();

        Cat cat = new Cat();
        cat.name = "Tom";
        cat.eat(catFood);
        System.out.println(cat.name + " lives on " + cat.livesIn);
        System.out.println(cat.name + " reproduce " + cat.reproduce());
        System.out.println();

        Whale  whale = new Whale();
        whale.name = "Wiil";
        whale.eat(fishFood);
        System.out.println(whale.name + " lives in " +whale.livesIn);
        System.out.println(whale.name + " reproduce " + whale.reproduce());
        System.out.println();

        Shark shark = new Shark();
        shark.name = "Sharky";
        shark.eat(fishFood);
        System.out.println(shark.name + " lives in " +shark.livesIn);
        System.out.println(shark.name + " reproduce " + shark.reproduce());
        System.out.println();

        Shark nemo = new Shark("Nemo", 2);
        nemo.eat(fishFood);
        System.out.println(nemo.name + " lives in " + nemo.livesIn);
        System.out.println(nemo.name + " reproduce " +nemo.reproduce());
        System.out.println();

        Dog hank = new Dog("Hank", 4);
        hank.eat(dogFood);
        System.out.println(hank.name + " lives on " + hank.livesIn);
        System.out.println(hank.name + " reproduce " + hank.reproduce());
        System.out.println();

        Owl owl = new Owl();
        owl.name = "Pecha";
        owl.eat(birdFood);
        System.out.println(owl.name + " Lives in " + owl.livesIn);
        System.out.println(owl.name + " reproduce " + owl.reproduce());
        System.out.println();


    }
}