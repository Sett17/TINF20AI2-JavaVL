import java.util.ArrayList;

public class VehicleManager<T extends Car> {
    private final ArrayList<T> vehicleList = new ArrayList<>();
    private int size = 0;

    public boolean add(T vehicle) {
        size++;
        return vehicleList.add(vehicle);
    }

    public T get(int index) {
        return vehicleList.get(index);
    }

    public void paintAll(Car.CarColor col) {
        for (T vehicle : vehicleList) {
            vehicle.paintCar(col);
        }
    }

    public int getSize() {
        return size;
    }
}
