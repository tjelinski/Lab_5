package com.example.vehicles;
public class Motorcycle extends Vehicle { // Motorcycle dziedziczy po Vehicle
    private String driveType;
    private double engineCapacity;

    public Motorcycle(String brand, int productionYear, String driveType, double engineCapacity) {
        super(brand, productionYear); //wywołanie kostryktora klasy bazowej
        this.driveType = driveType;
        this.engineCapacity = engineCapacity;
    }

    // dostępy  pobieraja i ustawiają pojemość oraz typ napędu

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override // przesłoniecie toString()  z Vehicle
    public String toString() {
        return "Motorcycle{" +
                "brand='" + getBrand() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", driveType='" + driveType + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}