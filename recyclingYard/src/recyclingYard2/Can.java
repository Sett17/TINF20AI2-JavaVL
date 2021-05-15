package recyclingYard2;

public class Can extends Trash {

    public Can(double weight) {
        super(weight);
    }

    @Override
    public void recycle() {
        System.out.println("melted! weight now: " + getWeight());
    }
}
