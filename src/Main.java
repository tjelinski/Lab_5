import java.util.*; //importowanie klas i pakietów
import com.example.people.Person;
import com.example.school.Student;
import com.example.school.PrimaryStudent;
import com.example.geometry.Figure;
import com.example.geometry.Square;
import com.example.geometry.Circle;
import com.example.vehicles.Car;
import com.example.vehicles.Motorcycle;
import com.example.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        //tworzenie obiektu Person
        Person newPerson = new Person("", "", 0);
        newPerson.enterData(); //wprowadzanie danych
        System.out.println("Person: " + newPerson);

        // tworzenie Student
        Student newStudent = new Student("", "", 0);
        newStudent.enterData(); //wprowadzanie danych
        System.out.println();
        newStudent.enterDataS();
        try {
            newStudent.setStudentId(newStudent.getStudentId()); //próba ustawienia StudentId jeśli nie prawidłowy następuje wyjątek
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Student: " + newStudent); //wyświetlenie w konsoli

        //utworzenie PrimaryStudent
        PrimaryStudent newPrimaryStudent = new PrimaryStudent("", "", 0, "" );
        newPrimaryStudent.enterData();
        newPrimaryStudent.enterDataPS();
        System.out.println("Primary Student: " + newPrimaryStudent);
        //System.out.println("Before adding grades:\n" + newPrimaryStudent);

        // Wywołanie metody addGrade() do dodania ocen
        newPrimaryStudent.addGrade(5);
        newPrimaryStudent.addGrade(4);
        newPrimaryStudent.addGrade(5);

        // Wyświetlenie informacji o uczniu po dodaniu ocen
        System.out.println("After adding grades:\n" + newPrimaryStudent); //wyświetlenie w konsoli
        System.out.println("Avarage: " + newPrimaryStudent.calculateAverageGrade()); // wyświetlenie średniej

        // tworzenie Square oraz Circle
        Square square = new Square("Square", "Red", 5.0);
        System.out.println("Square: " + square);
        System.out.println(square.calculateArea()); //obliczenie pola
        System.out.println(square.calculatePerimeter()); //obliczenie obwodu

        Circle circle = new Circle("Circle", "Blue", 3.0);
        System.out.println("Circle: " + circle);
        System.out.println(circle.calculateArea()); //obl.pola
        System.out.println(circle.calculateCircumference()); // obliczenie obwodu

        // utworzenie
        Vehicle vehicle = new Vehicle("Chevrolet", 2013);
        Car car = new Car("Chevrolet", 2011, 5, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Yamaha", 2002, "Chain", 600.0);

        // Casting examples
        try {
            Vehicle vehicle2 = car;  // rzutowanie w gore każdy obiekt car jrst również obiektem typu Vehicle
            System.out.println("Upcasting successful: Vehicle -> Car");
            Car car2 = (Car) vehicle2;  // rzutowanie w dół, obiekt może byc innego typu, użycei (Car) - operator rzutowania przekazuej inf. o rzutowaniu do kompilatora
            System.out.println("Downcasting successful: Vehicle -> Car");
            Vehicle vehicle3 = motorcycle;  // rzutowanie w gore
            System.out.println("Upcasting successful: Vehicle -> Motorcycle");
            Motorcycle motorcycle2 = (Motorcycle) vehicle3;  // rzutowanie w dół, operator rzutowania (Motorcycle)
            System.out.println("Downcasting successful: Vehicle -> Motorcycle");
        } catch (ClassCastException e) { //obsługa wyjątku ClassCastException  dgy rzutujemy w dół na typ nie jest zgodny z rzeczywistym typem/nieudane rzutowanie [e - exeption]

            //wyświetlenie wyjątu za pomocą getMessage() jest metodą dostępową dostępną w klasie Throwable, która jest bazową klasą dla wszystkich wyjątków w języku Java. Metoda ta zwraca opis tekstowy wyjątku
            System.out.println("Error during casting: " + e.getMessage());
        }
    }
}
