package com.example.vehicles;
public class Vehicle {
    private String brand;
    private int productionYear;

    public Vehicle(String brand, int productionYear) {//konstruktor inicjalizuje obiekt Vehicle z polami marki i roku produkcji
        this.brand = brand;
        this.productionYear = productionYear;
    }

    // metody dostępowe zwracające i ustawiające marke i rok produkcji,

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() { //przesłoniecie toString()
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}