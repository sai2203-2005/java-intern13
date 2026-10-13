class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal; // Common parent reference

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();

        animal = new Cow();
        animal.sound();
    }
}
