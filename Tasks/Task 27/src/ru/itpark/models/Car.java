package ru.itpark.models;

public class Car {
    private int id;
    private String model;
    private int ownerId;

    public Car(String model, int ownerId) {
        this.model = model;
        this.ownerId = ownerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getOwnerId() {
        return ownerId;
    }

    @Override
    public String toString() {
        return  "id = " + id + ", model = " + model + ", owner's id = " + ownerId;
    }
}
