package recyclingYard1;

public class Yard {
    public static void main(String[] args) {
        Carton carton1 = new Carton(.5);
        Can can1 = new Can(.1);

        System.out.println("yard 1");

        recycle(new Object[]{carton1, can1});
    }

    public static void recycle(Object[] objs) {
        for (Object obj : objs) {
            if (obj instanceof Carton) {
                ((Carton) obj).soak();
            } else if (obj instanceof Can) {
                ((Can) obj).melt();
            }
        }
    }
}
