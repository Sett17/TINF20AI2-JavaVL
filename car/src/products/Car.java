package products;

import java.util.Objects;

public class Car {
    private static int wheels = 4;
    private static int instanceCounter = 0;
    private String hersteller;
    private String typ;
    private Double breite;
    private CarColor color;

    public enum CarColor {
        WHITE(0), BLUE(34), RED(31), BLACK(7), GREEN(32);

        private final int seq;

        CarColor(int i) {
            seq = i;
        }
    }

    public Car(String hersteller, String typ, Double breite, CarColor color) {
        this.hersteller = hersteller;
        this.typ = typ;
        this.breite = breite;
        this.color = color;
        instanceCounter++;
    }

    public void paintCar(CarColor newColor) {
        color = newColor;
        System.out.println("\u001B["+color.seq+"mCar is now " + color + "\u001B[0m");
    }

    public void drive() {
        System.out.println("\u001B[" + color.seq + "mbrumm brumm!\u001B[0m");
    }

    public void paintCar() {
        paintCar(CarColor.BLACK);
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

    public CarColor getColor() {
        return color;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    @Override
    public String toString() {
        return "\u001B["+color.seq+"mCar{" +
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
}
