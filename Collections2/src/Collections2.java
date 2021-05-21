public class Collections2 {
    public static void main(String[] args) {
        VehicleManager<Car> manager = new VehicleManager<>();

        manager.add(new Car("Porsche", "Panamera", 1.937, Car.CarColor.RED));
        manager.add(new Car("VW", "Golf", 1.795, Car.CarColor.WHITE));
        manager.add(new Car("BMW", "M3", 1.780, Car.CarColor.BLUE));
        manager.add(new Car("Mercedes", "G63", 1.885, Car.CarColor.BLACK));
        manager.add(new Car("Mercedes", "AMG GT", 2.007, Car.CarColor.GREEN));

        for (int i = 0; i < manager.getSize(); i++) {
            System.out.println(manager.get(i));
        }

        manager.paintAll(Car.CarColor.BLUE);

        for (int i = 0; i < manager.getSize(); i++) {
            System.out.println(manager.get(i));
        }
    }
}
