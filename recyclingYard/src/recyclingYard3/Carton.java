package recyclingYard3;

public class Carton extends Trash implements Recycable {

    public Carton(double weight) {
        super(weight);
    }

    @Override
    public void recycle() {
//        setWeight((getWeight() + Math.pow(getWeight(), 1.5)));
        System.out.println("soaked! weight: " + String.format("%,.2f", getWeight()));
    }
}
