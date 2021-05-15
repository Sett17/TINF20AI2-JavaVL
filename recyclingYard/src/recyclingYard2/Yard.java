package recyclingYard2;

public class Yard {
    public static void main(String[] args) {
        Carton carton1 = new Carton(.5);
        Can can1 = new Can(.1);

        System.out.println("yard 2");

        recycle(new Trash[]{carton1, can1});
    }

    public static void recycle(Trash[] objs) {
        for (Trash obj : objs) {
            obj.recycle();
        }
    }
}
