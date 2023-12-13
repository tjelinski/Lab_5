package com.example.geometry;
public class Figure {
    private String name;
    private String color;

    public Figure(String name, String color) { // konstruktor
        this.name = name;
        this.color = color;
    }

    // gettery i settery umożliwiają na dostęp do prywatnych pól klasy [name oraz color]

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override // przełoniecie toString() z klasy Object
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}