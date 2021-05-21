import java.util.Arrays;
import java.util.List;

public class Lambdas1 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car("Porsche", "Panamera", 700, 1.937, Car.CarColor.RED),
                new Car("VW", "Golf", 320, 1.795, Car.CarColor.WHITE),
                new Car("BMW", "M3", 431, 1.780, Car.CarColor.BLUE),
                new Car("Mercedes", "G63", 585, 1.885, Car.CarColor.BLACK),
                new Car("Mercedes", "AMG GT", 730, 2.007, Car.CarColor.GREEN));

        cars.forEach(System.out::println);
        cars.forEach(car -> car.setPs(car.getPs() + 20));
        System.out.println();
        cars.forEach(System.out::println);
    }
}
