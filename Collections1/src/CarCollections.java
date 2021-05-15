import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CarCollections {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car("Porsche", "Panamera", 1.937, Car.CarColor.WHITE),
                new Car("VW", "Golf", 1.795, Car.CarColor.RED),
                new Car("BMW", "M3", 1.780, Car.CarColor.BLUE),
                new Car("Mercedes", "G63", 1.885, Car.CarColor.BLACK),
                new Car("Mercedes", "AMG GT", 2.007, Car.CarColor.GREEN));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
