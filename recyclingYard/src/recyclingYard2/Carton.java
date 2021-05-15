package recyclingYard2;

public class Carton extends Trash {

    public Carton(double weight) {
        super(weight);
    }

    @Override
    public void recycle() {
        setWeight((getWeight() + Math.pow(getWeight(), 1.5)));
        System.out.println("soaked! weight now: " + String.format("%,.2f", getWeight()));
    }
}
