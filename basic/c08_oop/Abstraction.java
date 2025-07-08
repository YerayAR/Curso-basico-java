package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class Abstraction {

    public static void main(String[] args) {

        // Abstracción
        // - Permite ocultar los detalles de implementación y mostrar solo las características esenciales.
        // - Se logra mediante clases abstractas e interfaces.

        // - Clase abstracta

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface
        var bird = new Bird();
        bird.fly();
        bird.sound();
        dog.sleep();

        var bat = new Bat();
        bat.fly();  
        bat.sound();
        dog.sleep();
    }

    // - Clase abstracta

    public abstract static class Animal {

        public abstract void sound();

        public void sleep() {
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep() {
            System.out.println("El perro está durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }
    }

    // - Interface

    public interface Flying {

        void fly();
    }

    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Pio pio");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Soy batman!");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }
}
