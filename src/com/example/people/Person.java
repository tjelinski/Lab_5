package com.example.people;

import java.util.*; //importowanie wykorzystywanych klas

public class Person { //deklaracja klasy
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) { //konstruktor klasy
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /* metody dostępowe do pól klasy , odczyt (get) i ustawianie (set) wartości pól obiektu,
    pola prywatne można bezpiecznie odczytywać i aktualizować ich wartości*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // metoda do wprowadzania danych z konsoli za pomocą scanner
    public void enterData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        this.lastName = scanner.nextLine();

        System.out.println("Enter age:");
        this.age = scanner.nextInt();

    }

    // inf. dla kompilatora, ze metoda ma przesłonić/nadpisać metodę toString()
    @Override
    public String toString() { // ma przesłonić metode toString() z klasy Object, wyswietla informacje o obiekcie
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
