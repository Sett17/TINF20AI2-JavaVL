import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollections {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car("Porsche", "Panamera", 1.937, Car.CarColor.WHITE),
                new Car("VW", "Golf", 1.795, Car.CarColor.RED),
                new Car("BMW", "M3", 1.780, Car.CarColor.BLUE),
                new Car("Mercedes", "G63", 1.885, Car.CarColor.BLACK),
                new Car("Mercedes", "AMG GT", 2.007, Car.CarColor.GREEN),
                new Car("Opel", "Astra", 1.809, Car.CarColor.WHITE),
                new Car("Ford", "Escort", 1.700, Car.CarColor.RED),
                new Car("Hyundai", "i30", 1.780, Car.CarColor.GREEN));
        printCars(cars);
        Collections.sort(cars);
        printCars(cars);
        cars.sort(Comparator.comparing(Car::getBreite));
//        Collections.sort(cars, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.getBreite().compareTo(o2.getBreite());
//            }
//        });
    }

    public static void printCars(List<Car> cars) {
        System.out.println("all cars:");
        cars.forEach(System.out::println);
    }
}
