package com.example.school;

import java.util.*; //importowanie wykorzystywanych klas

public class PrimaryStudent extends com.example.school.Student { //PrimaryStudent dziedziczy po Student z package com.example.school
    private String schoolLevel; // dodatkowe pole dla primarystudent określające poiom szkoły, dostępne tylko wewnątrz klasy
    private java.util.List<Integer> grades; // pole oceny jako lista liczb całkowitych Integer [dodawanie porzez grades.add("ocena jako int")] j/w tylko wewnątrz klasy
    // private zapewnia hermetyzacje
    public PrimaryStudent(String firstName, String lastName, int studentId, String schoolLevel) {
        super(firstName, lastName, studentId); //wywołanie konstruktora z klasy bazowej
        this.schoolLevel = schoolLevel; //iinicjalizacja dodtkowych pól klasy
        this.grades = new java.util.ArrayList<>();
    }
    public void enterDataPS() { //wprowadzanie danych z konsoli za pomocą metody scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter schoolLevel:");
        this.schoolLevel = scanner.nextLine();
    }
    public void addGrade(int grade) {
        grades.add(grade);
    } // dodawanie ocen

    public double calculateAverageGrade() { //metoda obliczania sreeniej
        if (grades.isEmpty()) { //warunek jeśli puste średnia 0.0
            return 0.0;
        }

        int sum = 0; // oblicznie sredniej z liczb
        for (int grade : grades) { //for each dodaje wszystkie liczby z listy do sum
            sum += grade;
        }

        return (double) sum / grades.size(); // suma z for each dzielona przez liczbe elementów zliczonych metodą .size() z listy
    }

    @Override //przysłoniecie metody toString z klasy Student
    public String toString() {
        return "PrimaryStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", studentId='" + getStudentId() + '\'' +
                //", studentId='" + getStudentIdAsInt() + '\'' +
                ", schoolLevel='" + schoolLevel + '\'' +
                ", grades=" + grades +
                '}';
    }
}
