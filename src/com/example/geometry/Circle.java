package com.example.geometry;
public class Circle extends Figure { //circle dziedziczy po Figure z package com.example.geometry
    private double radius; // deklaracja pola promien

    public Circle(String name, String color, double radius) { //konstruktor
        super(name, color); //wywołanie kostryktora klasy bazowej
        this.radius = radius; // inicjalizacja pola promien
    }

    // metody obliczania pola powierzchni i obwodu [wykorzystanie stałej Math.PI]

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius; //
    }

    @Override
    public String toString() { //przesłoniecie toString() z Figure
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", radius=" + radius +
                '}';
    }
}