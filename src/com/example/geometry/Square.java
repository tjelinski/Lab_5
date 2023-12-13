package com.example.geometry;

public class Square extends Figure { //squere dziedziczy po Figure z package com.example.geometry
    private double sideLength; // dodartkowe pole długoci boku

    public Square(String name, String color, double sideLength) { //konstruktor
        super(name, color); //wywołanie kostryktora klasy bazowej
        this.sideLength = sideLength; // inicjalizacja pola długość boku
    }

    // metody oblicznania powierzchni i obwodu

    public double calculateArea() { //pole
        return sideLength * sideLength;
    }

    public double calculatePerimeter() { //obwód
        return 4 * sideLength;
    }

    @Override
    public String toString() { // przesłkiniećie ctoString() z Figure
        return "Square{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", sideLength=" + sideLength +
                '}';
    }
}
