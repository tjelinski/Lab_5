package com.example.vehicles;
public class Car extends Vehicle { // car dziedziczy po Veicle z package com.example.vehicles;
    private int numberOfDoors;
    private String engineType;

    public Car(String brand, int productionYear, int numberOfDoors, String engineType) {
        super(brand, productionYear); // //wywołanie kostryktora klasy bazowej
        this.numberOfDoors = numberOfDoors;
        this.engineType = engineType;
    }

    // metody dostępowe pobieraja i ustawiajaą pola klasy dotyczacej liczby dzrzwi ora typu silnika

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override // przesłoniecie toString()  z Vehicle
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", numberOfDoors=" + numberOfDoors +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}