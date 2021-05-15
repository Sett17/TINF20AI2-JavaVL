package products;

public class Cabrio extends Car {

    public Cabrio(String hersteller, String typ, Double breite, CarColor color) {
        super(hersteller, typ, breite, color);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("\tohne dach!");
    }
}
