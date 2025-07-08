package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369

Archivo AUTOCONTENIDO con los ejercicios 1‑10, métodos de prueba y un
método main que los invoca de forma ordenada.
*/

public class AbstractionExercises {

    /* =============================================================
    1. SHAPE (abstract + subclases)                              
    ============================================================= */
    public static abstract class Shape {
        public abstract double calculateArea();
    }

    public static class Circle extends Shape {
        private final double radius;
        public Circle(double radius) { this.radius = radius; }
        @Override public double calculateArea() { return Math.PI * radius * radius; }
    }

    public static class Rectangle extends Shape {
        private final double width, height;
        public Rectangle(double width, double height) {
            this.width = width; this.height = height;
        }
        @Override public double calculateArea() { return width * height; }
    }

    /* =============================================================
    2. PLAYABLE (interfaz + implementaciones)                    
    ============================================================= */
    public interface Playable { void play(); }
    public static class Guitar implements Playable { @Override public void play() { System.out.println("Strumming the guitar!"); }}
    public static class Piano  implements Playable { @Override public void play() { System.out.println("Playing the piano!");   }}

    /* =============================================================
    3. ANIMAL (abstract + polimorfismo)                          
    ============================================================= */
    public static abstract class Animal { public abstract void makeSound(); }
    public static class Dog extends Animal { @Override public void makeSound() { System.out.println("Woof!"); } }
    public static class Cat extends Animal { @Override public void makeSound() { System.out.println("Meow!"); } }
    private static void demonstratePolymorphism() {
        Animal[] pets = { new Dog(), new Cat() };
        for (Animal a : pets) a.makeSound();
    }

    /* =============================================================
    4. DRAWABLE (interfaz)                                       
    ============================================================= */
    public interface Drawable { void draw(); }
    public static class DrawableCircle implements Drawable { @Override public void draw() { System.out.println("Dibujando un círculo."); } }
    public static class Square          implements Drawable { @Override public void draw() { System.out.println("Dibujando un cuadrado."); } }
    public static class Triangle        implements Drawable { @Override public void draw() { System.out.println("Dibujando un triángulo.");} }

    /* =============================================================
    5. EMPLOYEE (abstract)                                       
    ============================================================= */
    public static abstract class Employee { public abstract double calculateSalary(); }
    public static class FullTimeEmployee extends Employee {
        private final double monthlySalary;
        public FullTimeEmployee(double monthlySalary) { this.monthlySalary = monthlySalary; }
        @Override public double calculateSalary() { return monthlySalary; }
    }
    public static class PartTimeEmployee extends Employee {
        private final double hourlyRate; private final int hoursWorked;
        public PartTimeEmployee(double hourlyRate, int hoursWorked) { this.hourlyRate = hourlyRate; this.hoursWorked = hoursWorked; }
        @Override public double calculateSalary() { return hourlyRate * hoursWorked; }
    }

    /* =============================================================
    6. MOVABLE (interfaz)                                        
    ============================================================= */
    public interface Movable { void move(); }
    public static class Car   implements Movable { @Override public void move() { System.out.println("El coche se mueve por carretera."); } }
    public static class Robot implements Movable { @Override public void move() { System.out.println("El robot se desplaza sobre ruedas."); } }

    /* =============================================================
    7. APPLIANCE (abstract)                                      
    ============================================================= */
    public static abstract class Appliance { public abstract void turnOn(); public abstract void turnOff(); }
    public static class TV extends Appliance {
        @Override public void turnOn()  { System.out.println("Encendiendo la TV."); }
        @Override public void turnOff() { System.out.println("Apagando la TV.");   }
    }
    public static class WashingMachine extends Appliance {
        @Override public void turnOn()  { System.out.println("Encendiendo la lavadora."); }
        @Override public void turnOff() { System.out.println("Apagando la lavadora.");   }
    }

    /* =============================================================
    8. FLYABLE & SWIMMABLE (interfaces múltiples)                
    ============================================================= */
    public interface Flyable  { void fly();  }
    public interface Swimmable{ void swim(); }
    public static class Duck implements Flyable, Swimmable {
        @Override public void fly()  { System.out.println("El pato está volando."); }
        @Override public void swim() { System.out.println("El pato está nadando."); }
    }

    /* =============================================================
    9. DOCUMENT (abstract)                                       
    ============================================================= */
    public static abstract class Document { public abstract void print(); }
    public static class PDFDocument  extends Document { @Override public void print() { System.out.println("Imprimiendo documento PDF.");   } }
    public static class WordDocument extends Document { @Override public void print() { System.out.println("Imprimiendo documento de Word.");} }

    /* =============================================================
    10. PAYABLE (interfaz)                                       
    ============================================================= */
    public interface Payable { void pay(); }
    public static class Invoice         implements Payable { @Override public void pay() { System.out.println("Pagando la factura.");   } }
    public static class EmployeePayment implements Payable { @Override public void pay() { System.out.println("Pagando al empleado."); } }

    /* =============================================================
    MÉTODOS DE PRUEBA (privados para ordenar el main)            
    ============================================================= */
    private static void testShapes()      { System.out.printf("Área círculo: %.2f%n", new Circle(5).calculateArea()); System.out.printf("Área rectángulo: %.2f%n", new Rectangle(4,6).calculateArea()); }
    private static void testPlayable()    { new Guitar().play(); new Piano().play(); }
    private static void testAnimals()     { demonstratePolymorphism(); }
    private static void testDrawable()    { new DrawableCircle().draw(); new Square().draw(); new Triangle().draw(); }
    private static void testEmployees()   { System.out.printf("Salario FTE: %.2f%n", new FullTimeEmployee(3000).calculateSalary()); System.out.printf("Salario PTE: %.2f%n", new PartTimeEmployee(20,80).calculateSalary()); }
    private static void testMovable()     { new Car().move(); new Robot().move(); }
    private static void testAppliances()  { Appliance tv = new TV(); Appliance wm = new WashingMachine(); tv.turnOn(); tv.turnOff(); wm.turnOn(); wm.turnOff(); }
    private static void testDuck()        { Duck d = new Duck(); d.fly(); d.swim(); }
    private static void testDocuments()   { new PDFDocument().print(); new WordDocument().print(); }
    private static void testPayable()     { new Invoice().pay(); new EmployeePayment().pay(); }

    /* =============================================================
    MÉTODO MAIN (ejecución secuencial)                           
    ============================================================= */
    public static void main(String[] args) {
        System.out.println("\n=== 1. SHAPE ===");          testShapes();
        System.out.println("\n=== 2. PLAYABLE ===");       testPlayable();
        System.out.println("\n=== 3. ANIMAL ===");         testAnimals();
        System.out.println("\n=== 4. DRAWABLE ===");       testDrawable();
        System.out.println("\n=== 5. EMPLOYEE ===");       testEmployees();
        System.out.println("\n=== 6. MOVABLE ===");        testMovable();
        System.out.println("\n=== 7. APPLIANCE ===");      testAppliances();
        System.out.println("\n=== 8. DUCK ===");           testDuck();
        System.out.println("\n=== 9. DOCUMENT ===");       testDocuments();
        System.out.println("\n=== 10. PAYABLE ===");       testPayable();
    }
}
