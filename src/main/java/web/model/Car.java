package web.model;

public class Car {

    private String brand;
    private String colour;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String brand, String colour, int age) {
        this.brand = brand;
        this.colour = colour;
        this.yearOfProduction = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + brand + '\'' +
                ", color='" + colour + '\'' +
                ", age=" + yearOfProduction +
                '}';
    }
}
