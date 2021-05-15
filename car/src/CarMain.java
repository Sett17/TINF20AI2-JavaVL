import products.Cabrio;
import products.Car;

import static products.Car.*;

public class CarMain {
    public static void main(String[] args) {
        Car panamera = new Car("Porsche", "Panamera", 1.937, CarColor.WHITE);
        Car golf = new Car("VW", "Golf", 1.795, CarColor.RED);
        Car m3 = new Car("BMW", "M3", 1.780, CarColor.BLUE);
        Car g63 = new Car("Mercedes", "G63", 1.885, CarColor.BLACK);
        Cabrio gt = new Cabrio("Mercedes", "AMG GT Cabriolet", 2.007, CarColor.GREEN);

        PolyDemo.reisen(panamera);
        PolyDemo.reisen(golf);
        PolyDemo.reisen(m3);
        PolyDemo.reisen(g63);
        PolyDemo.reisen(gt);
    }
}
