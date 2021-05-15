package recyclingYard3;

public class Yard {
    public static void main(String[] args) {
        Carton carton1 = new Carton(.5);
        Can can1 = new Can(.1);
        Car panamera = new Car("Porsche", "Panamera", 1.937, "white");

        System.out.println("yard 3");

        recycle(new Recycable[]{carton1, can1, panamera});
    }

    public static void recycle(Recycable[] objs) {
        for (Recycable obj : objs) {
            obj.recycle();
        }
    }
}
