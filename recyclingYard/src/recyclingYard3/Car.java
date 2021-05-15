package recyclingYard3;

import java.util.Objects;

public class Car implements Recycable {
    private static int wheels = 4;
    private static int instanceCounter = 0;
    private String hersteller;
    private String typ;
    private Double breite;
    private String color;

    public Car(String hersteller, String typ, Double breite, String color) {
        this.hersteller = hersteller;
        this.typ = typ;
        this.breite = breite;
        this.color = color;
        instanceCounter++;
    }

    public void paintCar(String newColor) {
        color = newColor;
        System.out.println("products.Car is now " + color);
    }

    public void drive() {
        System.out.println("brumm brumm!");
    }

    public void paintCar() {
        paintCar("black");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        Car.wheels = wheels;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Double getBreite() {
        return breite;
    }

    public void setBreite(Double breite) {
        this.breite = breite;
    }

    public String getColor() {
        return color;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    @Override
    public String toString() {
        return "products.Car{" +
                "hersteller='" + hersteller + '\'' +
                ", typ='" + typ + '\'' +
                ", breite=" + breite +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(getHersteller(), car.getHersteller()) && Objects.equals(getTyp(), car.getTyp()) && Objects.equals(getBreite(), car.getBreite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHersteller(), getTyp(), getBreite());
    }

    @Override
    public void recycle() {
        System.out.println("car recycled!");
    }
}
