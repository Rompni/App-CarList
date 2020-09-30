package com.edu.unimagdalena.appmoviles.carlist_quiz;

public class Car {
    private String model;
    private String brand;
    private String plate;

    public Car(String model, String brand, String plate) {
        this.model = model;
        this.brand = brand;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "Modelo='" + model + '\'' +
                ", Marca='" + brand + '\'' +
                 ", Placa='" + plate + '\'' +
                '}';
    }
}
