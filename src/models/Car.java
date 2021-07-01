package models;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long SERIAL_VERSION_UID = 234355L;
    private String model;
    private int year;
    private String color;

    public Car(){}

    private static class SingletonHelper{
        private static final Car INSTANCE = new Car();
    }

    public static Car getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private Object readResolve() {
        return getInstance();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
