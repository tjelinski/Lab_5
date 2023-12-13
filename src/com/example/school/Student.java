package com.example.school;

import java.util.*; //importowanie wykorzystywanych klas

public class Student extends com.example.people.Person { // Student dziedziczy po Person z package com.example.people
    private int studentId; //deklaracja pola klasy Student

    public Student(String firstName, String lastName, int studentId) {
        super(firstName, lastName, 0); // wywołanie konstruktora klasy bazowej
        this.studentId = studentId; // inicjalizacja pola podaniem argumentu
    }
    public void enterDataS() { //wprowadzanie danych poprzez scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter studentId:");

        try {
            this.studentId = scanner.nextInt(); //przypisanie wartości ze strumienia wejściowego do  pola studentId
        } catch (InputMismatchException e) { //obsługa wyjątku gdy wprowadzimy złe dane uruchomi sie kod wewnątrz bloku wyświetlając komunikat o wpr. poprawnych danych
            System.out.println("Invalid input. Please enter a valid integer for studentId.");
            scanner.nextLine(); // Konsumuje błędne dane wejściowe
            enterDataS(); // Rekurencyjnie [wywołując sama siebie] ponawia próbę wprowadzenia danych z konsoli
        }
    }

    // zwracanie pola studentId oraz logika sprawdzająca

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        // sprawdzamy czy studentId zawiera tylko cycfry
        if (String.valueOf(studentId).matches("\\d+")) { //konwersja int do String i sprawdzenie za pomocą \\d+ czy ciąg znaków zawiera jeden czy więcej znaków i są to tylko cyfry [\\d zakres 0-9 / + jedno lub wiecej wystąpien]
            this.studentId = studentId; //przypisanie wartości do pola po spelnieniu warunku
        } else { //inaczej realizowany kod z komunikatem
            System.out.println("Invalid student ID. It should contain only digits.");
        }
    }
    // inf. dla kompilatora, ze metoda ma przesłonić/nadpisać metodę toString() z klasy nadrzędnej
    @Override
    public String toString() { //przesłania metode z klasy Person
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
