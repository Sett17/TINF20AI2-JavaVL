package recyclingYard3;

public class Can extends Trash implements Recycable {

    public Can(double weight) {
        super(weight);
    }

    @Override
    public void recycle() {
        System.out.println("melted! weight: " + getWeight());
    }
}
