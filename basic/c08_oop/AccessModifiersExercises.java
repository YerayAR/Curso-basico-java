package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class AccessModifiersExercises {

    public static void main(String[] args) {

        //Prueba todas las clases
        Person person = new Person();
        person.setName("Juan");
        person.setAge(30);
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());
        Product product = new Product();
        product.setPrice(100.0);
        System.out.println("Precio: " + product.getPrice());
        BankAccount account = new BankAccount();
        account.deposit(200.0);
        System.out.println("Saldo: " + account.getBalance());
        account.withdraw(50.0);
        System.out.println("Saldo después del retiro: " + account.getBalance());
        Book book = new Book("Java Programming");
        System.out.println("Título del libro: " + book.getTitle());
        User user = new User();
        user.setUsername("usuario123");
        user.setPassword("contraseñaSegura");
        System.out.println("Usuario: " + user.getUsername());
        System.out.println("Contraseña correcta: " + user.checkPassword("contraseñaSegura"));
        Employee employee = new Employee();
        employee.setSalary(3000.0);
        System.out.println("Salario inicial: " + employee.getSalary()); 
        employee.raiseSalary(10);
        System.out.println("Salario después del aumento: " + employee.getSalary());
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5.0);
        rectangle.setHeight(10.0);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
        System.out.println("Perímetro del rectángulo: " + rectangle.calculatePerimeter());
        Student student = new Student();
        student.setGrade(75);
        System.out.println("¿Aprobado? " + student.isPassed());
        Car car = new Car();
        car.accelerate(50);
        System.out.println("Velocidad del coche: " + car.getSpeed());
        car.brake(20);
        System.out.println("Velocidad del coche después de frenar: " + car.getSpeed());

    }

    // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
    public static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("La edad debe ser mayor a 0.");
            }
        }
    }

    // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
    public static class Product {
        private double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("El precio debe ser mayor a 0.");
            }
        }
    }

    // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
    public static class BankAccount {
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("El monto a depositar debe ser mayor a 0.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("El monto a retirar debe ser mayor a 0 y no puede exceder el saldo.");
            }
        }
    }

    // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
    public static class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
    public static class User {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean checkPassword(String inputPassword) {
            return this.password.equals(inputPassword);
        }
    }

    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
    public static class Employee {     
        private double salary;

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary > 0) {
                this.salary = salary;
            } else {
                System.out.println("El salario debe ser mayor a 0.");
            }
        }

        public void raiseSalary(double percent) {
            if (percent > 0) {
                this.salary += this.salary * (percent / 100);
            } else {
                System.out.println("El aumento debe ser positivo.");
            }
        }
    }

    // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
    public static class Rectangle {
        private double width;
        private double height;

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double calculateArea() {
            return width * height;
        }

        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }

    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
    public static class Student {
        private int grade;

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public boolean isPassed() {
            return grade >= 60;
        }
    }

    // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    public static class Car {
        private int speed;

        public void accelerate(int amount) {
            if (speed + amount <= 120) {
                speed += amount;
            } else {
                speed = 120;
            }
        }

        public void brake(int amount) {
            if (speed - amount >= 0) {
                speed -= amount;
            } else {
                speed = 0;
            }
        }

        public int getSpeed() {
            return speed;
        }
    }
    
}
